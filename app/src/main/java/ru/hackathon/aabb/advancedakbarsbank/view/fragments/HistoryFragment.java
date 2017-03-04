package ru.hackathon.aabb.advancedakbarsbank.view.fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import ru.hackathon.aabb.advancedakbarsbank.R;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Transaction;
import ru.hackathon.aabb.advancedakbarsbank.presenter.HistoryPresenter;
import ru.hackathon.aabb.advancedakbarsbank.view.activities.SearchActivity;
import ru.hackathon.aabb.advancedakbarsbank.view.adapters.TransactionListAdapter;
import ru.hackathon.aabb.advancedakbarsbank.view.interfaces.StoryFragmentInterface;

/**
 * Created by ILMAZ on 04.03.2017.
 */

public class HistoryFragment extends Fragment implements StoryFragmentInterface {
    private RecyclerView mRecyclerView;
    private TransactionListAdapter adapter;
    private HistoryPresenter mPresenter;
    private ImageView mSearchImageView;
    @Override
    public void setTransactionsList(List<Transaction> list) {
        adapter.setTransactions(list);
    }

    public static HistoryFragment newInstance() {
        
        Bundle args = new Bundle();
        
        HistoryFragment fragment = new HistoryFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_transactions);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new TransactionListAdapter();
        mRecyclerView.setAdapter(adapter);
        mSearchImageView = (ImageView) view.findViewById(R.id.iv_search);
        mSearchImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SearchActivity.class);
                startActivity(intent);
            }
        });
        mPresenter = new HistoryPresenter(this);
        mPresenter.getTransactionList();
        return view;
    }
}
