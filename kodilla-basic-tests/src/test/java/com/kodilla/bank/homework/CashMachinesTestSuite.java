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
    public void shouldAddThreeTransactions() {
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
    public void shouldCountBalanceOfCashMachine() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(350);
        cashMachine.addTransactions(-50);
        cashMachine.addTransactions(0);

        double countAverage = cashMachine.balanceOfCashMachine();
        assertEquals(300, countAverage);
    }

    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.balanceOfCashMachine(), 0.01);
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
    public void shouldCountNumberOfTransactionIfAllTransactionsWithdrawalsMoney() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(-50);
        cashMachine.addTransactions(-200);

        int countTransactions = cashMachine.numberOfTransactions();
        assertEquals(2, countTransactions, 0.01);
    }

    @Test
    public void shouldReturnPaymentsCount() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(-50);
        cashMachine.addTransactions(200);
        cashMachine.addTransactions(-100);
        cashMachine.addTransactions(250);

        int paymentsCount = cashMachine.getPaymentsCount();
        assertEquals(2, paymentsCount, 0.1);
    }

    @Test
    public void shouldReturnWithdrawalsCount() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(-50);
        cashMachine.addTransactions(200);
        cashMachine.addTransactions(-100);
        cashMachine.addTransactions(250);

        int withdrawalsCount = cashMachine.getWithdrawalsCount();
        assertEquals(-2, withdrawalsCount);
    }

    @Test
    public void shouldReturnPaymentsSum() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(-50);
        cashMachine.addTransactions(200);
        cashMachine.addTransactions(-100);
        cashMachine.addTransactions(250);

        int paymentSum = cashMachine.getPaymentsSum();
        assertEquals(450, paymentSum, 0.1);
    }

    @Test
    public void shouldReturnWithdrawalsSum() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransactions(-50);
        cashMachine.addTransactions(200);
        cashMachine.addTransactions(-100);

        int withdrawalsSum = cashMachine.getWithdrawalsSum();
        assertEquals(150, withdrawalsSum);
    }
}
