#Salmon.com regression pack - L1CategoryLandingPages - Solution - SubCategory
@SalmonP1
Feature: L1CategoryLandingPages
  Scenario: This is to confirm that user can navigate to subcategories from L1 category landing page(Solution)
    Given I navigate to the Salmon "SOLUTIONS" page
    And I click "Multichannel" subcategory on solutions Page
    Then I arrive at "Multichannel" page
    Given I navigate back to the Salmon "SOLUTIONS" page
    And I click "Platform" subcategory on solutions Page
    Then I arrive at "Platform" page
    Given I navigate back to the Salmon "SOLUTIONS" page
    And I click "GlobalCommerce" subcategory on solutions Page
    Then I arrive at "GlobalCommerce" page