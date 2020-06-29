package wallet;

import io.cucumber.java8.En;

import static org.junit.Assert.assertEquals;

public class DisplayBalanceWalletSteps implements En {

    public DisplayBalanceWalletSteps() {

        Wallet wallet = new Wallet();
        CashSlot cashSlot = new CashSlot();
        Teller teller = new Teller(cashSlot);

        Given("my account has been credited with {int}", (Integer credit) -> {
            wallet.deposit(credit);
            teller.withdraw(wallet, credit);
        });

        Then("I should see that my balance is {int}", (Integer expectedBalance) -> {
            assertEquals((int)expectedBalance, cashSlot.getContents());
        });

        When("I check my balance", () -> {
            assertEquals(0, wallet.getBalance());
        });
    }
}
