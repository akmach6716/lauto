package com.application1.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
public class LoginPage {
    protected WebDriver driver;
    public LoginPage(WebDriver driver)
    { this.driver= driver;
    }
   private  By userName=By.id("email1");
   private  By password= By.id("password1");
   private  By submitbutton= By.className("submit-btn");
   private By header = By.xpath("//h1");

    public void loginwithCred(String uname,String pwd)
    {
         driver.findElement(userName).sendKeys(uname);
         driver.findElement(password).sendKeys(pwd);
         driver.findElement(submitbutton).click();
    }
    public boolean isLoggedIn()
    {
        boolean status =false;
        try {
            driver.findElement(header).isDisplayed();
            status= true;
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
        return status;
    }

}
