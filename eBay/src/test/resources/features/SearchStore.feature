Feature: Search Store
  I need to Search an Item in Fashion Store

  Scenario: Searching for a item on Store
    Given the user is on the Ebay home page
    When the user navigates to 'Fashion > Shoes > "DC Shoes"'
    And searches for "backpacks"
    Then they should see results with various items
    When the user click on one item
    Then the user should see correct title and price details
