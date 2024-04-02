package connector;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;


public class Hooks {
    public static WebDriver driver;
    private static String browser;
    public static void setBrowser(String browser) {
        Hooks.browser = browser;
    }
    @Before

    public void openBrowser() {
        switch (browser) {
            case "Chrome" -> {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(chromeOptions);
            }
            case "Firefox" -> {
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(firefoxOptions);
            }
            case "Edge" -> {
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver(edgeOptions);
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}