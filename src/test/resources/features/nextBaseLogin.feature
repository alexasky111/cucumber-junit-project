Feature: Crm login

  @crm
  Scenario: User should be able to login
    Given User is on the login page of CRM
    When User enters below credentials
      | username | crm_username |
      | password | crm_password |
    Then User should see CRM24 homepage