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
        if (this.cashMachines.length == 0) {
            return 0;
        }
        int sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum = sum + cashMachine.balanceOfCashMachine();
        }
        return sum;
    }

    public int getPaymentsCount() {
        int sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            if (cashMachine != null) {
                sum += cashMachine.getPaymentsCount();
            }
        }
        return sum;
    }

    public int getWithdrawalsCount() {
        int sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            if (cashMachine != null) {
            sum = sum + cashMachine.getWithdrawalsCount();
            }
         }
        return sum;
    }

    public double getAveragePaymentsCount() {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        double sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            if (cashMachine.getPaymentsCount() > 0) {
                sum = sum + cashMachine.getPaymentsSum();
                }
            if (sum == 0) {
                return 0;
                }
            }
        return sum / getPaymentsCount();
    }

    public double getAverageWithdrawalsCount() {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        double sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            if (cashMachine.getWithdrawalsCount() < 0) {
                sum = sum + cashMachine.getWithdrawalsSum();
            }
            if (sum == 0) {
                return 0;
            }
        }
        return sum / getWithdrawalsCount();
    }
}
