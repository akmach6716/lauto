package practicceUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleFrames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        List<WebElement> frames =driver.findElements(By.xpath("//iframe"));
        System.out.println("No of iframes in the page are : "+frames.size());
        for(int i=0; i< frames.size(); i++)
        {
            driver.switchTo().frame(i);
            System.out.println(driver.getTitle());
        }
        driver.quit();
    }


}
