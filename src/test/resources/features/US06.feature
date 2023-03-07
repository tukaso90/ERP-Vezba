@US06
Feature: As a user, I want to access the documentation page

Background:
  Given user should be able to log in as a POS manager
  When user should be able to click on the profile button
  And user should be able to click on the Documentation button from the dropdown
  Then the Odoo page should be opened in a new window

Scenario:
  Then user should verify the Odoo Documentation  message is displayed in a new window

  Scenario:
    Then user should verify there are 4 main document topics

