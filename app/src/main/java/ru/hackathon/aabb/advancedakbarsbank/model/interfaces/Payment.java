package ru.hackathon.aabb.advancedakbarsbank.model.interfaces;


import ru.hackathon.aabb.advancedakbarsbank.model.enums.PaymentTypeEnum;
import ru.hackathon.aabb.advancedakbarsbank.model.enums.TransactionTypeEnum;

public abstract class Payment extends Transaction {
    private PaymentTypeEnum paymentTypeEnum;

    public Payment() {
        setTransactionTypeEnum(TransactionTypeEnum.PAYMENT);
    }

    public PaymentTypeEnum getPaymentTypeEnum() {
        return paymentTypeEnum;
    }

    public void setPaymentTypeEnum(PaymentTypeEnum paymentTypeEnum) {
        this.paymentTypeEnum = paymentTypeEnum;
    }

}
