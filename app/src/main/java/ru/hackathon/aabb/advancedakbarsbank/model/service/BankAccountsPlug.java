package ru.hackathon.aabb.advancedakbarsbank.model.service;

import ru.hackathon.aabb.advancedakbarsbank.model.entity.foruser.BankAccount;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccountsPlug {
    List<BankAccount> getBankAccounts() {
        List<BankAccount> bankAccounts = new ArrayList<>();
        BankAccount firstBankAccount = new BankAccount();
        BankAccount secondBankAccount = new BankAccount();

        firstBankAccount.setBankAccountNumber(1);
        firstBankAccount.setCreationDate(new Date());

        secondBankAccount.setBankAccountNumber(2);
        secondBankAccount.setCreationDate(new Date());
        bankAccounts.add(firstBankAccount);
        bankAccounts.add(secondBankAccount);

        return bankAccounts;
    }
}
