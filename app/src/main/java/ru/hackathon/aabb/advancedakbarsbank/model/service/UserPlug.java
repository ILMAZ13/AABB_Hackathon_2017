package ru.hackathon.aabb.advancedakbarsbank.model.service;

import ru.hackathon.aabb.advancedakbarsbank.model.entity.foruser.User;

public class UserPlug {
    User createUser(){
        User user = new User();
        user.setFirstName("Anton");
        user.setLastName("Krivikov");

        BankAccountsPlug bankAccountsPlug = new BankAccountsPlug();
        CardsPlug cardsPlug = new CardsPlug();

        user.setCardList(cardsPlug.getCards());
        user.setBankAccountList(bankAccountsPlug.getBankAccounts());


        return user;
    }
}
