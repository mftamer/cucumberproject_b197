package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BlueRental_LoginPage;

import java.util.List;

public class BlueRentalStepDefs {

    BlueRental_LoginPage blueRentalLoginPage = new BlueRental_LoginPage();

    @When("user enters admin email and password")
    public void user_enters_admin_email_and_password(io.cucumber.datatable.DataTable dataTable) {
        List<String> credentials = dataTable.row(1); //index starts at 0
        System.out.println("credentials = " + credentials); // {jack1@gmail.com, 12345}
        //credentials.get(0);

        blueRentalLoginPage.email.sendKeys(credentials.get(0)); //sends email dynamically
        blueRentalLoginPage.password.sendKeys(credentials.get(1)); //sends password dynamically
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        blueRentalLoginPage.loginButton.click();

    }
    @Then("verify login is successful")
    public void verify_login_is_successful() {
        Assert.assertTrue(blueRentalLoginPage.adminProfile.isDisplayed());

    }
}
