#Salmon.com regression pack - TopMenu:  About Us

@Ivan
Feature: TopMenu


  Scenario: Validate that user can navigate to correct page after clicking About Us in Top Menu
    Given I navigate to the Salmon "Home" page
    And I click "About Us" on the Top Menu
    Then I arrive at "About Us" page