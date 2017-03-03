package ru.hackathon.aabb.advancedakbarsbank.model.service;

import ru.hackathon.aabb.advancedakbarsbank.model.enums.TransactionTypeEnum;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Payment;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<Transaction> transactions= new ArrayList<>();
    private List<Payment> payments = new ArrayList<>();

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void transactionAdding(Transaction transaction) {
        transactions.add(transaction);
        if(transaction.getTransactionTypeEnum().equals(TransactionTypeEnum.PAYMENT))
            payments.add((Payment) transaction);
    }
}