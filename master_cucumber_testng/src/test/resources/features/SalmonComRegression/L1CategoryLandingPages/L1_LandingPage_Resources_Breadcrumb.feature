#Salmon.com regression pack - L1CategoryLandingPages - Resources - Breadcrumb
@SalmonP1
Feature: L1CategoryLandingPages
  Scenario: This is to confirm the breadcrumb is as expected for Resources page
    Given I navigate to the Salmon "Resources" page
    Then "Home > Resources" breadcrumb is present on Resources Page
    And I click "Home" link on Resources Page
    Then I arrive at "Home" page
