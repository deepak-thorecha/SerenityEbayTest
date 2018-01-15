#Author: deepak.thorecha@gmail.com
Feature: Advanced search
  I want to use advanced search to filter search resutls

  Scenario Outline: Advanced search to filter search results
    Given the user is on the Ebay home page
    When the user performs advanced search for <times> time 
    And specify price and buyFormat
    Then I validate the result items have filter applied

    Examples: 
      | times  |
      | 1 |
      | 2 |
