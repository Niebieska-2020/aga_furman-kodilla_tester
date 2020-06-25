package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

import java.util.Optional;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Teller teller = new Teller(cashSlot);

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance",200, wallet.getBalance());
        });

        When("I request $30", () -> {
            teller.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Given("I have deposited {int} in my wallet", (Integer money) -> {
            wallet.deposit(money);

        });

        When("I request {int}", (Integer amount) -> {
            teller.withdraw(wallet, amount);

        });

        Then("Not should be dispensed. Your balance is now {int}", (Integer balance) -> {
            Optional<Integer> optionalCashSlot = Optional.ofNullable(wallet.getBalance());
            Integer balanceResult = optionalCashSlot.orElse(new CashSlot().getContents());
            Assert.assertEquals(balance, balanceResult);
        });
    }
}
