<<<<<<< HEAD
package org.project.carrental.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Properties;

public class PropertiesReader {
    private  static final Logger logger= LogManager.getLogger();

    public static Properties getProperties(String filepath ){

        Properties properties=new Properties();
try(BufferedReader reader=new BufferedReader(new FileReader(filepath))){
    properties.load(reader);
    logger.info("Done Reading From The File:" +filepath);
} catch (FileNotFoundException e) {
    logger.error("Error Reading From File: "+filepath+e);
} catch (IOException e) {
    logger.error("while Reading From File: "+filepath+e);
}
        return properties;
    }



}
=======
package org.project.carrental.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Properties;

public class PropertiesReader {
    private  static final Logger logger= LogManager.getLogger();

    public static Properties getProperties(String filepath ){

        Properties properties=new Properties();
try(BufferedReader reader=new BufferedReader(new FileReader(filepath))){
    properties.load(reader);
    logger.info("Done Reading From The File:" +filepath);
} catch (FileNotFoundException e) {
    logger.error("Error Reading From File: "+filepath+e);
} catch (IOException e) {
    logger.error("while Reading From File: "+filepath+e);
}
        return properties;
    }



}
>>>>>>> 97e1aa01ed5a79ab7b921766b174b03666b83690
