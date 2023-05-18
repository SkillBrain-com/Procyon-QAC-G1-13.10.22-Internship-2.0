Feature: Cookies popup functionality on website
  As a user, I want to navigate on website after I accepted cookies

Scenario: Accept cookies
  Given I am on the https://pl-galeria-warminska-uat.azurewebsites.net website
  When The cookies are displaying and I accept them
  Then Next, the page should be available for searching