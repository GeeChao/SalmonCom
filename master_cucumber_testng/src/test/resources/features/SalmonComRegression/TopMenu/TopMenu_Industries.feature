#Salmon.com regression pack - TopMenu:  Industries

@Ivan
Feature: Top Menu


  Scenario: Validate that user can navigate to correct page after clicking Industries in Top Menu
    Given I navigate to the Salmon "Home" page
    And I click "Industries" on the Top Menu
    Then I arrive at "Industries" page