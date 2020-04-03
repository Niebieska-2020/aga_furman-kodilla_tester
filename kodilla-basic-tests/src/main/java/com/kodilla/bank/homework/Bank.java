package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;
    public int size;

    public Bank() {
    this.size = 0;
    this.cashMachines = new CashMachine[0];
    }

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size-1] = cashMachine;
        this.cashMachines = newTab;
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

    public void addCashMachine(int i) {
        return;
    }
}
