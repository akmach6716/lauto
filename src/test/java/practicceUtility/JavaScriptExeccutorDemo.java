package practicceUtility;

import com.sun.jdi.PathSearchingVirtualMachine;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class JavaScriptExeccutorDemo {
    public static WebDriver driver;
    public static void main(String[] args) {
        driver= new ChromeDriver();
        driver.get("https://freelance-learn-automation.vercel.app/login");
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        System.out.println("X coordinate is : "+driver.findElement(By.id("email1")).getLocation().getX());
        System.out.println("y coordinate is : "+driver.findElement(By.id("email1")).getLocation().getY());
        jse.executeScript("document.getElementById(\"email1\").value='Value given by Browser Console through Java Script'");
        File elesrc= driver.findElement(By.id("email1")).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(elesrc, new File(System.getProperty("user.dir")+"\\Screenshots\\elescreenshot"+DateExample.geturrentDate()+".png"));
        } catch (IOException e) {
            System.out.println("Not able to capture the element screenshot "+e.getMessage());
        }

    }
    public static void highlightElement(WebDriver driver, By locator)
    {

    }
}
