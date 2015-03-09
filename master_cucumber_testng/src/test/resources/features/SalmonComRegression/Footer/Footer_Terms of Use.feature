#Salmon.com regression pack - Footer:  Terms of Use

@Iva
Feature: Footer


  Scenario: Validate that user can navigate to correct page after clicking TermsOfUse link
    Given I navigate to the Salmon "Home" page
    And I click "TermsOfUse" on the footer
    Then I arrive at "TermsOfUse" page