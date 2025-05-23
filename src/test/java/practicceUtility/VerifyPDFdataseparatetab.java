package practicceUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;

public class VerifyPDFdataseparatetab {
    public static void main(String[] args) throws InterruptedException, AWTException, IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://homeloans.sbi/");
        String url =driver.findElement(By.xpath("//a[@title='Home Loan Agreement']")).getAttribute("href");
        driver.findElement(By.xpath("//a[@title='Home Loan Agreement']")).click();
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String parentwindow=it.next();
        String childwindow=it.next();
        driver.switchTo().window(childwindow);
        URL pdfUrl = new URL(url);
        InputStream ip=pdfUrl.openStream();
        BufferedInputStream bf= new BufferedInputStream(ip);


    }
}
