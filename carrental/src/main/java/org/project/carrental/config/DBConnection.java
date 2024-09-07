package org.project.carrental.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.project.carrental.utils.PropertiesReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

    private  static final Logger logger= LogManager.getLogger();
    private  static final String PROPERTIES_DB_FILE="D:\\hibernate review\\CarRental\\Car_Rental\\carrental\\src\\main\\resources\\dbconnection.properties";

    private  static final String URL="JDBCUrl";
    private  static final String USER="postgressql.username";
    private  static final String PASSWORD="postgressql.password";

    private  String databaseUrl="";
    private  String databaseUser="";
    private  String databasePassword="";





    public DBConnection() {
        Properties properties= PropertiesReader.getProperties(PROPERTIES_DB_FILE);
        databaseUrl=properties.getProperty(URL);

        databaseUser=properties.getProperty(USER);
        databasePassword=properties.getProperty(PASSWORD);

    }


    public  Connection getConnetion() {
        Connection connection=null;
        try {


           connection= DriverManager.getConnection(databaseUrl,databaseUser,databasePassword);
            logger.info("Connected to "+connection.getCatalog()+" database");
        } catch (SQLException e) {
            logger.error("Unable To Connect To Database URL"+databaseUrl+" "+e);
        }

        return connection;
    }







}
