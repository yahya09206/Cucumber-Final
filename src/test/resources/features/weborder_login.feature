@ui @wip
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

  @failed
  Scenario: User login with specific credentials
    When user provides username "Tester" and password "test11111"
    Then we should see all order page

  @failed
  Scenario: User login with invalid credentials
    When user provides username "Testers" and password "test"
    Then we should still be at the login page
    And login error message should be present

  Scenario: Login to weborder app by providing username and password in 2 column table
    When we provide below credentials
      | username | Tester |
      | password | test   |
    Then we should see all order page

  Scenario: Representing table with header and more than 2 columns with a list of map
    Given this is the product reference
      | Product     | Price | Discount |
      | MyMoney     | 100   | 0.08     |
      | FamilyAlbum | 20    | 0.15     |
      | ScreenSaver | 80    | 0.1      |