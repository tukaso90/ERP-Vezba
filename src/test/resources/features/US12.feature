@US12
Feature: User valid login

  Scenario Outline: Verify POS manager can login with valid credentials
    When the user puts correct "<email>" and "<password>"
    Then user should see "<name>" on the profile page
    Examples:
      | email                 | password   | name         |
      | posmanager55@info.com | posmanager | POSManager55 |
      | posmanager56@info.com | posmanager | POSManager56 |
      | posmanager57@info.com | posmanager | POSManager57 |

  Scenario Outline: Verify CRM manager can login with valid credentials
    When the user puts correct "<email>" and "<password>"
    Then user should see "<name>" on the profile page
    Examples:
      | email                      | password        | name              |
      | eventscrmmanager55@info.com | eventscrmmanager | EventsCRMManager55 |
      | eventscrmmanager56@info.com | eventscrmmanager | EventsCRMManager56 |
      | eventscrmmanager57@info.com | eventscrmmanager | EventsCRMManager57 |

