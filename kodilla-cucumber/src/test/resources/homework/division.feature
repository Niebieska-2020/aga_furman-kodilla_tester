# new feature
# Tags: optional

Feature: Is divisible by number?

  Scenario Outline: Number is or isn't divisible by another number
    Given I have a <number>
    When Checking if number is divisible by 3 and 5
    Then I should be returned <answer>
    Examples:
      | number | answer     |
      | 3      | "Fizz"     |
      | 15     | "FizzBuzz" |
      | 20     | "Buzz"     |
      | 1      | "None"     |
