#Salmon.com regression pack - L1CategoryLandingPages - AboutUs - Breadcrumb
@SalmonP1
Feature: L1CategoryLandingPages
  Scenario: This is to confirm the breadcrumb is as expected for AboutUs page
    Given I navigate to the Salmon "AboutUs" page
    Then "Home > AboutUs" breadcrumb is present on AboutUs Page
    And I click "Home" link on AboutUs Page
    Then I arrive at "Home" page