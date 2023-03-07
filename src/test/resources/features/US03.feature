@US03
  Feature: As a POS manager, I should be able to access the main modules

    Background:
      Given user should be able to log in as a POS manager

    Scenario: POS manager should be able to have access to 22 modules
      Then user logged in as a POS manager should be abele to see 22 modules