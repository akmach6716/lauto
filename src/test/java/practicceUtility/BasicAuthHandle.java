package practicceUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class BasicAuthHandle {
    public static WebDriver driver;
    public static void main(String[] args) {
        driver= new ChromeDriver();
        DevTools devTools =((ChromeDriver)driver).getDevTools();
        //devTools.


    }
}
