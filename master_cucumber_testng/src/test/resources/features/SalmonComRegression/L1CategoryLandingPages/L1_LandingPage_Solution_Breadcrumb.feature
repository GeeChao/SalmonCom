#Salmon.com regression pack - L1CategoryLandingPages - Solution - Breadcrumb
@SalmonP1
Feature: This is to confirm the breadcrumb is as expected for Solution page
  Scenario: L1CategoryLandingPages - Solution - Breadcrumb
    Given I navigate to the Salmon "SOLUTIONS" page
    Then "Home > Solutions" breadcrumb is present on solutions Page
    And I click "Home" link on solutions Page
    Then I arrive at "home" page