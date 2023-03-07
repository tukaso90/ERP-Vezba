@US01
Feature: As a POS & sales manager, I should be able to get correct information on the Sales page


  Scenario: Logged in as a POS manager
    Given user should be able to log in as a POS manager
    Then the user should be able to see "POSManager23" on the screen
    When user clicks on the Sales button
    Then the user should be able to see 6 quotations on the page

  Scenario: Logged in as a sales manager
    Given user should be able to log in as a sales manager
    Then user should be able to see "SalesManager23" on the screen
    When the user clicks on the Sales button
    Then the user should be able to see the 6 quotations on the page


