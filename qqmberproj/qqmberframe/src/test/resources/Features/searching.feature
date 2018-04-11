Feature: As a user, I want to obtain information about an item so that I may impress my friends
  Scenario: search for item on bol.com
    Given I am at google home page
    When I enter search term 'bla'
    Then I see 'some result'


  Scenario Outline: Enter a searchterm and search
    Given I am at google home page
    When I enter search term '<Searchterm>'
    Then I see '<some result>'
    Examples:
      |Searchterm|some result|
      |  Bol     |   Bol.com        |