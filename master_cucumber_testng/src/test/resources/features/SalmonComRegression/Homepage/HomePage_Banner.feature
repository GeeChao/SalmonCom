#Salmon.com regression pack 
# Homepage: HomePage_Banner
# Covering UJ 004 Interact with banners
@SalmonP1
Feature: Test to verify that user can interact with banners on the site. 

#  Scenario outline: Home page banner interaction
#    Given I navigate to the Salmon "HOME" page
#    And I click "Next" on bannner
#    Then I can see banner goes to "Next"
#    And I click "Previous" on bannner
#    Then I can see banner goes to "Previous"    
#    And I click "down" on banner
#    Then I can see banner goes up
#    And I click page "<pageNumber>" on bannner
#    Then I can see banner goes to page "<pageNumber>"
#    And I click "<buttonName>" on banner
#    Then I arrive at "<buttonNavigation>" page

#       Examples: 
#         | pageNumber  |buttonName			|buttonNavigation			|
#         | 1			| WATCH THE VEDIO	|Redefining Online Grocery	|
#         | 2			| CASE STUDY		|Audi UK					|

  Scenario Outline: Home page banner interaction
    Given I navigate to the Salmon "HOME" page
    And I click "Next" on bannner
    Then I can see banner goes to "Next"
    And I click "Previous" on bannner
    Then I can see banner goes to "Previous"    
    And I click page "<pageNumber>" on bannner
    Then I can see banner goes to page "<pageNumber>"
    And I click button "<buttonName>" on banner
    Then I arrive at "<buttonNavigation>" page

       Examples: 
         | pageNumber  |buttonName			|buttonNavigation			|
         | 	1		| WATCH THE VEDIO	|RedefiningOnlineGrocery	|
         | 	2		| case study	|audiUK	|
         
