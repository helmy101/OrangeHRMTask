package steps;

import connector.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.logging.Logs;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(Hooks.driver);

//    @Given("User in login page")
//    public void userInLoginPage() {
//        loginPage.enterUsername();
//    }
    @Given("From Login Page, Enter username")
    public void fromLoginPageEnterUsername() {
        loginPage.enterUsername();
    }

    @And("Enter Password")
    public void enterPassword() {
        loginPage.enterPassword();
    }

    @When("Click on login button.")
    public void clickOnLoginButton() {
        loginPage.clickOnLoginButton();
    }

    @Given("user in Login page and user enter username")
    public void userInLoginPageAndUserEnterUsername() {
        loginPage.enterUsername();
    }
}
