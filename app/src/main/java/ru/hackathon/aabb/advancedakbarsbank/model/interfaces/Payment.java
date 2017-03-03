package ru.hackathon.aabb.advancedakbarsbank.model.interfaces;


import ru.hackathon.aabb.advancedakbarsbank.model.Enums.PaymentTypeEnum;

public abstract class Payment extends Transaction {
    private PaymentTypeEnum paymentTypeEnum;
    private int cost;

    public PaymentTypeEnum getPaymentTypeEnum() {
        return paymentTypeEnum;
    }

    public void setPaymentTypeEnum(PaymentTypeEnum paymentTypeEnum) {
        this.paymentTypeEnum = paymentTypeEnum;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
