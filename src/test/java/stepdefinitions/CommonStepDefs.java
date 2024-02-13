package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.Driver;
import utilities.WaitUtils;

public class CommonStepDefs {

    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {
        Driver.getDriver().get(url);
        WaitUtils.waitFor(2);
    }

    @Then("verify the result contains {string}")
    public void verify_the_result_contains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }
}
