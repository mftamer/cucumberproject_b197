@jdbc
Feature: jdbc_feature

  @user_login
  Scenario: TC01_read_user_login
    Given user connects to application database
    And user gets the column "*" from the table "jhi_user"
    And read all column "login" data
    Then verify table "jhi_user" and column "login" contains "tom-ss"
    #And close database

  @user_email
  Scenario: TC02_user_email_test
    Given user connects to application database
    And user gets the column "*" from the table "jhi_user"
    And read all column "email" data
    Then verify table "jhi_user" and column "email" contains "yuki1@gmail.com"
    #And close database

  @account_status
  Scenario: TC03_read_user_account_status
    Given user connects to application database
    And user gets the column "*" from the table "tp_account"
    #And read all column "account_status_type" data
    Then verify table "tp_account" and column "account_status_type" contains "SUESPENDED"
    #And close database

  #verify if account_type contains following types: CHECKING, CREDIT_CARD, SAVING, INVESTING

  @account_type
  Scenario Outline: TC04_read_account_type
    Given user connects to application database
    And user gets the column "*" from the table "tp_account"
   # And read all column "account_status_type" data
    Then verify table "<tableName>" and column "<columnName>" contains "<dataName>"
    Examples:
      | tableName  | columnName   | dataName    |
      | tp_account | account_type | CHECKING    |
      | tp_account | account_type | CREDIT_CARD |
      | tp_account | account_type | SAVING      |
      | tp_account | account_type | INVESTING   |

  @customer_city_info
  Scenario Outline: TC05_read_customer_city_info
    Given user connects to application database
    And user gets the column "*" from the table "tp_customer"
   # And read all column "account_status_type" data
    Then verify table "<tableName>" and column "<columnName>" contains "<dataName>"
    Examples:
      | tableName   | columnName | dataName    |
      | tp_customer | city       | Waltermouth |
      | tp_customer | city       | Fairfax     |
      | tp_customer | city       | Izmir       |
      | tp_customer | city       | NewCity     |
      | tp_customer | city       | St Louis    |






