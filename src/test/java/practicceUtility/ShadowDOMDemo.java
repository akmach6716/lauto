package practicceUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShadowDOMDemo {
public static WebDriver driver;
    public static void main(String[] args) {
        driver= new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
       SearchContext scontext =driver.findElement(By.xpath("//div[@id='userName']")).getShadowRoot();
      //  WebDriverWait wait= new (WebDriverWait) scontext;
    }
}
