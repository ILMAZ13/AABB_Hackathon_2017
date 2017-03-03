package ru.hackathon.aabb.advancedakbarsbank.presenter;

import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Transaction;
import ru.hackathon.aabb.advancedakbarsbank.model.service.TransactionsPlug;
import ru.hackathon.aabb.advancedakbarsbank.view.interfaces.StoryFragmentInterface;

import java.util.List;

/**
 * Created by ILMAZ on 04.03.2017.
 */

public class StoryPresenter {
    private StoryFragmentInterface mInterface;

    public void getTransactionList (){
        TransactionsPlug plug = new TransactionsPlug();
        List<Transaction> transactions = plug.getTransactions();
        mInterface.setTransactionsList(transactions);
    }
    public StoryPresenter(StoryFragmentInterface anInterface) {
        mInterface = anInterface;
    }
}
