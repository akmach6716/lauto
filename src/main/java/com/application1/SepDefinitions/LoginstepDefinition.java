package com.application1.SepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.time.Duration;
public class LoginstepDefinition {
    WebDriver driver;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://example.com");
        driver.manage().window().maximize();
        System.out.println("Log:INFO - Starting the application");
    }
    @After
    public void tearDown() {
        driver.quit();
        System.out.println("Log: INFO - Applicaton closed");
    }

    @Given("I am on the home page and able to access application")
    public void i_am_on_the_home_page_and_able_to_access_application() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://freelance-learn-automation.vercel.app/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println("Log: INFO - Applicaton Started");

    }

    @When("I enter a valid username as {string}")
    public void i_enter_a_valid_username_as(String userName) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("email1")).sendKeys(userName);
    }

    @And("password as {string}")
    public void password_as(String password) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("password1")).sendKeys(password);
    }

    @And("user clicks on login button")
    public void user_clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.className("submit-btn")).click();
    }

    @Then("user should be able to access the dashboard")
    public void user_should_be_able_to_access_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(driver.findElement(By.xpath("//h4[@class='welcomeMessage']")).isDisplayed());
    }
}
