package ru.hackathon.aabb.advancedakbarsbank.model.service;

import java.util.List;

import ru.hackathon.aabb.advancedakbarsbank.model.entity.foruser.Card;
import ru.hackathon.aabb.advancedakbarsbank.model.entity.gettings.SimpleTransactionGetting;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Payment;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Transaction;

public class Service {
    private List<Transaction> transactions;
    private List<Payment> payments;
    private List<SimpleTransactionGetting> gettingList;

    public void setTransactions(Card card) {
        this.transactions = card.getTransactionList();
    }

    public void setPayments(Card card) {
        this.payments = card.getPaymentList();
    }

    public void setGettingList(Card card){
        this.gettingList = card.getGettingList();
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public List<SimpleTransactionGetting> getGettingList() {
        return gettingList;
    }
}