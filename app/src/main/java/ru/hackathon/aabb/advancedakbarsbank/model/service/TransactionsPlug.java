package ru.hackathon.aabb.advancedakbarsbank.model.service;

import ru.hackathon.aabb.advancedakbarsbank.model.entity.gettings.SimpleTransactionGetting;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionsPlug {
    List<Transaction> getTransactions(){
        List<Transaction> transactions = new ArrayList<>();

        SimpleTransactionGetting firstTransactionGetting = new SimpleTransactionGetting();
        firstTransactionGetting.setCost(50000);
        firstTransactionGetting.setTransactionName("salary");
        firstTransactionGetting.setTransactionDateAndTime(new java.sql.Timestamp(System.currentTimeMillis()));

        SimpleTransactionGetting secondTransactionGetting = new SimpleTransactionGetting();
        secondTransactionGetting.setTransactionName("friend's payment");
        secondTransactionGetting.setCost(1000);
        secondTransactionGetting.setTransactionDateAndTime(new java.sql.Timestamp(System.currentTimeMillis()));

        transactions.add(firstTransactionGetting);
        transactions.add(secondTransactionGetting);

        return transactions;
    }
}
