Feature: Search Razor and Validate

  Scenario Outline: Validating Razor result
    Given Open website
    When I search <Product> search option
    Then I verify the results of <Product> displayed

    Examples: 
      | Product  |
      | Razor |
