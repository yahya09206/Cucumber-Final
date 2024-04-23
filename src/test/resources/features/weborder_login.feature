Feature: Weborder app login
  As a user
  I should be able to login to the web order app

  # This is where repeating beginning code can go
  Background:
    Given we are web order login page

  Scenario: User can login successfully
    # Given we are web order login page
    When we provide valid credentials
    Then we should see all order page

  Scenario: User login fail
    # Given we are web order login page
    When we provide invalid credentials
    Then we should still be at the login page
    And login error message should be present