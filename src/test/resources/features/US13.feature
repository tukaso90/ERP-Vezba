@US13
Feature: User valid login
  #this us took stepDefinitions from US13

  Scenario Outline: Verify sales manager can login with valid credentials
    When the user puts correct "<email>" and "<password>"
    Then user should see "<name>" on the profile page
    Examples:
      | email                   | password     | name           |
      | salesmanager55@info.com | salesmanager | SalesManager55 |
      | salesmanager56@info.com | salesmanager | SalesManager56 |
      | salesmanager57@info.com | salesmanager | SalesManager57 |

  Scenario Outline: Verify expense manager can login with valid credentials
    When the user puts correct "<email>" and "<password>"
    Then user should see "<name>" on the profile page
    Examples:
      | email                      | password        | name              |
      | expensesmanager55@info.com | expensesmanager | ExpensesManager55 |
      | expensesmanager56@info.com | expensesmanager | ExpensesManager56 |
      | expensesmanager57@info.com | expensesmanager | ExpensesManager57 |

