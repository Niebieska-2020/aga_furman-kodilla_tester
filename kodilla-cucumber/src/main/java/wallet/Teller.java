package wallet;

public class Teller {

    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public String withdraw(Wallet wallet, int amount) {
        if (wallet.getBalance() >= amount) {
            int debit = wallet.debit(amount);
            cashSlot.dispense(debit);
            return "Cash withdrawn";
        } else {
            return "I have insufficient funds in my account";
        }
    }
}
