@grid
Feature: grid_feature
  Scenario: TC01_chrome_test
    Given user navigates to "http://github.com" using "chrome" browser
    Then verify the title contains "GitHub"
    And close the remote driver

  Scenario: TC02_firefox_test
    Given user navigates to "http://github.com" using "firefox" browser
    Then verify the title contains "GitHub"
    And close the remote driver

  Scenario: TC03_edge_test
    Given user navigates to "http://github.com" using "edge" browser
    Then verify the title contains "GitHub"
    And close the remote driver

  Scenario: TC04_safari_test
    Given user navigates to "http://github.com" using "safari" browser
    Then verify the title contains "GitHub"
    And close the remote driver