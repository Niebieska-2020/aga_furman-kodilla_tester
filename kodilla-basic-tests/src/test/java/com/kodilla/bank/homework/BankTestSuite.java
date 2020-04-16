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
    public void shouldReturnBalanceFromAllCashMachinesZeroWhenBankIsEmpty() {
        // given
        CashMachine cashMachine1 = createCashMachine(new int[]{0});
        CashMachine cashMachine2 = createCashMachine(new int[]{100, -100});
        Bank bank = createBank(new CashMachine[]{cashMachine1, cashMachine2});

        // when
        int totalBalance1 = bank.getBalance();

        // then
        assertEquals(0, totalBalance1);
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
    public void shouldCountPaymentsAndReturnZeroWhenBankIsEmpty() {
        // given
        CashMachine cashMachine1 = createCashMachine(new int[]{0});
        CashMachine cashMachine2 = createCashMachine(new int[]{0});
        Bank bank = createBank(new CashMachine[]{cashMachine1, cashMachine2});

        // when
        int countPayments1 = bank.getPaymentsCount();

        // then
        assertEquals(0, countPayments1);
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
    public void shouldCountWithdrawalsAndReturnZeroWhenBankIsEmpty() {
        // given
        CashMachine cashMachine1 = createCashMachine(new int[]{0});
        CashMachine cashMachine2 = createCashMachine(new int[]{0});
        Bank bank = createBank(new CashMachine[]{cashMachine1, cashMachine2});

        // when
        int countWithdrawals1 = bank.getWithdrawalsCount();

        // then
        assertEquals(0, countWithdrawals1);
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
    public void shouldGetAveragePaymentsAndReturnZeroWhenBankIsEmpty() {
        // given
        CashMachine cashMachine1 = createCashMachine(new int[]{0});
        CashMachine cashMachine2 = createCashMachine(new int[]{100, -100});
        Bank bank = createBank(new CashMachine[]{cashMachine1, cashMachine2});

        // when
        double averageResult1 = bank.getAveragePaymentsCount();

        // than
        assertEquals(0, averageResult1);
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
    public void shouldGetAverageWithdrawalsAndReturnZeroWhenBankIsEmpty() {
        // given
        CashMachine cashMachine1 = createCashMachine(new int[]{0});
        CashMachine cashMachine2 = createCashMachine(new int[]{100, -100});
        Bank bank = createBank(new CashMachine[]{cashMachine1, cashMachine2});

        // when
        double averageWithdrawals1 = bank.getAverageWithdrawalsCount();

        // than
        assertEquals(0, averageWithdrawals1);
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
