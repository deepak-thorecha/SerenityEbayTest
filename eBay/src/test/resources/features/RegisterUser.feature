#Author: deepak.thorecha@cognizant.com
Feature: Register a new User and update Address
  I want to register a new user and update address for it

  Scenario Outline: Register user and update address
    Given the user is on the Ebay home page
    When the user registers a new account for <times> time
    And adds a new Address
    Then I validate the added address

    Examples: 
      | times  |
      | 1 |
      | 2 |
