package org.project.carrental;

import org.project.carrental.entity.Car;
import org.project.carrental.entity.User;
import org.project.carrental.entity.UserRole;
import org.project.carrental.utils.PropertiesReader;

import java.sql.*;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        User user1=new User(1,"mohamed","mohamed@luv2code.com",
//                "1111","Egypt",false, UserRole.ADMIN);
//
//
//        System.out.println(user1);

        Properties properties=PropertiesReader.getProperties("src\\main\\resources\\dbconnection.properties");
        try {
            Connection con= DriverManager.getConnection(properties.getProperty("JDBCUrl")
                    ,properties.getProperty("postgressql.username")
                    ,properties.getProperty("postgressql.password"));
            System.out.println("Connection Successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
