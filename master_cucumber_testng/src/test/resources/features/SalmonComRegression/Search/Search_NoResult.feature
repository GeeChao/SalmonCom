#Salmon.com regression pack 
# Search: Search_HasResult
# Covering 
@SalmonP4

Feature: Test to verify that user can get no result page on the site. 

   Scenario Outline: Verify the no search result page
     Given I navigate to the Salmon "HOME" page
      And I invoke search on Homepage
      And I input "<Keyword>" in searchbox
      And I click search on Homepage
      Then I arrive at search result page "<Keyword>"
      And I can see showing results for "<Keyword>" on search result page
      And I can see zero result found on search result page
      And I can see count of search result from summary and content are the same
      And I can see no result text "<NoMatchingText>" on search result page
     
       Examples: 
         | Keyword 			 | NoMatchingText																				|
         | FSDFSDF		 	 | Sorry, we couldn't find anything matching your search. Please try another search or contact us.|
         | Aufsdfjsakdfhdi   | Sorry, we couldn't find anything matching your search. Please try another search or contact us.|
      
      
      