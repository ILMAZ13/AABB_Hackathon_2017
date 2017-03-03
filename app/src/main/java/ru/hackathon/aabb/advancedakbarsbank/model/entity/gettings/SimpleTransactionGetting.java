package ru.hackathon.aabb.advancedakbarsbank.model.entity.gettings;

import ru.hackathon.aabb.advancedakbarsbank.model.Enums.TransactionTypeEnum;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Transaction;

public class SimpleTransactionGetting extends Transaction {

    public SimpleTransactionGetting() {
        setTransactionTypeEnum(TransactionTypeEnum.GETTING);
    }
}
