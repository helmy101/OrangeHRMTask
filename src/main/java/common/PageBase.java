package common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PageBase {

    protected WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnElement(By element) {
        driver.findElement(element).click();
    }
    public void setElementText(By element , String text) {
        driver.findElement(element).sendKeys(text);
    }
    public String getElementText(By element) {
        return driver.findElement(element).getText();
    }
    public void refreshPage(){
        driver.navigate().refresh();
    }
    public void reloadPage() {
        driver.navigate().refresh();
    }
    public void assertElementIsDisplayed(By element) {
        Assert.assertTrue(driver.findElement(element).isDisplayed(),"Element Not Displayed");
    }
    public static int extractNumber(String input) {
        Pattern pattern = Pattern.compile("\\((\\d+)\\)");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            String numberStr = matcher.group(1);
            return Integer.parseInt(numberStr);
        } else {
            return 0;
        }
    }
}
