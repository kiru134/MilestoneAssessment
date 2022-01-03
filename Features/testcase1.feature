Feature: Hover to products

  Scenario: Verify if the text Gillette MACH3 Turbo present in products
    Given Open website
    When Hover on Products Choose MACH3 under Brands
    Then Verify Gillette MACH3 Turbo is displayed under  products


