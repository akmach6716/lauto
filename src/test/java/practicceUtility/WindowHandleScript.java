package practicceUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowHandleScript {
    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://freelance-learn-automation.vercel.app/login");
        //xpath for social media links without using class : //h2[contains(text(),'Connect with us')]/following-sibling::div//a
        List<WebElement> socialLinks = driver.findElements(By.xpath("//h2[contains(text(),'Connect with us')]/following-sibling::div//a"));
        for (WebElement link : socialLinks) {
            link.click();
        }
        String parent = driver.getWindowHandle();
        System.out.println("parent window handle : " + parent);
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Windowhandles are : "+driver.getWindowHandles());
        Iterator<String> ite = windows.iterator();
        while (ite.hasNext()) {

                driver.switchTo().window(ite.next());
                System.out.println("Url for the current page is : " + driver.getCurrentUrl());
                System.out.println("Title  for the current page is : " + driver.getTitle());
                driver.close();


        }

    }
}
