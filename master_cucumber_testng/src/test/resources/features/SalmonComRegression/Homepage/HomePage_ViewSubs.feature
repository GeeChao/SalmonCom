#Salmon.com regression pack - 
# Homepage: ViewSubs
# Covering 
@SalmonP1
Feature: Test to verify that user can click Why, How, What on Homepage


#  Scenario: Verify that user can click Why on Homepage
#    Given I navigate to the Salmon "HOME" page
#     And I click on "WhySalmon" on Homepage
#     Then I arrive at "AboutUs" page

#  Scenario: Verify that user can click How on Homepage
#    Given I navigate to the Salmon "HOME" page
#     And I click on "HowWeHelp" on Homepage
#     Then I arrive at "Solutions" page

#  Scenario: Verify that user can click What on Homepage
#    Given I navigate to the Salmon "HOME" page
#     And I click on "WhatWeDo" on Homepage
#     Then I arrive at "Services" page

   Scenario: Verify that user can click Why on Homepage
     Given I navigate to the Salmon "HOME" page
      And I click "Why Salmon" on Homepage
      Then I arrive at "AboutUs" page

   Scenario: Verify that user can click How on Homepage
     Given I navigate to the Salmon "HOME" page
      And I click "How We Help" on Homepage
      Then I arrive at "Solutions" page

   Scenario: Verify that user can click What on Homepage
     Given I navigate to the Salmon "HOME" page
      And I click "What We Do" on Homepage
      Then I arrive at "Services" page