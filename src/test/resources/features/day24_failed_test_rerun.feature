@failed
Feature: failed_tests
# failing this scenario on purpose
  Scenario: TC_01_admin_login
    Given user navigates to "https://www.bluerentalcars.com/login"
    When user enters admin email and password
      | admin_email     | password |
      | jworong@gmail.com | 12345    |
    And user clicks on login button
    Then verify login is successful
    And close the application