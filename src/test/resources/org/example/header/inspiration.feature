Feature: Inspirations functionality on website
  As a user, I want to navigate the Inspirations section of the website and see the inspirational articles published

Scenario: Inspiration category visible on the navigation menu
  Given I am on the https://pl-galeria-warminska-uat.azurewebsites.net website
  When I notice the Inspirations section on the navigation menu, from the top of the page
  Then The Inspirations section should be displayed on the navigation menu, on header

Scenario: View the dropdown list with the subcategories of inspirational articles displayed every time I want to hover over it
  Given I am on the https://pl-galeria-warminska-uat.azurewebsites.net website
  When I hover over the Inspirations section from navigation menu
  Then I should see the dropdown list with the subcategories of inspirational articles displayed