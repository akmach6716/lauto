package testRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="C:/Users/akmac/IdeaProjects/lauto/src/main/resources/FeatureFiles/Login.feature",
        glue = {"com.application1.SepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"},
        monochrome = true,
        tags = " @smoke",
        dryRun = true)
public class TestRunnerwithTestng  extends AbstractTestNGCucumberTests {
}
