package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BankTestSuite {

    @Test
    public void shouldReturnCashMachineBalance() {
        CashMachine cashMachine = new CashMachine();
        int[] cashmachines = new int[] {50, 150, 400, -150};
        int sumBalance = cashMachine.balanceOfCashMachine();
        assertEquals(450, sumBalance);
    }

    @Test
    public void testgetBalance() {
        Bank bank = new Bank();
        int totalBalance = bank.getBalance(450);
        assertEquals(450, totalBalance);
    }

    @Test
    public void testgetPaymentsCount() {
        Bank bank = new Bank();
        int sumResult = bank.getPaymentsCount();
        assertEquals(600, sumResult);
    }

    @Test
    public void testgetWithdrawalsCount() {
        Bank bank = new Bank();
        int sumResult = bank.getWithdrawalsCount();
        assertEquals(150, sumResult);
    }

    @Test
    public void testgetAveragePaymentsCount() {
        Bank bank = new Bank();
        double averageResult = bank.getAveragePaymentsCount();
        assertEquals(200, averageResult);
    }

    @Test
    public void testgetAverageWithdrawalsCount() {
        Bank bank = new Bank();
        double averageWithdrawals = bank.getAverageWithdrawalsCount();
        assertEquals(-150, averageWithdrawals);
    }
}
