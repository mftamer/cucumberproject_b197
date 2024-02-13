@grid
Feature: grid_feature
  Scenario: TC01_chrome_test
    Given user navigates to "http://github.com" using "chrome" browser
    Then verify the title contains "GitHub"
    And close the remote driver