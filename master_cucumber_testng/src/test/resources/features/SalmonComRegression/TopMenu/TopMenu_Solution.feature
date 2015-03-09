#Salmon.com regression pack - TopMenu:  Solution

@Ivan
Feature: Top Menu


  Scenario: Validate that user can navigate to correct page after clicking Solution in Top Menu
    Given I navigate to the Salmon "Home" page
    And I click "Solution" on the Top Menu
    Then I arrive at "Solution" page