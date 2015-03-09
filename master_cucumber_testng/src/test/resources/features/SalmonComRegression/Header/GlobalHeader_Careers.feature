#Salmon.com regression pack - Header:  Careers

@Iva
Feature: Header


  Scenario: Validate that user can navigate to correct page after clicking Careers link
    Given I navigate to the Salmon "Home" page
    And I click "Careers" on the header
    Then I arrive at "Careers" page