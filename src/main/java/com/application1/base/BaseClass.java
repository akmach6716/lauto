package com.application1.base;
import com.application1.Factory.BrowserFactory;
import com.application1.dataProvider.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class BaseClass {
   public  WebDriver driver;
   @BeforeClass
    public void setUpApplication()
    {   System.out.println("Log:INFO - Starting the application");
        driver =BrowserFactory.startBrowser(ConfigReader.getProperty("browser"), ConfigReader.getProperty("appURL"));
        System.out.println("Log: INFO - Applicaton Started");
    }
    @AfterClass
    public void tearDownApplication()
    {  System.out.println("Log:INFO - closing the application");
        driver.quit();
        System.out.println("Log: INFO - Applicaton closed");
    }
}
