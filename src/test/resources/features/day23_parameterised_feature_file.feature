@param_feature @smoke
Feature: search_feature

  Background:
    Given user navigates to "https://www.google.com/"

  Scenario: TC_01_iPhone_search
    And user search for "iPhone" on google
    Then verify the result contains "iPhone"
    And close the application

  Scenario: TC_02_tea_pot_search
    And user search for "tea pot" on google
    Then verify the result contains "tea pot"
    And close the application

  Scenario: TC_03_tesla_search
    And user search for "tesla" on google
    Then verify the result contains "tesla"
    And close the application

  Scenario: TC_04_flower_search
    And user search for "flower" on google
    Then verify the result contains "flower"
    And close the application