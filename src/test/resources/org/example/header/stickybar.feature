Feature: Sticky bar functionality on header
  As a user, I want to view and access the sticky bar on header, on the web page

  Scenario: Sticky bar is visible on website below the rest of the on the header
    Given I am on the website
    When I notice the header displayed on the web page
    Then The sticky bar should be located below the rest of the header components on the web page

  Scenario: Access the active link of the sticky bar each time it clicks on the banner on the web page
    Given I am on the website
    When I click on the sticky bar
    Then A new page should be open on the same tab