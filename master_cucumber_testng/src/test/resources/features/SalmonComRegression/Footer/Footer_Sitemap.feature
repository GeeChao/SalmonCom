#Salmon.com regression pack - Footer:  Sitemap

@Iva
Feature: Footer


  Scenario: Validate that user can navigate to correct page after clicking Sitemap link
    Given I navigate to the Salmon "Home" page
    And I click "Sitemap" on the footer
    Then I arrive at "Sitemap" page