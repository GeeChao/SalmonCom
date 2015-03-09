#Salmon.com regression pack - L1CategoryLandingPages - Services - Breadcrumb
@SalmonP1
Feature: L1CategoryLandingPages
  Scenario: This is to confirm the breadcrumb is as expected for Services page
    Given I navigate to the Salmon "Services" page
    Then "Home > Services" breadcrumb is present on Services Page
    And I click "Home" link on Services Page
    Then I arrive at "Home" page