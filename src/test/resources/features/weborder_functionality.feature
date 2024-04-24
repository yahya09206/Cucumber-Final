@ui
Feature: WebOrder app is working as expected

  @wip
  Scenario: User should see all of the products from the list according to availability
    Given we are web order login page
    And we provide valid credentials
    When we select "Order" tab from sidebar
    Then we should see below options in Product dropdown list
      | Product     |
      | MyMoney     |
      | FamilyAlbum |
      | ScreenSaver |