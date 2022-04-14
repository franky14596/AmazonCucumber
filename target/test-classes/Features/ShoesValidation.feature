#Author: Franky@amazon.com
Feature: ShoesValidation

  Scenario: Datatable values by dim list
    Given User launches Amazon application
    When User searches shoes by one dim list
      | puma |
    And user clicks shoe
    Then user validates the outcomes
