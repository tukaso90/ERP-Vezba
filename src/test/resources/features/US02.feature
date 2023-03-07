@US02
  Feature: As a POS & sales manager, I want to access the Repairs page

    Scenario: As a POS manager
      Given user should be able to log in as a POS manager
      When user clicks on the Repairs button as a POS manager
      Then user should be able to see 6 columns for the repairs orders as a POS manager


    Scenario: As a sales manager
      Given user should be able to log in as a sales manager
      When user clicks on the Repairs button as a sales manager
      Then user should be able to see 6 columns for the repairs orders as a sales manager

