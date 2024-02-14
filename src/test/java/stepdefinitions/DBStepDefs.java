package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.DBUtils;

public class DBStepDefs {

    @Given("user connects to application database")
    public void user_connects_to_application_database() {
        DBUtils.createConnection();

    }


    @And("close database")
    public void closeDatabase() {
        DBUtils.closeConnection();
    }
}
