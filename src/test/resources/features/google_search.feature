@ui
Feature: Google Search
  As a user,
  I should be able to search by keyword
  and get my result

  @wip
  Scenario: User searches by keyword
    Given user is at homepage
    When user searches for keyword "selenium"
    Then we should see results page
    And the title should start with "selenium"