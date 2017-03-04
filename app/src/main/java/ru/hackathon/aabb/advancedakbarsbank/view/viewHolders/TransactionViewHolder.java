package ru.hackathon.aabb.advancedakbarsbank.view.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ru.hackathon.aabb.advancedakbarsbank.R;
import ru.hackathon.aabb.advancedakbarsbank.model.enums.TransactionTypeEnum;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Transaction;

/**
 * Created by ILMAZ on 04.03.2017.
 */

public class TransactionViewHolder extends RecyclerView.ViewHolder {
    private TextView mName;
    private TextView mCost;
    public TransactionViewHolder(View itemView) {
        super(itemView);
        mName = (TextView) itemView.findViewById(R.id.tv_text);
        mCost = (TextView) itemView.findViewById(R.id.tv_cost);
    }

    public void bind(Transaction transaction){
        mName.setText(transaction.getTransactionName());
        String s;
        if(transaction.getTransactionTypeEnum().equals(TransactionTypeEnum.GETTING)){
            s = "+";
        } else {
            s = "-";
        }
        mCost.setText(s + transaction.getCost() + " RUB");
    }
}
