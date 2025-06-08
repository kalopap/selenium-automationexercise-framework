package com.automationexercise.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static{
        try{
            FileInputStream file = new FileInputStream("src/test/resources/config.properties");
            properties = new Properties();
            properties.load(file);
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException("Failed to load config.properties!");
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
