package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.DataTable_HomePage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.WaitUtils;

import java.util.List;
import java.util.Map;

import static utilities.WaitUtils.waitFor;

public class ExcelStepDefs {

    DataTable_HomePage dataTableHomePage;

    ExcelUtils excelUtils;

    List<Map<String, String>> dataList;



    @Given("user enters {string} from {string} excel sheet and verify the user is created")
    public void user_enters_from_excel_sheet_and_verify_the_user_is_created(String sheetName, String fileName) {

//        String pathOfFile = "./src/test/resources/data_sheet.xlsx"; // This is not dynamic
        String pathOfFile = "./src/test/resources/" + fileName;  // This is DYNAMIC

        excelUtils = new ExcelUtils(pathOfFile, sheetName);

        dataList = excelUtils.getDataList();
        System.out.println("dataList = " + dataList);


        dataTableHomePage = new DataTable_HomePage();

        // TEST STARTS NOW

        // In order to get the data one by one from dataList, we need to pass it through the loop and change it's data type from
        // list to map, so we can manipulate it as key:value pair

        for (Map<String, String> eachData : dataList){
            System.out.println("eachData = " + eachData);

            BrowserUtils.clickWithTimeOut(dataTableHomePage.newButton, 1);
            BrowserUtils.sendKeysWithTimeout(dataTableHomePage.firstName, eachData.get("first_name"), 1);
            BrowserUtils.sendKeysWithTimeout(dataTableHomePage.lastName, eachData.get("last_name"), 1);

            BrowserUtils.sendKeysWithTimeout(dataTableHomePage.position, eachData.get("position"), 1);
            BrowserUtils.sendKeysWithTimeout(dataTableHomePage.office, eachData.get("office"), 1);
            BrowserUtils.sendKeysWithTimeout(dataTableHomePage.extension, eachData.get("extension"), 1);
            BrowserUtils.sendKeysWithTimeout(dataTableHomePage.startDate, eachData.get("start_date"), 1);
            BrowserUtils.sendKeysWithTimeout(dataTableHomePage.salary, eachData.get("salary"), 1);

            BrowserUtils.clickWithTimeOut(dataTableHomePage.createButton, 2);


            BrowserUtils.sendKeysWithTimeout(dataTableHomePage.searchBox, eachData.get("first_name"), 2);

            Assert.assertTrue(dataTableHomePage.verifyNameField.getText().contains(eachData.get("first_name")));

            waitFor(2);

            Driver.getDriver().navigate().refresh();




        }





    }





}