package ru.hackathon.aabb.advancedakbarsbank.model.entity.foruser;

import java.util.Date;

public class BankAccount {
    private long bankAccountNumber;
    private Date creationDate;

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
