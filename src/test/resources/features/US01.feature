@US01
Feature: As a POS & sales manager, I should be able to get correct information on the Sales page


  Scenario: Logged in as a POS manager
    Given user should be able to log in as a POS manager
    Then verify user is logged as POS manager
    When user clicks on the Sales button
    Then the user should be able to see 6 quotations on the page

  Scenario: Logged in as a sales manager
    Given user should be able to log in as a sales manager
    Then verify user is logged as sales manager
    When the user clicks on the Sales button
    Then the user should be able to see the 6 quotations on the page


