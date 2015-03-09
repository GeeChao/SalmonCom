#Salmon.com regression pack - Footer:  Careers

@SalmonP4
Feature: Footer


  Scenario: Validate that user can navigate to correct page after clicking Careers link
    Given I navigate to the Salmon "Home" page
    And I click "Careers" on the footer
    Then I arrive at "Careers" page