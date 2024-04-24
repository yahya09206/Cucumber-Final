@Calculator @non_ui
Feature: Calculator Feature
  As a user
  I should be able
  to use the calculator,
  so that I can do arithmetic operations

  @addition
  Scenario: Add 2 numbers
    Given calculator app is open
    When I add 2 with 2
    Then I should get result 4 displayed

  @smoke
  Scenario: Add 2 numbers another example
    Given calculator app is open
    When I add 4 with 5
    Then I should get result 9 displayed