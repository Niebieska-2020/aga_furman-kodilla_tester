package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank() {
        this.cashMachines = new CashMachine[0];
    }

    public void addCashmachine(CashMachine cashMachine) {
        CashMachine[] cashMachines = new CashMachine[this.cashMachines.length + 1];
        System.arraycopy(this.cashMachines, 0, cashMachines, 0, this.cashMachines.length);
        cashMachines[this.cashMachines.length] = cashMachine;
        this.cashMachines = cashMachines;
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public int getBalance() {
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
