package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BankTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        // given
        Bank bank = new Bank();

        // when
        CashMachine[] values = bank.getCashMachines();

        // then
        assertEquals(0, values.length);
    }

    @Test
    public void shouldReturnCashMachinesBalanceOfTwoCashMachines() {
        // given
        CashMachine cashMachine1 = createCashMachine(new int[]{100, -50});
        CashMachine cashMachine2 = createCashMachine(new int[]{500, -100, 50});
        Bank bank = createBank(new CashMachine[]{cashMachine1, cashMachine2});

        // when
        int sumBalance = bank.getBalance();

        // then
        assertEquals(500, sumBalance);
    }

    @Test
    public void shouldReturnBalanceFromAllCashMachinesWhenOneIsEmpty() {
        // given
        CashMachine cashMachine1 = createCashMachine(new int[]{100, -50});
        CashMachine cashMachine2 = createCashMachine(new int[]{500, -100, 50});
        CashMachine cashMachine3 = createCashMachine(new int[]{});
        Bank bank = createBank(new CashMachine[]{cashMachine1, cashMachine2, cashMachine3});

        // when
        int totalBalance = bank.getBalance();

        // then
        assertEquals(500, totalBalance);
    }

    @Test
    public void shouldGetCountAllPaymentsFromAllCashMachines() {
        // given
        CashMachine cashMachine1 = createCashMachine(new int[]{100, -50});
        CashMachine cashMachine2 = createCashMachine(new int[]{500, -100, 50});
        Bank bank = createBank(new CashMachine[]{cashMachine1, cashMachine2});

        // when
        int countPayments = bank.getPaymentsCount();

        // then
        assertEquals(3, countPayments);
    }

    @Test
    public void shouldGetCountAllWithdrawalsFromAllCashMachines() {
        // given
        CashMachine cashMachine1 = createCashMachine(new int[]{100, -50});
        CashMachine cashMachine2 = createCashMachine(new int[]{500, -100, 50});
        Bank bank = createBank(new CashMachine[]{cashMachine1, cashMachine2});

        // when
        int countWithdrawals = bank.getWithdrawalsCount();

        // then
        assertEquals(-2, countWithdrawals);
    }

    @Test
    public void shouldGetAveragePaymentsCountFromAllCashMachines() {
        // given
        CashMachine cashMachine1 = createCashMachine(new int[]{100, -50});
        CashMachine cashMachine2 = createCashMachine(new int[]{500, -100});
        Bank bank = createBank(new CashMachine[]{cashMachine1, cashMachine2});

        // when
        double averageResult = bank.getAveragePaymentsCount();

        // than
        assertEquals(300, averageResult);
    }

    @Test
    public void shouldGetAverageWithdrawalsCountFromAllCashMachines() {
        // given
        CashMachine cashMachine1 = createCashMachine(new int[]{100, -50});
        CashMachine cashMachine2 = createCashMachine(new int[]{500, -100});
        Bank bank = createBank(new CashMachine[]{cashMachine1, cashMachine2});

        // when
        double averageWithdrawals = bank.getAverageWithdrawalsCount();

        // than
        assertEquals(-75, averageWithdrawals);
    }

    @Test
    public void shouldReturnAverageEqualsZeroWhenCashMachinesIsEmpty() {
        // given
        CashMachine cashMachine1 = createCashMachine(new int[]{0});
        CashMachine cashMachine2 = createCashMachine(new int[]{100, -100});
        Bank bank = createBank(new CashMachine[]{cashMachine1, cashMachine2});

        // when
        double averageWithdrawals = bank.getAverageWithdrawalsCount();

        // then
        assertNotNull(averageWithdrawals);
    }

    private CashMachine createCashMachine(int[] transactions) {
        CashMachine cashMachine = new CashMachine();
        for (int transaction : transactions) {
            cashMachine.addTransaction(transaction);
        }
        return cashMachine;
    }

    private Bank createBank(CashMachine[] cashMachines) {
        Bank bank = new Bank();
        for (CashMachine cashMachine : cashMachines) {
            bank.addCashmachine(cashMachine);
        }
        return bank;
    }
}
