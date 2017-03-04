package ru.hackathon.aabb.advancedakbarsbank.model.service;

import ru.hackathon.aabb.advancedakbarsbank.model.entity.gettings.SimpleTransactionGetting;
import ru.hackathon.aabb.advancedakbarsbank.model.entity.payments.FoodPayments;
import ru.hackathon.aabb.advancedakbarsbank.model.entity.payments.OtherPayments;
import ru.hackathon.aabb.advancedakbarsbank.model.entity.payments.UtilitiesPayments;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Payment;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Transaction;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TransactionsPlug {
    private final Timestamp FIRST_TIMESTAMP = Timestamp.valueOf("2017-03-03 10:10:10.0");
    private final Timestamp SECOND_TIMESTAMP = Timestamp.valueOf("2017-04-04 10:10:10.0");
    private final Timestamp THIRD_TIMESTAMP = Timestamp.valueOf("2017-04-05 10:10:10.0");
    private final Timestamp FOURTH_TIMESTAMP = Timestamp.valueOf("2017-04-06 10:10:10.0");
    private final Timestamp FITH_TIMESTAMP = Timestamp.valueOf("2017-04-07 10:10:10.0");
    private List<Transaction> transactions = new ArrayList<>();
    private List<Payment> payments = new ArrayList<>();
//    private List<SimpleTransactionGetting> gettings = new ArrayList<>();

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public List<Payment> getPayments() {
        return payments;


    }

    public void addPayments(){
        Transaction thirdTransaction = new FoodPayments();
        thirdTransaction.setCost(256);
        thirdTransaction.setTransactionName("ASHAN");
        thirdTransaction.setTransactionDateAndTime(THIRD_TIMESTAMP);
        transactions.add(thirdTransaction);
        payments.add((Payment) thirdTransaction);

        Transaction fourthTransaction = new UtilitiesPayments();
        fourthTransaction.setCost(1000);
        fourthTransaction.setTransactionName("WATER");
        fourthTransaction.setTransactionDateAndTime(FOURTH_TIMESTAMP);
        transactions.add(fourthTransaction);
        payments.add((Payment) fourthTransaction);

        Transaction fithTransaction = new OtherPayments();
        fithTransaction.setCost(25000);
        fithTransaction.setTransactionName("HENDERSON");
        fithTransaction.setTransactionDateAndTime(FITH_TIMESTAMP);
        transactions.add(fithTransaction);
        payments.add((Payment) fithTransaction);
    }

    public void addGettings(){
        Transaction firstTransactionGetting = new SimpleTransactionGetting();
        firstTransactionGetting.setCost(50000);
        firstTransactionGetting.setTransactionName("salary");
        firstTransactionGetting.setTransactionDateAndTime(FIRST_TIMESTAMP);
        transactions.add(firstTransactionGetting);

        Transaction secondTransactionGetting = new SimpleTransactionGetting();
        secondTransactionGetting.setTransactionName("friend's payment");
        secondTransactionGetting.setCost(1000);
        secondTransactionGetting.setTransactionDateAndTime(SECOND_TIMESTAMP);
        transactions.add(secondTransactionGetting);
    }
}
