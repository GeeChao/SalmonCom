#Salmon.com regression pack - 
# Homepage: View Focus
# Covering 
@SalmonP1
Feature: Test to verify that user can view all Focuses on Homepage


   Scenario: Verify that user can view all Focuses on Homepage
     Given I navigate to the Salmon "HOME" page
      And I mouse over and click link "Visit the Resource Hub" on Homepage
      Then I arrive at "Resources" page 
      

  Scenario Outline: Verify that user can View specific focus on Homepage
     Given I navigate to the Salmon "HOME" page
     And I mouse over and click link "<ArticleTitle>" on Homepage
     Then I arrive at "<ArticleTitle>" resource page

       Examples: 
         | ArticleTitle 						|
         | DFS 			   						| 
         | ​Salmon Cited in Three Forrester Reports | 


  Scenario Outline: Verify that user can View specific focus on Homepage via image
     Given I navigate to the Salmon "HOME" page
     And I mouse over and click image "<ArticleTitle>" on Homepage
     Then I arrive at "<ArticleTitle>" resource page

       Examples: 
         | ArticleTitle 																		|
         | Retail Week- How can I add a "human touch" to online customer relationships 			   | 
         | ​Salmon Cited in Three Forrester Reports     | 
         
         
         
         
         