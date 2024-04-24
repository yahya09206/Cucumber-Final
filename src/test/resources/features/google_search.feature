@ui
Feature: Google Search
  As a user,
  I should be able to search by keyword
  and get my result

  Background:
    Given user is at homepage
    Then we should see results page

  @wip
  Scenario: User searches by keyword
    When user searches for keyword "selenium"
    Then we should see results page
    And the title should start with "selenium"

  # New scenario to search something else
  @wip
  Scenario: User searches by keyword java
    When user searches for keyword "java"
    And the title should start with "java"