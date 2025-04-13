package com.application1.dataProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Properties;
public class ConfigReader {
    public static String getProperty(String key) {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(new File("./Config/Config.properties")));
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Could not read the file " + e.getMessage());
        }
        return prop.getProperty(key);

    }
}

