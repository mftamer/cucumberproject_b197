Feature: jdbc_feature

  @user_login
  Scenario: TC01_read_user_login
    Given user connects to application database
    And close database

