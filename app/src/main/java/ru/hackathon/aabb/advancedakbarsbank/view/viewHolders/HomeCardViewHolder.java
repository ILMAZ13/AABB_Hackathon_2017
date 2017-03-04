package ru.hackathon.aabb.advancedakbarsbank.view.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import ru.hackathon.aabb.advancedakbarsbank.R;
import ru.hackathon.aabb.advancedakbarsbank.model.entity.foruser.Card;
import ru.hackathon.aabb.advancedakbarsbank.model.enums.TransactionTypeEnum;
import ru.hackathon.aabb.advancedakbarsbank.model.interfaces.Transaction;

/**
 * Created by ILMAZ on 04.03.2017.
 */

public class HomeCardViewHolder extends RecyclerView.ViewHolder {
    private TextView mCardName;
    private TextView mCardNumber;
    private TextView mCardResource;
    private ImageView mExpandImageView;
    private LinearLayout mLinearLayout;
    private Button mButtonFill;
    private Button mButtonPayments;
    private Button mButtonBlock;
    private boolean expanded;

    public HomeCardViewHolder(View itemView) {
        super(itemView);
        mCardName = (TextView) itemView.findViewById(R.id.tv_card_name);
        mCardNumber = (TextView) itemView.findViewById(R.id.tv_card_num);
        mCardResource = (TextView) itemView.findViewById(R.id.tv_card_resource);
        mExpandImageView = (ImageView) itemView.findViewById(R.id.iv_expand);
        mButtonFill = (Button) itemView.findViewById(R.id.btn_fill_card);
        mButtonBlock = (Button) itemView.findViewById(R.id.btn_block);
        mButtonPayments = (Button) itemView.findViewById(R.id.btn_payments);
        mLinearLayout = (LinearLayout) itemView.findViewById(R.id.ll_card_expand);
        expanded = false;
    }

    public void bind(Card card){
        mCardName.setText(card.getCardName());
        String temp = "***" + card.getCardNumber() % 10000;
        mCardNumber.setText(temp);
        mCardResource.setText(card.getResources() + "RUB");
        mExpandImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(expanded){
                    mLinearLayout.setVisibility(View.GONE);
                    expanded = false;
                } else {
                    mLinearLayout.setVisibility(View.VISIBLE);
                    expanded = true;
                }
            }
        });
        GraphView graph = (GraphView) itemView.findViewById(R.id.card_graph);
        DataPoint[] dataPoints = new DataPoint[card.getTransactionList().size()+1];
        int i = card.getTransactionList().size();
        long cardResources = card.getResources();
        dataPoints[i] = new DataPoint(i, cardResources);
        i--;
        for (Transaction t :
               card.getTransactionList() ) {
            if(t.getTransactionTypeEnum().equals(TransactionTypeEnum.GETTING)) {
                cardResources -= t.getCost();
            }
            else {
                cardResources += t.getCost();
            }
            dataPoints[i] = new DataPoint(i, cardResources);
            i--;
        }

        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(dataPoints);
        graph.addSeries(series);
        graph.getViewport().setScrollable(true); // enables horizontal scrolling
        graph.getViewport().setScrollableY(true); // enables vertical scrolling
        graph.getViewport().setScalable(true); // enables horizontal zooming and scrolling
        graph.getViewport().setScalableY(true);
    }
}
