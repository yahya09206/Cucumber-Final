Feature: Demonstrating the data table feature of cucumber

  Cucumber provides ability to organize repeating steps with different data
  using the data table feature and automatically converting the table into
  few known data types supported by cucumber

  Scenario: Petting zoo
    Given I have a "horse"
    And I have a "dog"
    And I have a "turtle"
    And I have a "zebra"
    When I call their names
    Then They come to me

  Scenario: Petting zoo with table
    Given I have the following animals
      | horse  |
      | dog    |
      | turtle |
      | zebra  |
    When I call their names with below names
      | Tyrian  |
      | Samwell |
      | Denarys |
      | Tywin   |
    Then They come to me
      | horse  | Neigh |
      | dog    | Woof  |
      | turtle | Hiss  |
      | zebra  | Bro   |