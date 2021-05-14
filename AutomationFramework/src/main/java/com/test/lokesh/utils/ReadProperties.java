package com.test.lokesh.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    private  static final Logger log = LoggerFactory.getLogger(ReadProperties.class.getName());
    protected static Properties properties = new Properties();

    public static String getFromPropertyFile(String key){
        String value= null;
        try {
            properties.load(new FileInputStream("src/main/resources/env.properties"));
            value =  properties.getProperty(key);
        } catch (IOException e) {
            log.error("Please review your properties file");
        }
        return value;
    }
}
