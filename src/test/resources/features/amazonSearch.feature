Feature: Navigation and searching in Amazon web page
  In order to find items to buy
  As a generic user
  I want to search in Amazon web page

  Scenario: Navigate to Amazon web page and search for smartphone
    Given I navigate to Amazon web page
    And I verify that Amazon web page was opened
    When I search for "Smartphone"
    And I verify that minimum "10" search results were shown
    Then I save first "10" search results and print them in console
