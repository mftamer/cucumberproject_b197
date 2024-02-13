package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.DataTable_HomePage;
import utilities.BrowserUtils;
import utilities.WaitUtils;

public class DataTableStepDefs {

    //Create the Page object
    DataTable_HomePage dataTableHomePage = new DataTable_HomePage();

    @Given("user clicks on new button")
    public void user_clicks_on_new_button() {
        BrowserUtils.clickWithTimeOut(dataTableHomePage.newButton,1);
    }
    @Given("user enters first name as {string}")
    public void user_enters_first_name_as(String first_name) {
        BrowserUtils.sendKeysWithTimeout(dataTableHomePage.firstName,first_name,1);
    }
    @Given("user enters last name as {string}")
    public void user_enters_last_name_as(String last_name) {
        BrowserUtils.sendKeysWithTimeout(dataTableHomePage.lastName,last_name,1);
    }
    @Given("user enters position as {string}")
    public void user_enters_position_as(String pos) {
        BrowserUtils.sendKeysWithTimeout(dataTableHomePage.position,pos,1);
    }
    @Given("user enters office as {string}")
    public void user_enters_office_as(String office) {
        BrowserUtils.sendKeysWithTimeout(dataTableHomePage.office,office,1);
    }
    @Given("user enters extension as {string}")
    public void user_enters_extension_as(String extn) {
        BrowserUtils.sendKeysWithTimeout(dataTableHomePage.extension,extn,1);
    }
    @Given("user enters start date as {string}")
    public void user_enters_start_date_as(String start_date) {
        BrowserUtils.sendKeysWithTimeout(dataTableHomePage.startDate,start_date,1);
    }
    @Given("user enters salary as {string}")
    public void user_enters_salary_as(String salary) {
        BrowserUtils.sendKeysWithTimeout(dataTableHomePage.salary,salary,1);
    }

    @And("user clicks on create button")
    public void userClickOnCreateButton() {
        BrowserUtils.clickWithTimeOut(dataTableHomePage.createButton,2);
    }

    @Given("user search for {string}")
    public void user_search_for(String first_name) {
        BrowserUtils.sendKeysWithTimeout(dataTableHomePage.searchBox, first_name,1);
    }
    @Then("verify that the name field contains {string}")
    public void verify_that_the_name_field_contains(String nameField) {
        WaitUtils.waitFor(2);
        Assert.assertTrue(dataTableHomePage.verifyNameField.getText().contains(nameField));
    }
}
