@scenario_outline_2 @regression
Feature: data_tables_feature

  Background:
    Given user navigates to "https://editor.datatables.net/"

  Scenario Outline: TC_user_creation
    And user clicks on new button
    And user enters first name as "<first_name>"
    And user enters last name as "<last_name>"
    And user enters position as "<position>"
    And user enters office as "<office>"
    And user enters extension as "<extension>"
    And user enters start date as "<start_date>"
    And user enters salary as "<salary>"
    And user clicks on create button
    And user search for "<first_name>"
    Then verify that the name field contains "<first_name>"
    And close the application

    Examples:
      | first_name | last_name | position  | office   | extension | start_date | salary  |
      | Ali        | Can       | QA        | NY       | 546       | 2024-04-10 | 500000  |
      | Ayse       | Bak       | Dev       | Istanbul | 123       | 2024-02-20 | 800000  |
      | Fatih      | Tamer     | SQA       | Ottowa   | 469       | 2024-03-01 | 9000000 |
      | Uranus     | Kohi      | PO        | Madrid   | 586       | 2024-03-10 | 5000000 |
      | Ahmad      | Ramin     | President | Kabul    | 987       | 2024-03-15 | 9000000 |