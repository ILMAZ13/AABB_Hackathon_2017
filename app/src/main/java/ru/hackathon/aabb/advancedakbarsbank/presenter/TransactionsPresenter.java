package ru.hackathon.aabb.advancedakbarsbank.presenter;

import java.util.List;

import ru.hackathon.aabb.advancedakbarsbank.model.entity.foruser.Card;
import ru.hackathon.aabb.advancedakbarsbank.model.enums.PaymentTypeEnum;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Payment;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Transaction;
import ru.hackathon.aabb.advancedakbarsbank.model.service.Service;

public class TransactionsPresenter {
    private Service service = new Service();
    private Card card;
    private List<Transaction> transactionList;
    private List<Payment> paymentsList;
    private long paymentSumm;

    public TransactionsPresenter(Card card){
        this.card = card;
        trunsactionAndPaymentListUpdate();
    }

    public long getPaymentSumm(PaymentTypeEnum paymentType){
        int summ=0;
        trunsactionAndPaymentListUpdate();
        for ( Payment payment: paymentsList) {
            if(payment.getPaymentTypeEnum().equals(paymentType)){
                summ+=payment.getCost();
            }
        }
        return summ;
    }

    private void trunsactionAndPaymentListUpdate(){
        service.setTransactions(card);
        service.setPayments(card);
        transactionList = service.getTransactions();
        paymentsList = service.getPayments();

    }

    private void updatePaymentSum(int month, int year){ //0-11 month
        paymentSumm = 0;
        for (Payment payment:paymentsList) {
            if( payment.getTransactionDateAndTime().getMonth() == month &&
                    payment.getTransactionDateAndTime().getYear()==year){
                paymentSumm+=payment.getCost();
            }
        }
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public void setPaymentsList(List<Payment> paymentsList) {
        this.paymentsList = paymentsList;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
