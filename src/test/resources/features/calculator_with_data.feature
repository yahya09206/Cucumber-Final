@Calculator @non_ui
Feature: Calculator Feature with data
  As a user
  I should be able
  to use the calculator,
  so that I can do arithmetic operations

  @wip2
    # Scenario Outline: is used to run some scenario against multiple different sets of data
    # the data is provided under Examples: section as a table and it's required
    # you can refer to the table data by using <columnName> in your steps
    # this data will be available in your step definitions as method params
  Scenario Outline: Add 2 numbers multiple times
    Given calculator app is open
    When I add <num1> with <num2>
    Then I should get result <expectedResult> displayed
    Examples:
      | num1 | num2 | expectedResult |
      | 3    | 4    | 12              |
      | 4    | 7    | 11             |
      | 6    | 11   | 17             |
      | 5    | 11   | 18             |

#  Scenario: Add 2 numbers example 1
#    Given calculator app is open
#    When I add 2 with 2
#    Then I should get result 4 displayed
#
#  Scenario: Add 2 numbers example 2
#    Given calculator app is open
#    When I add 3 with 2
#    Then I should get result 4 displayed
#
#  Scenario: Add 2 numbers example 3
#    Given calculator app is open
#    When I add 21 with 20
#    Then I should get result 41 displayed