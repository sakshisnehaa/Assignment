Feature: Web Login
  Scenario: User should be able to login with valid credentials
    Given the user is on login page
    When the user enters valid credentials
    Then the user should be logged in successfully

  Scenario: User should be able to login with valid credentials Firefox browser
    Given the user is on login firefox browser
    When the user should enter valid credentials for firefox browser
    Then the user should be logged in successfully in firefox browser

  Scenario: User should be able to login with valid credentials Headless browser
    Given I am in the login page of the demo site for automate Headless browser
    When Take data from excel sheet for  Headless browser
    Then Browser closed automatically for Headless browser

