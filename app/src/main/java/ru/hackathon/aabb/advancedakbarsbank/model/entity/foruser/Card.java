package ru.hackathon.aabb.advancedakbarsbank.model.entity.foruser;

import java.util.Date;
import java.util.List;

import ru.hackathon.aabb.advancedakbarsbank.model.entity.gettings.SimpleTransactionGetting;
import ru.hackathon.aabb.advancedakbarsbank.model.enums.TransactionTypeEnum;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Payment;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Transaction;

public class Card {
    private User user;
    private long cardNumber;
    private Date expirationDate;
    private int cvv;
    private List<Transaction> transactionList;
    private List<Payment> paymentList;
    private List<SimpleTransactionGetting> gettingList;

    public List<SimpleTransactionGetting> getGettingList() {
        return gettingList;
    }

    public void setGettingList(List<SimpleTransactionGetting> gettingList) {
        this.gettingList = gettingList;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void transactionAdding(Transaction transaction) {
        transactionList.add(transaction);
        if(transaction.getTransactionTypeEnum().equals(TransactionTypeEnum.PAYMENT))
            paymentList.add((Payment) transaction);
        if(transaction.getTransactionTypeEnum().equals(TransactionTypeEnum.GETTING))
            gettingList.add((SimpleTransactionGetting)transaction);
    }
}
