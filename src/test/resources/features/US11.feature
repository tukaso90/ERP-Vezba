@US11
Feature: As a POS & Sales manager, I want to get repair order on the Repairs page

  Scenario: As a POS manager
    Given user should be able to log in as a POS manager
    When user clicks on the Repairs button as a POS manager
    And user should be able to click on the top checkbox on Repairs page
    Then all checkboxes should be selected on Repairs page

  Scenario: As a Sales manager
    Given user should be able to log in as a sales manager
    When user clicks on the Repairs button as a sales manager
    And user should be able to click on the top checkbox on Repairs page
    Then all checkboxes should be selected on Repairs page