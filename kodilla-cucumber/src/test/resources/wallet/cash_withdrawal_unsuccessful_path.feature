Feature: Cash withdrawal unsuccessful path
  Scenario Outline: Unsuccessful withdrawal from a wallet in credit
    Given I have deposited <money> in my wallet
    When I request <amount>
    Then <contents> not should be dispensed
    And The balance of my wallet is now <balance>
    Examples:
      | money | amount | contents | balance |
      | 0     | 50     | 0        | 0       |
      | 50    | 100    | 0        | 50      |
      | 100   | 0      | 0        | 100     |
