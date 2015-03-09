#Salmon.com regression pack - L1CategoryLandingPages - AboutUs - SubCategory
@SalmonP4
Feature: L1CategoryLandingPages
  Scenario: This is to confirm that user can navigate to subcategories from L1 category landing page(AboutUs)
    Given I navigate to the Salmon "AboutUs" page
    And I click "People" subcategory on AboutUs Page
    Then I arrive at "People" page
    Given I navigate back to the Salmon "AboutUs" page
    And I click "Awards" subcategory on AboutUs Page
   Then I arrive at "Awards" page
    Given I navigate back to the Salmon "AboutUs" page
    And I click "Partners" subcategory on AboutUs Page
    Then I arrive at "Partners" page