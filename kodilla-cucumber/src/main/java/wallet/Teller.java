package wallet;

public class Teller {

    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public int withdraw(Wallet wallet, int amount) {
        if (amount > 0) {
            int debit = wallet.debit(amount);
            cashSlot.dispense(debit);
        }
        return 0;
    }
}
