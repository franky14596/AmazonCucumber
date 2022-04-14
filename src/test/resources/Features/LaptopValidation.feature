#Author: Franky@amazon.com
Feature: LaptopValidation

  Scenario Outline: Validation of laptops
    Given User Launches Amazon application
    When User searches Laptop"<laptops>"
    And user clicks laptop
    Then user Validates the outcomes

    Examples: 
      | laptops |
      | HP      |
