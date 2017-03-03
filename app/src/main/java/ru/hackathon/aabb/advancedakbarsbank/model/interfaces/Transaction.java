package ru.hackathon.aabb.advancedakbarsbank.model.interfaces;

import ru.hackathon.aabb.advancedakbarsbank.model.Enums.TransactionType;

import java.security.Timestamp;

public abstract class Transaction {
    private TransactionType transactionType;
    private String transactionName;
    private Timestamp transactionDateAndTime;

    public String getTransactionName() {
        return transactionName;
    }

    public Timestamp getTransactionDateAndTime() {
        return transactionDateAndTime;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }
}
