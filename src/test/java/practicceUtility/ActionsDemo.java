package practicceUtility;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
    public static WebDriver driver;
    public static void main(String[] args) {
        driver= new ChromeDriver();
        driver.get("https://freelance-learn-automation.vercel.app/login");
        Actions act= new Actions(driver);
        act.moveToElement(driver.findElement(By.id("email1"))).click().sendKeys(Keys.SHIFT).sendKeys("Trying to write with ACtions commands").perform();

    }

}
