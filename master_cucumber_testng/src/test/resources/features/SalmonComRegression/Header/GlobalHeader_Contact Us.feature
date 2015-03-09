#Salmon.com regression pack - Header:  Contact Us

@SalmonP4
Feature: Header


  Scenario: Validate that user can navigate to correct page after clicking ContactUs link
    Given I navigate to the Salmon "Home" page
    And I click "ContactUs" on the header
    Then I arrive at "ContactUs" page