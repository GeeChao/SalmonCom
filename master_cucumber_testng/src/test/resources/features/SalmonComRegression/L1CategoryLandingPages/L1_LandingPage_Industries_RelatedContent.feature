#Salmon.com regression pack - L1CategoryLandingPages - Industries - RelatedContent
@UnderTest
Feature: 

  Scenario: This is to confirm that user can navigate to RelatedContent from L1 category landing page(Industries)
    Given I navigate to the Salmon "Industries" page
    And I click the first content on Industries Page
    Then I arrive at "DFS" resource page
    Given I navigate back to the Salmon "Industries" page
#    And I click "Visit the Resource Hub" link on Industries Page
#    Then I arrive at "Resources" page