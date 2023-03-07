@US05
Feature: As a POS manager I should be able to view the product order

  Background:
    Given user should be able to log in as a POS manager
    When user should be able to click Point of Sale button
    And user clicks on the order list on the Point of Sale page
    Then user should be able to check the Order reference

  Scenario: Verify if all orders are checked
    Then all the orders should be checked

  Scenario: Verify there are 3 options from the Action dropdown
    When user clicks on the Action dropdown
    Then Action drop down button should have 3 options

  Scenario:Verify the dropdown consists of listed elements
    Then the dropdown should contain listed elements
      | Import |
      | Export |
      | Delete |