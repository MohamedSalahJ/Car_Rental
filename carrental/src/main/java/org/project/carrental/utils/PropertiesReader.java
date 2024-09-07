package org.project.carrental.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class PropertiesReader {

    public static Properties getProperties(String filepath ){

        Properties properties=new Properties();
try(BufferedReader reader=new BufferedReader(new FileReader(filepath))){
    System.out.println(reader);
} catch (FileNotFoundException e) {
    throw new RuntimeException(e);
} catch (IOException e) {
    throw new RuntimeException(e);
}
        return properties;
    }



}
