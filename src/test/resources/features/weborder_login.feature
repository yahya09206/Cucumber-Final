Feature: Weborder app login
  As a user
  I should be able to login to the web order app

  Scenario: User can login successfully
    Given we are web order login page
    When we provide valid credentials
    Then we should see all order page