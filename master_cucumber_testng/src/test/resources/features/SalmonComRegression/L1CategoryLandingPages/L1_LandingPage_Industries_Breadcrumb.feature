#Salmon.com regression pack - L1CategoryLandingPages - Industries - Breadcrumb
@SalmonP1
Feature: L1CategoryLandingPages
  Scenario: This is to confirm the breadcrumb is as expected for Industries page
    Given I navigate to the Salmon "Industries" page
    Then "Home > Industries" breadcrumb is present on Industries Page
    And I click "Home" link on Industries Page
    Then I arrive at "Home" page
