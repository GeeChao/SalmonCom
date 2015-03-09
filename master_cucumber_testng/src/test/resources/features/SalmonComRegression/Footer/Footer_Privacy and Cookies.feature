#Salmon.com regression pack - Footer:  Privacy and Cookies

@Iva
Feature: Footer


  Scenario: Validate that user can navigate to correct page after clicking PrivacyAndCookies link
    Given I navigate to the Salmon "Home" page
    And I click "PrivacyAndCookies" on the footer
    Then I arrive at "PrivacyAndCookies" page