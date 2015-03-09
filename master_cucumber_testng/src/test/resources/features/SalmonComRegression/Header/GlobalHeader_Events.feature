#Salmon.com regression pack - Header:  Events

@Iva
Feature: Header


  Scenario: Validate that user can navigate to correct page after clicking Events link
    Given I navigate to the Salmon "Home" page
    And I click "Events" on the header
    Then I arrive at "Events" page