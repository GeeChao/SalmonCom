#Salmon.com regression pack - Footer:  Accessibility

@Iva
Feature: Footer


  Scenario: Validate that user can navigate to correct page after clicking Accessibility link
    Given I navigate to the Salmon "Home" page
    And I click "Accessibility" on the footer
    Then I arrive at "Accessibility" page