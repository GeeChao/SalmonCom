#Salmon.com regression pack - TopMenu:  Our Work

@Ivan
Feature: Top Menu


  Scenario: Validate that user can navigate to correct page after clicking Our Work in Top Menu
    Given I navigate to the Salmon "Home" page
    And I click "OurWork" on the Top Menu
    Then I arrive at "OurWork" page