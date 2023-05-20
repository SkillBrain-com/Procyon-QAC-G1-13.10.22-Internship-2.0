Feature: Inspirations functionality on website
  As a user, I want to navigate the Inspirations section of the website and see the inspirational articles published

Scenario: Inspiration category visible on the navigation menu
  Given I am on the website
  When I notice the Inspirations section on the navigation menu, from the top of the page
  Then The Inspirations section should be displayed on the navigation menu, on header

Scenario: View the dropdown list with the subcategories of inspirational articles displayed every time I want to hover over it
  Given I am on the website
  When I hover over the Inspirations section from navigation menu
  Then I should see the dropdown list with the subcategories of inspirational articles displayed

Scenario: Access the Inspiration/Blog page on the website
  Given I am on the website
  When I click on the Inspiration from the navigation menu
  Then The Inspiration/Blog page should be displayed with the inspiration subcategories fields and the inspirational articles published on website, in a new tab

Scenario: Access the inspiration articles published on the inspiration page
  Given I am on the Inspiration Page
  And I am scrolling down on the page
  When I see the inspiration articles section marked as promoted on the homepage and which are published as a carousel on the Inspiration page
  And I click on one of the Inspiration articles
  Then The showcased page for the selected inspiration/blog article should be displayed in a new tab
