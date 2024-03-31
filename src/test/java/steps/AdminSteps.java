package steps;

import connector.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminPage;

public class AdminSteps {
    AdminPage adminPage = new AdminPage(Hooks.driver);

    @And("Get the number of records")
    public void getTheNumberOfRecords() {
        adminPage.getNumberOfRecord();
    }

    @Then("From Admin page, Click on Add button")
    public void fromAdminPageClickOnAddButton() {
        adminPage.clickOnAddButton();
    }

    @And("Fill all required fields")
    public void fillAllRequiredFields() {
        adminPage.selectRoleFromDropDown();
        adminPage.setEmployeeName();
        adminPage.selectStatusFromDropDown()
                .enterUserName()
                .enterPassword()
                .enterPassword();
    }

    @And("Click on Save button")
    public void clickOnSaveButton() {
        adminPage.clickOnSaveButton();
    }

    @Then("Verify that number of records increased by one")
    public void verifyThatNumberOfRecordsIncreasedByOne() {
        adminPage.assertThatTheNumberOfRecordIncreasedBy1();
    }

    @And("search for the recently created user")
    public void searchForTheRecentlyCreatedUser() {
        adminPage.enterUserNameInSearchBar().clickOnSearchButton();
    }

    @Then("the user should be displayed")
    public void theUserShouldBeDisplayed() {
        adminPage.assertThatCreatedUserIsDisplayedInTheTable();
    }

    @When("delete the user from management page")
    public void deleteTheUserFromManagementPage() {
        adminPage.clickOnDeleteButton();
    }

    @Then("a delete message should be displayed")
    public void aDeleteMessageShouldBeDisplayed() {
        adminPage.assertThatTheDeletePopUpIsDisplayed();
    }

    @And("user click on yes button in the pop-up screen")
    public void userClickOnYesButtonInThePopUpScreen() {
        adminPage.clickOnYesDeleteButton().reloadPage();
    }

    @Then("number of users should be decreased by one")
    public void numberOfUsersShouldBeDecreasedByOne() {
        adminPage.assertThatTheNumberOfRecordDecreasedByOne();
    }
}
