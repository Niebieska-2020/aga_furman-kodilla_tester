package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachinesTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        // given
        CashMachine cashMachine = new CashMachine();

        // when
        int[] values = cashMachine.getTransactions();

        // than
        assertEquals(0, values.length);
   }

    @Test
    public void shouldAddThreeTransactions() {
        // given
        CashMachine cashMachine = createCashMachine(new int []{100, -50, 0});

        // when
        int[] transactions = cashMachine.getTransactions();

        // than
        assertEquals(3, transactions.length);
        assertEquals(100, transactions[0]);
        assertEquals(-50, transactions[1]);
        assertEquals(0, transactions[2]);
    }

    @Test
    public void shouldCountBalanceOfCashMachine() {
        // given
        CashMachine cashMachine = createCashMachine(new int[]{350, -50, 0});

        // when
        double count = cashMachine.balanceOfCashMachine();

        // then
        assertEquals(300, count);
    }

    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        // given
        CashMachine cashMachine = createCashMachine(new int[]{0});

        // when
        cashMachine.balanceOfCashMachine();

        // then
        assertEquals(0, cashMachine.balanceOfCashMachine(), 0.01);
    }

    @Test
    public void shouldCountNumberOfTransactions() {
        // given
        CashMachine cashMachine = createCashMachine(new int[]{300, -50, -250, 600, 0});

        // when
        int numberOfTransactions = cashMachine.numberOfTransactions();

        // then
        assertEquals(5, numberOfTransactions);
    }

    @Test
    public void shouldCountNumberOfTransactionIfAllTransactionsWithdrawals() {
        // given
        CashMachine cashMachine = createCashMachine(new int[]{-200, -50});

        // when
        int countTransactions = cashMachine.numberOfTransactions();

        // then
        assertEquals(2, countTransactions, 0.01);
    }

    @Test
    public void shouldReturnPaymentsCount() {
        // given
        CashMachine cashMachine = createCashMachine(new int[]{200, -50, -100, 250});

        // when
        int paymentsCount = cashMachine.getPaymentsCount();

        // then
        assertEquals(2, paymentsCount, 0.1);
    }

    @Test
    public void shouldReturnWithdrawalsCount() {
        // given
        CashMachine cashMachine = createCashMachine(new int[]{200, -50, -100, 250});

        // when
        int withdrawalsCount = cashMachine.getWithdrawalsCount();

        // then
        assertEquals(-2, withdrawalsCount);
    }

    @Test
    public void shouldReturnPaymentsSum() {
        // given
        CashMachine cashMachine = createCashMachine(new int[]{200, -50, -100, 250});

        // when
        int paymentsSum = cashMachine.getPaymentsSum();

        // then
        assertEquals(450, paymentsSum, 0.1);
    }

    @Test
    public void shouldReturnWithdrawalsSum() {
        // given
        CashMachine cashMachine = createCashMachine(new int[]{200, -50, -100});

        // when
        int withdrawalsSum = cashMachine.getWithdrawalsSum();

        // then
        assertEquals(150, withdrawalsSum);
    }

    private CashMachine createCashMachine(int[] transactions) {
        CashMachine cashMachine = new CashMachine();
        for (int transaction : transactions) {
            cashMachine.addTransaction(transaction);
        }
        return cashMachine;
    }
}
