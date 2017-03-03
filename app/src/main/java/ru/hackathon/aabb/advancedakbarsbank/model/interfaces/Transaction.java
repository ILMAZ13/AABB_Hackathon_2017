package ru.hackathon.aabb.advancedakbarsbank.model.interfaces;

import ru.hackathon.aabb.advancedakbarsbank.model.enums.TransactionTypeEnum;

import java.security.Timestamp;

public abstract class Transaction {
    private TransactionTypeEnum transactionTypeEnum;
    private String transactionName;
    private Timestamp transactionDateAndTime;
    private long money;

    public String getTransactionName() {
        return transactionName;
    }

    public Timestamp getTransactionDateAndTime() {
        return transactionDateAndTime;
    }

    public TransactionTypeEnum getTransactionTypeEnum() {
        return transactionTypeEnum;
    }

    public void setTransactionTypeEnum(TransactionTypeEnum transactionTypeEnum) {
        this.transactionTypeEnum = transactionTypeEnum;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public void setTransactionDateAndTime(Timestamp transactionDateAndTime) {
        this.transactionDateAndTime = transactionDateAndTime;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }
}
