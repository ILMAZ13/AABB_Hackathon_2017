package ru.hackathon.aabb.advancedakbarsbank.model.service;

import ru.hackathon.aabb.advancedakbarsbank.model.entity.foruser.Card;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CardsPlug {
    List<Card> getCards() {
        List<Card> cards = new ArrayList<>();
        TransactionsPlug transactionsPlug = new TransactionsPlug();

        Card firstCard = new Card();
        Card secondCard = new Card();
        firstCard.setCardNumber(1234123412341234L);
        firstCard.setExpirationDate(new Date());
        firstCard.setCvv(321);
        firstCard.setTransactionList(transactionsPlug.getTransactions());

        secondCard.setCardNumber(2313232123123213L);
        secondCard.setExpirationDate(new Date());
        secondCard.setCvv(133);
        secondCard.setTransactionList(transactionsPlug.getTransactions());


        cards.add(firstCard);
        cards.add(secondCard);

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
