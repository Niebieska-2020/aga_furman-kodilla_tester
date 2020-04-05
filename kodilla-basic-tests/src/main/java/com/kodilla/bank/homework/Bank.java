package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;

    public int getBalance(int i) {
        int sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum = sum + cashMachine.balanceOfCashMachine();
        }
        return sum;
    }

    public int getPaymentsCount() {
        int sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum = sum + cashMachine.getPaymentsCount();
        }
        return sum;
    }

    public int getWithdrawalsCount() {
        int sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum = sum + cashMachine.getWithdrawalsCount();
        }
        return sum;
    }

    public double getAveragePaymentsCount() {
        double sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum = sum + cashMachine.getPaymentsSum();
        }
        return sum / getPaymentsCount();
    }

    public double getAverageWithdrawalsCount() {
        double sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum = sum + cashMachine.getWithdrawalsSum();
        }
        return sum / getWithdrawalsCount();
    }
}
