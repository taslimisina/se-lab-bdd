@tag
Feature: Calculator
  As a user, I want to do multiplication, division, and power operations between two numbers.
  Scenario: multiply two numbers
    Given Two input values, 2 and 3
    When I do operation * between the two values
    Then I expect the result to be 6

  Scenario Outline:
    Given Two input values, <first> and <second>
    When I do operation <opt> between the two values
    Then I expect the result to be <result>
    Examples:
      | first | second | opt | result |
      | 3 | 4 | * | 12 |
      | -5 | 2 | / | -2.5 |
      | 2 | 3 | ^  | 8 |
      | 0 | 3 | *  | 0 |
      | 0 | 5 | /  | 0 |
      | 0 | 2 | ^  | 0 |
      | 100 | 0 | * | 0 |
      | 25  | 0 | ^ | 1 |
      | 4   | 2 | / | 2 |
      | 4   | -1| ^ | 0.25|
      | 2  | -3| ^ | 0.125|
      | 2  | -2| * | -4   |
      | -5 | 3 | * | -15  |

