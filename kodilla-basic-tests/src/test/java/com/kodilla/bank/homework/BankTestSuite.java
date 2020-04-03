package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveZeroTransactions() {
        Bank bank = new Bank();
        CashMachine[] cashMachines = bank.getCashMachines();
        assertEquals(0, cashMachines.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        Bank bank = new Bank();
        bank.addCashMachine(2000);
        bank.addCashMachine(1500);

        CashMachine[] cashMachines = bank.getCashMachines();
        assertEquals(2, cashMachines.length);
        assertEquals(2000, cashMachines[0]);
        assertEquals(1500, cashMachines[1]);
    }

    @Test
    public void shouldCorrectCalculateBalance() {
        Bank bank = new Bank();
        bank.addCashMachine(2000);
        bank.addCashMachine(-2000);
        bank.addCashMachine(1600);

        int balanceCashMachnies = bank.getBalance();
        assertEquals(1600, balanceCashMachnies);
    }

    @Test
    public void shouldCorrectCalculatePaymentCount() {
        Bank bank = new Bank();
    }

    @Test
    public void shouldCorrectCalculatePaymentSum() {
        Bank bank = new Bank();
    }

    @Test
    public void shouldCorrectCalculateWithdrawalsCount() {
        Bank bank = new Bank();
    }

    @Test
    public void shouldCorrectCalculateWithdrawalsSum() {
        Bank bank = new Bank();
    }
}
