package com.exploratoryPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
    public static void main(String[] args) throws IOException {
        File src= new File("./Config/Config.properties");
        FileInputStream fis= new FileInputStream(src);
        Properties prop= new Properties();
        prop.load(new FileInputStream(new File("./Config/Config.properties")));
        prop.getProperty("browser");
        System.out.println(prop.getProperty("browser"));
    }
}
