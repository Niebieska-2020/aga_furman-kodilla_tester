Feature: Cash Withdrawal successful path
  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited <money> in my wallet
    When I request <amount>
    Then <contents> should be dispensed
    And The balance of my wallet should be <balance>
    Examples:
    | money | amount | contents | balance |
    | 200   | 30      | 30      | 170     |
    | 200   | 250     | 200     | 0       |
    | 200   | 0       | 0       | 200     |
    | 200   | 200     | 200     | 0       |


