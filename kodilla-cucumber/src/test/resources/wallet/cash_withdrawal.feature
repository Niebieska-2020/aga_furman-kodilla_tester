Feature: Cash Withdrawal
  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited <money> in my wallet
    When I request <amount>
    Then <amount> should be dispensed
    Examples:
    | money | amount |
    | $200  | $30    |

    Scenario Outline: Unsuccessful withdrawal from a wallet in credit
      Given I have deposited <money> in my wallet
      When I request <amount>
      Then Not should be dispensed. Your balance is now <balance>
      Examples:
      | money | amount | balance |
      | 0     | 50     | 0       |
      | 50    | 100    | 50      |
      | -50   | 150    | -50     |
      | 100   | 0      | 100     |
