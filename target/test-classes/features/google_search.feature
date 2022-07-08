Feature: Google Search Functionality Title Verification
  User story: As a user, when I am on the Google search page
  I should be able to search whatever I want and see relevant information
  #done w/ bus layer, to go to implementation layer -> have to go to stepsdef
  #create a new class
  Background:
    Given User is on Google search page

    #Work in Progress - wip
  Scenario: Search functionality result title verification
    Given User is on Google search page
    When User types apple in the google search box and clicks enter
    Then User sees apple - Google Search is in the google title

  @googleSearch
  Scenario: Search functionality result title verification
    Given User is on Google search page
    When User types "apple" in the google search box and clicks enter
    Then User sees "apple - Google Search" is in the google title