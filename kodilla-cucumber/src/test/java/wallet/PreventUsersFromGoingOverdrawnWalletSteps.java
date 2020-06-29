package wallet;

import io.cucumber.java8.En;

import static org.junit.Assert.assertEquals;

public class PreventUsersFromGoingOverdrawnWalletSteps implements En {

    Wallet wallet = new Wallet();
    CashSlot cashSlot = new CashSlot();
    Teller teller = new Teller(cashSlot);
    String message;

    public PreventUsersFromGoingOverdrawnWalletSteps() {
        Given("my wallet has been credited with $100", () -> {
            wallet.deposit(100);
        });

        When("I withdraw $200", () -> {
            message = teller.withdraw(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
            assertEquals(100, wallet.getBalance());
            assertEquals(0, cashSlot.getContents());
        });

        Then("I should be told that I have insufficient funds in my account", () -> {
            assertEquals("I have insufficient funds in my account", message);
        });
    }
}
