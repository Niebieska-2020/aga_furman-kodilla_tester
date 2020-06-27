package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class SuccessfulWalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Teller teller = new Teller(cashSlot);

    public SuccessfulWalletSteps() {

        Given("I have deposited {int} in my wallet", (Integer moneyValue) -> {
            wallet.deposit(moneyValue);
            Assert.assertEquals("Incorrect wallet balance", (int)moneyValue, wallet.getBalance());
        });

        When("I request {int}", (Integer amountValue) -> {
            teller.withdraw(wallet, amountValue);
            Assert.assertTrue(cashSlot.getContents() <= amountValue);
        });

        Then("{int} should be dispensed", (Integer contents) -> {
            Assert.assertEquals((int)contents, cashSlot.getContents());
        });

        Then("The balance of my wallet should be {int}", (Integer balance) -> {
            Assert.assertEquals((int)balance, wallet.getBalance());
        });
    }
}
