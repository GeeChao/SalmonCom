#Salmon.com regression pack - TopMenu:  Home

@Ivan
Feature: TopMenu


  Scenario: Validate that user can navigate to correct page after clicking Home in Top Menu
    Given I navigate to the Salmon "Services" page
    And I click "Home" on the Top Menu
    Then I arrive at "Home" page