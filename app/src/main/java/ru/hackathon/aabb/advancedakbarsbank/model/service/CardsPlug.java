package ru.hackathon.aabb.advancedakbarsbank.model.service;

import ru.hackathon.aabb.advancedakbarsbank.model.entity.foruser.Card;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CardsPlug {
    List<Card> getCards(){
        List<Card> cards = new ArrayList<>();

        Card card = new Card();
        card.setCardNumber(1234123412341234L);
        card.setExpirationDate(new Date());
        card.setCvv(321);
        return cards;
    }

//
//    private long cardNumber;
//    private Date expirationDate;
//    private int cvv;
//    private List<Transaction> transactionList;
//    private List<Payment> paymentList;
//    private List<SimpleTransactionGetting> gettingList;
}
