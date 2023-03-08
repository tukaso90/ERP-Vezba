@US10
Feature: As a POS & Sales manager, I want to manage quotations on the Sales page

  Scenario: As a POS manager
    Given user should be able to log in as a POS manager
    When user clicks on the Sales button
    And user should be able to click on the top checkbox
    Then all checkboxes should be selected

  Scenario: As a Sales manager
    Given user should be able to log in as a sales manager
    When user clicks on the Sales button
    And user should be able to click on the top checkbox
    Then all checkboxes should be selected


