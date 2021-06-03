Feature: feature to test login

  Scenario: Check login is successfull with valid credentials

    Given user is on google search
    When user enters the word web driver in search
    And clicks on enter
    Then user is navigated to the web driver search page
    