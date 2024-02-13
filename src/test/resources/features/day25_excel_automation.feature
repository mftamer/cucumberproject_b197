@excel
Feature: excel_automation
  Scenario: TC_01_user_creation
    Given user navigates to "https://editor.datatables.net/"
    And user enters "user_data" from "data_sheet.xlsx" excel sheet and verify the user is created
    And close the application

#  Scenario: TC_01_user_creation
#    Given user navigates to "https://editor.datatables.net/"
#    And user enters "admin_data" from "data_sheet.xlsx" excel sheet and verify the user is created
#    And close the application