#Salmon.com regression pack - L1CategoryLandingPages - OurWork - Breadcrumb
@SalmonP1
Feature: L1CategoryLandingPages
  Scenario: This is to confirm the breadcrumb is as expected for OurWork page
    Given I navigate to the Salmon "OurWork" page
    Then "Home > Our Work" breadcrumb is present on OurWork Page
    And I click "Home" link on OurWork Page
    Then I arrive at "Home" page