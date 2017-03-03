package ru.hackathon.aabb.advancedakbarsbank.model.service;

import ru.hackathon.aabb.advancedakbarsbank.model.entity.gettings.SimpleTransactionGetting;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionsPlug {
    List<Transaction> getTransactions(){
        List<Transaction> transactions = new ArrayList<>();

        java.sql.Timestamp firstTimestamp = java.sql.Timestamp.valueOf("2017-03-03 10:10:10.0");
        java.sql.Timestamp secondTimestamp = java.sql.Timestamp.valueOf("2017-04-04 10:10:10.0");

        SimpleTransactionGetting firstTransactionGetting = new SimpleTransactionGetting();
        firstTransactionGetting.setCost(50000);
        firstTransactionGetting.setTransactionName("salary");
        firstTransactionGetting.setTransactionDateAndTime(firstTimestamp);

        SimpleTransactionGetting secondTransactionGetting = new SimpleTransactionGetting();
        secondTransactionGetting.setTransactionName("friend's payment");
        secondTransactionGetting.setCost(1000);
        secondTransactionGetting.setTransactionDateAndTime(secondTimestamp);

        transactions.add(firstTransactionGetting);
        transactions.add(secondTransactionGetting);

        return transactions;
    }
}
