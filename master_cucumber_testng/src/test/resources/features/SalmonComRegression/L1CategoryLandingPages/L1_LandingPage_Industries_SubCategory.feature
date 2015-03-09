#Salmon.com regression pack - L1CategoryLandingPages - Industries - SubCategory
@SalmonP1
Feature: L1CategoryLandingPages

  Scenario: This is to confirm that user can navigate to subcategories from L1 category landing page(Industries)
    Given I navigate to the Salmon "Industries" page
    And I click "Retail" subcategory on Industries Page
    Then I arrive at "Retail" page
    Given I navigate back to the Salmon "Industries" page
    And I click "Grocery" subcategory on Industries Page
    Then I arrive at "Grocery" page
    Given I navigate back to the Salmon "Industries" page
    And I click "Luxury" subcategory on Industries Page
    Then I arrive at "Luxury" page
    Given I navigate back to the Salmon "Industries" page
    And I click "B2B" subcategory on Industries Page
    Then I arrive at "B2B" page
    Given I navigate back to the Salmon "Industries" page
    And I click "Consumer" subcategory on Industries Page
    Then I arrive at "Consumer" page