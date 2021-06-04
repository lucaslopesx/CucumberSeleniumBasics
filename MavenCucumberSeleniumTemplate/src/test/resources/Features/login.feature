Feature: Search words in google
  Scenario Outline:
    Given is on google search
    When enters the "<word>" in search
    Then the word is searched

    Examples:
    | word |
    | twitter |
    | facebook |
    | cyan agro |