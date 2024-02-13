package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", //creates reports on the console as well
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failedRerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true, //makes the console reports more readable
        features = "./src/test/resources/features",  // provides the path of the features folder
        glue = {"stepdefinitions", "hooks"},  // provides the path of the stepdefinitions folder
        dryRun = false, // generates the missing step definitions, without running the existing step definitions
        tags = "@scenario_outline_2"
)
public class Runner {
}
/*
Runner class is used to run the feature files
And to add report plug-ins
Runner class is used to connect the JAVA (step definitions) and NON-JAVA (feature files ) parts
@RunWith(Cucumber.class)  makes the Runner class runnable
@CucumberOptions is used to connect the feature files with their step definitions. It is also used for configurations and report plugins
features => provides path of the features folder
glue is used to connect feature file with it step definitions
dryRun = true generates the missing step definitions, without running the existing step
dryRun = false must be used to run the tests normally
@tags us used to run specific test scenarios
 */