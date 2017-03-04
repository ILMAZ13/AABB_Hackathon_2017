package ru.hackathon.aabb.advancedakbarsbank.view.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ru.hackathon.aabb.advancedakbarsbank.R;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Transaction;
import ru.hackathon.aabb.advancedakbarsbank.view.viewHolders.DiagramViewHolder;
import ru.hackathon.aabb.advancedakbarsbank.view.viewHolders.TransactionViewHolder;

/**
 * Created by ILMAZ on 04.03.2017.
 */

public class TransactionListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Transaction> mTransactions;

    public void setTransactions(List<Transaction> transactions) {
        mTransactions = transactions;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        if (viewType == 0) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.diagram_item, parent, false);
            return new DiagramViewHolder(view);
        } else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.transaction_item, parent, false);
            return new TransactionViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof TransactionViewHolder) {
            ((TransactionViewHolder) holder).bind(mTransactions.get(position));
        }
    }

    @Override
    public int getItemCount() {
        if (mTransactions != null) {
            return mTransactions.size();
        }
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return position == 0 ? 0 : 1;
    }
}
