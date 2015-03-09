#Salmon.com regression pack - Footer:  Events

@Iva
Feature: Footer


  Scenario: Validate that user can navigate to correct page after clicking Events link
    Given I navigate to the Salmon "Home" page
    And I click "Events" on the footer
    Then I arrive at "Events" page