package com.kodilla.bank.homework;

public class Bank {
    private int transaction;
    private CashMachine CashMachine;
    private CashMachine CashMachine1;
    private CashMachine CashMachine2;

    public Bank() {
        this.transaction = transaction;
        this.CashMachine = new CashMachine();
        this.CashMachine1 = new CashMachine();
        this.CashMachine2 = new CashMachine();
    }

    public void addCashMachineTransaction(int transaction) {
        this.CashMachine.addTransactions(transaction);
    }

    public void addCashMachine1Transaction(int transaction) {
        this.CashMachine1.addTransactions(transaction);
    }

    public void addCashMachine2Transaction(int transaction) {
        this.CashMachine2.addTransactions(transaction);
    }

    public int getTransactions() {
        return transaction;
    }

    public int[] getTransactionCashMachine() {
        return this.CashMachine.getTransactions();
    }

    public int[] getTransactionCashMachine1() {
        return this.CashMachine1.getTransactions();
    }

    public int[] getTransactionCashMachine2() {
        return this.CashMachine2.getTransactions();
    }
    // całkowity bilans ze wszystkich bankomatów

    // liczbę transakcji związana z wypłatą

    // liczbę transakcji związaną z wpłatą pieniędzy,

    // średnią wartość wypłaty

    // średnią wartość wpłaty
}
