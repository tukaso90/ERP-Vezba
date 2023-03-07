@US04
  Feature: As an Inventory manager I should be able to access the main modules

      Background:
      Given user should be able to log in as an Inventory Manager

    Scenario: Verify the user is logged as an Inventory Manager
      Then verify user is logged as "InventoryManager23"

    Scenario: Verify the Inventory managers have access to 16 modules
      Then verify Inventory manager has access to 16 modules