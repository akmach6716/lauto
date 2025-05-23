package practicceUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OptionsDemo {
    public static  WebDriver driver;

    public static void main(String[] args) {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("-headless=new");
        driver= new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println("Title of the page is : "+driver.getTitle());
        System.out.println(options.getCapabilityNames());

    }
}
