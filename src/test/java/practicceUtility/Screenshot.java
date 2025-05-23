package practicceUtility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class Screenshot {
    public static WebDriver driver;
    public static void main(String[] args) {
        driver= new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        TakesScreenshot ts= (TakesScreenshot)  driver;
       File src =ts.getScreenshotAs(OutputType.FILE);
        System.out.println("The path of the source : "+src.getAbsolutePath());
        System.out.println("The destination is : "+DateExample.geturrentDate());
        System.out.println("The project path is : "+System.getProperty("user.dir")+"\\Screenshots\\screenshot"+DateExample.geturrentDate());
        try {
            FileHandler.copy(src, new File(System.getProperty("user.dir")+"\\Screenshots\\screenshot"+DateExample.geturrentDate()+".png"));
        } catch (IOException e) {
            System.out.println("Not able to capture the screenshot "+e.getMessage());
        }
File elesrc= driver.findElement(By.xpath("//button[contains(text(),'Checkout here')]")).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(elesrc, new File(System.getProperty("user.dir")+"\\Screenshots\\elescreenshot"+DateExample.geturrentDate()+".png"));
        } catch (IOException e) {
            System.out.println("Not able to capture the element screenshot "+e.getMessage());
        }

    }}
