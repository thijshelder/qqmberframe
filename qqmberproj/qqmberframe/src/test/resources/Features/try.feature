Feature: As a user, I really need to know one or two things about Cucumber so that I nail my job interview

  Scenario: an introductionary example
    Given I am thijs
    When I add '1' and '3'
    Then the result is '4'

  Scenario Outline: adding
    Given I am thijs
    When I add '<number1>' and '<number2>'
    Then the result is '<result>'
    Examples:
    |number1|number2|result|
    |1    |1        |2     |
    |3    |4        |7     |
    |234  |345      |579   |
    |5    |6        |8     |


