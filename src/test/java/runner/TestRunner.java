package runner;

import connector.Hooks;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps" , "connector"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@regression"
)
public class TestRunner extends AbstractTestNGCucumberTests {
    @Parameters({"browserName"})
    @BeforeTest
    public void beforeTest(String browserName) {
        Hooks.setBrowser(browserName);
    }
}