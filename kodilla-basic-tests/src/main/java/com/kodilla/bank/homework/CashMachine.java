package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    public void addTransactions(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size-1] = transaction;
        this.transactions = newTab;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int balanceOfCashMachine() {
        if (this.transactions.length == 0){
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public int numberOfTransactions() {
        return transactions.length;
    }

    public int getPaymentsCount() {
        int paymentsCount = 0;
        for (int transaction : transactions) {
            if (transaction > 0) {
                paymentsCount++;
            }
        }
        return paymentsCount;
    }

    public int getWithdrawalsCount() {
        int withdrawalsCount = 0;
        for (int transaction : transactions) {
            if (transaction < 0) {
                withdrawalsCount++;
            }
        }
        return withdrawalsCount;
    }

    public int getPaymentsSum() {
        int paymentsSum = 0;
        for (int transaction : transactions) {
            if (transaction > 0) {
                paymentsSum = paymentsSum + transaction;
            }
        }
        return paymentsSum;
    }

    public int getWithdrawalsSum() {
        int withdrawalsSum = 0;
        for (int transaction : transactions) {
            if (transaction < 0) {
                withdrawalsSum = withdrawalsSum + transaction;
            }
        }
        return - withdrawalsSum;
    }
}
