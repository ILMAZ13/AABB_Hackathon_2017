package ru.hackathon.aabb.advancedakbarsbank.view.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ru.hackathon.aabb.advancedakbarsbank.R;
import ru.hackathon.aabb.advancedakbarsbank.model.entity.foruser.Card;
import ru.hackathon.aabb.advancedakbarsbank.view.viewHolders.HomeCardViewHolder;

/**
 * Created by ILMAZ on 04.03.2017.
 */

public class CardListAdapter extends RecyclerView.Adapter<HomeCardViewHolder> {
    private List<Card> mCardList;

    public void setCardList(List<Card> cardList){
        mCardList = cardList;
        notifyDataSetChanged();
    }

    @Override
    public HomeCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        return new HomeCardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HomeCardViewHolder holder, int position) {
        holder.bind(mCardList.get(position));
    }

    @Override
    public int getItemCount() {
        if(mCardList != null){
            return mCardList.size();
        }
        return 0;
    }
}
