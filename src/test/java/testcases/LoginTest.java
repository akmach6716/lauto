package testcases;

import com.application1.Pages.LoginPage;
import com.application1.base.BaseClass;
import com.application1.dataProvider.CustomDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
    @Test(dataProvider = "userData",dataProviderClass = CustomDataProvider.class)
    public void loginwithCredentials(String uname, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginwithCred(uname, password);


        Assert.assertTrue(loginPage.isLoggedIn());

        System.out.println("The message heading from the page is : - " + driver.findElement(By.xpath("//h1")).getText());
    }
}
