Feature: Gift card functionality on header
  As a user, I want to view the Gift card icon and access the Gift card landing page on the website

  Scenario: Gift card is visible on header
    Given I am on the website
    When I notice the top left of the page
    Then Gift card icon should be displayed on header

  Scenario: Access gift card landing page on header
    Given I am on the website
    When I click on Gift card icon
    Then A new specific page to gift card landing page should be open