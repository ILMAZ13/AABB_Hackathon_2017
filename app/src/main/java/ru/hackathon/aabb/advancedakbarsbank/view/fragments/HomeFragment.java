package ru.hackathon.aabb.advancedakbarsbank.view.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import ru.hackathon.aabb.advancedakbarsbank.R;
import ru.hackathon.aabb.advancedakbarsbank.model.entity.foruser.User;
import ru.hackathon.aabb.advancedakbarsbank.view.interfaces.HomeFragmentInterface;

/**
 * Created by ILMAZ on 04.03.2017.
 */

public class HomeFragment extends Fragment implements HomeFragmentInterface {
    private User mUser;
    private Toolbar mToolbar;
    private RecyclerView mRecyclerView;
    public static HomeFragment newInstance() {

        Bundle args = new Bundle();

        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mToolbar = (Toolbar) view.findViewById(R.id.toolbar);
        getActivity().setActionBar(mToolbar);
        getActivity().setTitle("АК БАРС БАНК");
        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_cart_list);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void setUserInformation(User user) {
        mUser = user;
        // TODO: 04.03.2017 add updating
    }
}
