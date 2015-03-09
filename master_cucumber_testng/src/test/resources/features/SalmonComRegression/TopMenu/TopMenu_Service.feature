#Salmon.com regression pack - TopMenu:  Service

@Ivan
Feature: Top Menu


  Scenario: Validate that user can navigate to correct page after clicking Service in Top Menu
    Given I navigate to the Salmon "Home" page
    And I click "Service" on the Top Menu
    Then I arrive at "Service" page