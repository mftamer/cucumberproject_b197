package stepdefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Google_HomePage;
import utilities.Driver;
import utilities.WaitUtils;
public class GoogleStepDefs {
    Google_HomePage googleHomePage = new Google_HomePage(); // Create the object from Google_HomePage
    @Given("user is on the google homepage")
    public void user_is_on_the_google_homepage() {
        Driver.getDriver().get("https://www.google.com/");
        WaitUtils.waitFor(2);
//        if there is a Google cookie popup,
//        try{
//            googleHomePage.cookiePopUp.click();
//        }catch (Exception e){
//
//        }

    }
    @Given("user search for iPhone")
    public void user_search_for_i_phone() {
        googleHomePage.searchBox.sendKeys("iPhone", Keys.ENTER);
        WaitUtils.waitFor(2);
    }

    @Then("verify the result contains iPhone")
    public void verify_the_result_contains_i_phone() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
        WaitUtils.waitFor(2);
    }

    @Given("user search for porcelain teapot")
    public void user_search_for_porcelain_teapot() {
        googleHomePage.searchBox.sendKeys("porcelain teapot", Keys.ENTER);
        WaitUtils.waitFor(2);
    }

    @Then("verify the result contains porcelain teapot")
    public void verify_the_result_contains_porcelain_teapot() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("porcelain teapot"));
        WaitUtils.waitFor(2);
    }

    @Given("user search for {string} on google")
    public void user_search_for_on_google(String string) {
        googleHomePage.searchBox.sendKeys(string, Keys.ENTER);
    }
}
