Feature: Languages toggle functionality on website
  As a user, I want to switch the language from the toggle language located on the header, on the web page

  Scenario: Languages toggle icon is displayed on the header, on the web page
    Given I am on the website
    When I notice the top left of the page
    Then The languages toggle icon should be displayed on the header

  Scenario: User is able to view the content of the website in Polish language
    Given I am on the website
    And Click on languages toggle
    When Choose Polish language
    Then The content of page should be displayed in Polish language

  Scenario: User is able to view the content of the website in English language
    Given I am on the website
    And Click on languages toggle
    When Choose English language
    Then The content of page should be displayed in English language