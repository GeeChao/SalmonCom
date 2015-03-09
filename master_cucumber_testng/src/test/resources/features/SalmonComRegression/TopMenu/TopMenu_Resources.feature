#Salmon.com regression pack - TopMenu:  Resources

@Ivan
Feature: Top Menu


  Scenario: Validate that user can navigate to correct page after clicking Resources in Top Menu
    Given I navigate to the Salmon "Home" page
    And I click "Resources" on the Top Menu
    Then I arrive at "Resources" page