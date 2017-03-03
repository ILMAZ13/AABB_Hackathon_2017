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
    private final Timestamp SIXTH_TIMESTAMP = Timestamp.valueOf("2017-04-08 10:10:10.0");
    private final Timestamp SEVENTH_TIMESTAMP = Timestamp.valueOf("2017-04-09 10:10:10.0");
    private final Timestamp EIGHTH_TIMESTAMP = Timestamp.valueOf("2017-04-10 10:10:10.0");
    private final Timestamp NINETH_TIMESTAMP = Timestamp.valueOf("2017-04-11 10:10:10.0");
    private final Timestamp TENTH_TIMESTAMP = Timestamp.valueOf("2017-04-12 10:10:10.0");
    private final Timestamp ELEVENTH_TIMESTAMP = Timestamp.valueOf("2017-04-13 10:10:10.0");
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

        Transaction sixthTransaction = new FoodPayments();
        sixthTransaction.setCost(2000);
        sixthTransaction.setTransactionName("ATAK");
        sixthTransaction.setTransactionDateAndTime(SIXTH_TIMESTAMP);
        transactions.add(sixthTransaction);
        payments.add((Payment) sixthTransaction);

        Transaction seventhTransaction = new OtherPayments();
        seventhTransaction.setCost(1200);
        seventhTransaction.setTransactionName("OSTIN");
        seventhTransaction.setTransactionDateAndTime(SEVENTH_TIMESTAMP);
        transactions.add(seventhTransaction);
        payments.add((Payment) seventhTransaction);

        Transaction eigthTransaction = new UtilitiesPayments();
        eigthTransaction.setCost(200);
        eigthTransaction.setTransactionName("SOCKS");
        eigthTransaction.setTransactionDateAndTime(EIGHTH_TIMESTAMP);
        transactions.add(eigthTransaction);
        payments.add((Payment) eigthTransaction);
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

        Transaction ninethTransactionGetting = new SimpleTransactionGetting();
        ninethTransactionGetting.setTransactionName("pension");
        ninethTransactionGetting.setCost(4000);
        ninethTransactionGetting.setTransactionDateAndTime(NINETH_TIMESTAMP);
        transactions.add(ninethTransactionGetting);

        Transaction tenthTransactionGetting = new SimpleTransactionGetting();
        tenthTransactionGetting.setTransactionName("second salary");
        tenthTransactionGetting.setCost(20000);
        tenthTransactionGetting.setTransactionDateAndTime(TENTH_TIMESTAMP);
        transactions.add(tenthTransactionGetting);

        Transaction eleventhTransactionGetting = new SimpleTransactionGetting();
        eleventhTransactionGetting.setTransactionName("second pension");
        eleventhTransactionGetting.setCost(3900);
        eleventhTransactionGetting.setTransactionDateAndTime(ELEVENTH_TIMESTAMP);
        transactions.add(eleventhTransactionGetting);
    }
}
