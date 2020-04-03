package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachinesTestSuite {

    @Test
    public void shouldHaveZeroLength() {
      CashMachine cashMachine = new CashMachine();

      int[] values = cashMachine.getTransactions();
        assertEquals(0, values.length);
   }
    @Test
    public void shouldAddTwoTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(100);
        cashMachine.addTransactions(-50);
        cashMachine.addTransactions(0);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(3, transactions.length);
        assertEquals(100, transactions[0]);
        assertEquals(-50, transactions[1]);
        assertEquals(0, transactions[2]);
    }

    @Test
    public void shouldCountAverage() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(350);
        cashMachine.addTransactions(-50);
        cashMachine.addTransactions(0);

        double countAverage = cashMachine.balanceOfCashMachine();
        assertEquals(100, countAverage, 0.01);
    }

    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.balanceOfCashMachine(), 0.01);
    }

    @Test
    public void shouldCountAverageIfAllTransactionsWithdrawMoney() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(-50);
        cashMachine.addTransactions(-200);

        double countAverage = cashMachine.balanceOfCashMachine();
        assertEquals(-125, countAverage, 0.01);
    }

    @Test
    public void shouldCountNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(300);
        cashMachine.addTransactions(-50);
        cashMachine.addTransactions(-250);
        cashMachine.addTransactions(600);
        cashMachine.addTransactions(0);

        int numberOfTransactions = cashMachine.numberOfTransactions();
        assertEquals(5, numberOfTransactions);
    }

    @Test
    public void shouldCountNumberOfTransactionIfAllTransactionsWithdrawMoney() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(-50);
        cashMachine.addTransactions(-200);

        int countTransactions = cashMachine.numberOfTransactions();
        assertEquals(2, countTransactions, 0.01);
    }
}
