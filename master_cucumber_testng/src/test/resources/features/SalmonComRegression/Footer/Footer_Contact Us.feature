#Salmon.com regression pack - Footer:  Contact Us

@Iva
Feature: Footer


  Scenario: Validate that user can navigate to correct page after clicking Contact Us link
    Given I navigate to the Salmon "Home" page
    And I click "Contact Us" on the footer
    Then I arrive at "Contact Us" page