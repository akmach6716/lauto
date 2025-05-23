package practicceUtility;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Cookies {
    public static WebDriver driver;
    public static void main(String[] args) {
        driver= new ChromeDriver();
        driver.get("https://www.youtube.com/");
        Set<Cookie> cookies=driver.manage().getCookies();
        for(Cookie ck: cookies)
        {
            System.out.println("The cookie - "+ck.getName()+"--with the value : "+ck.getValue());
        }

        System.out.println("number of the cookies are "+driver.manage().getCookies().size());
        driver.quit();
    }
}
