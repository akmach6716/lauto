package practicceUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryCalendar {

    public static WebDriver driver;
    public static void main(String[] args) {
        driver= new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
}}
