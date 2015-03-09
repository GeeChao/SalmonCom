#Salmon.com regression pack - 
# Homepage: ViewCaseStudy
# Covering UJ 005 View content
@SalmonP4
Feature: Test to verify that user can view Case studies on Homepage

#  Scenario : Verify that user can View all case studies on Homepage
#    Given I navigate to the Salmon "HOME" page
#     And I click "View Case Studies" on Homepage
#     Then I arrive at "OurWork" page

#  	Scenario outline: Verify that user can View specific case study on Homepage
#    Given I navigate back to the Salmon "HOME" page
#     And I click "<CaseStudyName>" on Homepage
#     Then I arrive at "<CaseStudyName>" page

#       Examples: 
#         | CaseStudyName |
#         | Argos		  | 
#         | Audi		  | 


   Scenario: Verify that user can click Why on Homepage
     Given I navigate to the Salmon "HOME" page
      And I click "View Case Studies" on Homepage
      Then I arrive at "OurWork" page 
 
    Scenario Outline: Verify that user can View specific case study on Homepage
     Given I navigate to the Salmon "HOME" page
      And I mouse over and click case study "<CaseStudyName>" on Homepage
      Then I arrive at "<CaseStudyName>" resource page
      
       Examples: 
         | CaseStudyName |
         | Argos		  | 
         | GAME	  |    