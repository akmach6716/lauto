package practicceUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class BrokenLinks {
    public static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        Set<String> workingURL= new HashSet<String>();
        Set<String> brokenURL= new HashSet<String>();
       // driver.get("https://freelance-learn-automation.vercel.app/login");
        driver.get("https://www.amazon.in/");
        //xpath for social media links without using class : //h2[contains(text(),'Connect with us')]/following-sibling::div//a
        //List<WebElement> socialLinks = driver.findElements(By.xpath("//h2[contains(text(),'Connect with us')]/following-sibling::div//a"));
        List<WebElement> allLinks =driver.findElements(By.tagName("a"));
        for (WebElement link : allLinks) {
            System.out.println(link.getDomAttribute("href"));
            int code=checkBrokenLinks(link.getDomAttribute("href"));
            if(code==999|| code>=200 && code<400)
            {
                workingURL.add(link.getDomAttribute("href"));
                System.out.println("Url added into wokring set : ");
            }else
            {
                brokenURL.add(link.getDomAttribute("href"));
                System.out.println("Url added into broken url set :" );
            }
        }
        System.out.println(workingURL+" is the working URL set");
        System.out.println(brokenURL+" is the broken  URL set");
    }
    public static int checkBrokenLinks(String url)
    {  int code=0;
        try {
            URL appurl = new URL(url);
            HttpURLConnection urlConnection = (HttpURLConnection) appurl.openConnection();
            urlConnection.connect();
            System.out.println("Response code is _ "+urlConnection.getResponseCode());
            code=urlConnection.getResponseCode();
        } catch (IOException e) {
                System.out.println("Runtime connection failed : "+e.getMessage());

        } catch(Exception e)
        {
            System.out.println("Something went wrong : "+e.getMessage());
        }

return code;
    }
}
