package ru.hackathon.aabb.advancedakbarsbank.model.service;

import ru.hackathon.aabb.advancedakbarsbank.model.enums.TransactionTypeEnum;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<Transaction> transactions;

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void transactionAdding(Transaction transaction){
        transactions.add(transaction);
    }

    public int getTransactionSum(TransactionTypeEnum transactionTypeEnum){
        int summ=0;
        for (Transaction transaction: transactions) {
            if(transaction.getTransactionTypeEnum().equals(transactionTypeEnum))
                summ+=transaction.getMoney();
        }
        return summ;
    }
}
