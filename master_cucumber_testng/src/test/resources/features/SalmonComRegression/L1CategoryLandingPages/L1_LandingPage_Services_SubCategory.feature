#Salmon.com regression pack - L1CategoryLandingPages - Services - SubCategory
@SalmonP1
Feature: L1CategoryLandingPages

  Scenario: This is to confirm that user can navigate to subcategories from L1 category landing page(Services)
    Given I navigate to the Salmon "Services" page
    And I click "Strategy" subcategory on Services Page
    Then I arrive at "Strategy" page
    Given I navigate back to the Salmon "Services" page
    And I click "Design" subcategory on Services Page
    Then I arrive at "Design" page
    Given I navigate back to the Salmon "Services" page
    And I click "Delivery" subcategory on Services Page
    Then I arrive at "Delivery" page
    Given I navigate back to the Salmon "Services" page
    And I click "Operations" subcategory on Services Page
    Then I arrive at "Operations" page
    Given I navigate back to the Salmon "Services" page
    And I click "Optimisation" subcategory on Services Page
    Then I arrive at "Optimisation" page