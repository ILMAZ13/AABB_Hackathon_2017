package ru.hackathon.aabb.advancedakbarsbank.presenter;

import java.util.List;

import ru.hackathon.aabb.advancedakbarsbank.model.enums.PaymentTypeEnum;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Payment;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Transaction;
import ru.hackathon.aabb.advancedakbarsbank.model.service.Service;

public class TransactionsPresenter {
    private Service service = new Service();
    private List<Transaction> transactionList;
    private List<Payment> paymentsList;
    private long paymentSumm;

    public TransactionsPresenter(){
        paymentListUpdate();
    }

    public long getPaymentSumm(PaymentTypeEnum paymentType){
        int summ=0;
        paymentListUpdate();
        for ( Payment payment: paymentsList) {
            if(payment.getPaymentTypeEnum().equals(paymentType)){
                summ+=payment.getMoney();
            }
        }
        return summ;
    }

    private void paymentListUpdate(){
        transactionList = service.getTransactions();
        paymentsList = service.getPayments();

    }

    private void updatePaymentSum(int month, int year){
        paymentSumm = 0;
        for (Payment payment:paymentsList) {
            if( payment.getTransactionDateAndTime().getTimestamp().getMonth() == month &&
                    payment.getTransactionDateAndTime().getTimestamp().getYear()==year){
                paymentSumm+=payment.getMoney();
            }
        }
    }

}
