#Salmon.com regression pack - 
# Homepage: ViewNews
# Covering 
@SalmonP1
Feature: Test to verify that user can view all news on Homepage

   Scenario: Verify that user can click Why on Homepage
     Given I navigate to the Salmon "HOME" page
      And I mouse over and click link "View all News Stories" on Homepage
      Then I arrive at "ResourcesNews" page 
      

  Scenario Outline: Verify that user can View specific news on Homepage
     Given I navigate to the Salmon "HOME" page
     And I mouse over and click link "<NewsTitle>" on Homepage
     Then I arrive at "<NewsTitle>" resource page

       Examples: 
         | NewsTitle 																		|
         | Tony Chen appointed as new Chief Executive Officer for Salmon China 			   | 
         | ​Salmon ranked 26th in The Drum’s annual RAR Top 100 agencies outside London     | 


  Scenario Outline: Verify that user can View specific news on Homepage via image
     Given I navigate to the Salmon "HOME" page
     And I mouse over and click image "<NewsTitle>" on Homepage
     Then I arrive at "<NewsTitle>" resource page

       Examples: 
         | NewsTitle 																		|
         | Tony Chen appointed as new Chief Executive Officer for Salmon China 			   | 
         | ​Salmon ranked 26th in The Drum’s annual RAR Top 100 agencies outside London     | 