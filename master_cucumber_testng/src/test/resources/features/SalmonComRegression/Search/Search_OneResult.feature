#Salmon.com regression pack 
# Search: Search_HasResult
# Covering 
@SalmonP1

Feature: Test to verify that user can search on the site. 

  Scenario Outline: Verify that user can search on Homepage
     Given I navigate to the Salmon "HOME" page
      And I invoke search on Homepage
      And I input "<Keyword>" in searchbox
      And I click search on Homepage
      Then I arrive at search result page "<Keyword>"
      And I can see showing results for "<Keyword>" on search result page
	  And I can see one result found on search result page
	  
#       Examples: 
#         | Keyword 	|
#         | Tony		  | 
#         | Audi		  | 
