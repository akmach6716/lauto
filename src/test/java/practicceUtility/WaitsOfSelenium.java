package practicceUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsOfSelenium {
    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));


    }
}
