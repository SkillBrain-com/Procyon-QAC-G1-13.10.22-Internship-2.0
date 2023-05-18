Feature: Header functionality on web page
    As a user, I want to see if the Header is displayed on the website and if I can access it whenever the page is scrolled down

Scenario: Header is displayed on the website
    Given I am on the https://pl-galeria-warminska-uat.azurewebsites.net website
    When I notice the top of the page
    Then The header should be displayed at the top on the page

Scenario: Header keeps sticked on the page, while the page is scrolled down
    Given I am on the https://pl-galeria-warminska-uat.azurewebsites.net website
    When I am scrolling down on the page
    Then I should see that the header is keeping sticked at the top of the page while I am scrolling down on the page