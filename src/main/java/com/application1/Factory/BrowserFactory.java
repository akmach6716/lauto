package com.application1.Factory;

import com.application1.dataProvider.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserFactory {
    public static WebDriver driver;

    public static WebDriver startBrowser(String Browsername, String appURL) {
        if (Browsername.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            System.out.println("The URL passed is "+appURL);

        } else {
            System.out.println("Only implementing Chrome browser ,enter 'chrome' only ");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Long.parseLong(ConfigReader.getProperty("pageLoadTimeOut"))));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(ConfigReader.getProperty("implicitWait"))));
        driver.get(appURL);

        return driver;
    }
}
