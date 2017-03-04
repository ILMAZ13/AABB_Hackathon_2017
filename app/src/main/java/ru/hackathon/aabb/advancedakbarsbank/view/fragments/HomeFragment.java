package ru.hackathon.aabb.advancedakbarsbank.view.fragments;

import android.app.Fragment;
import android.os.Bundle;

import ru.hackathon.aabb.advancedakbarsbank.model.entity.foruser.User;
import ru.hackathon.aabb.advancedakbarsbank.view.interfaces.HomeFragmentInterface;

/**
 * Created by ILMAZ on 04.03.2017.
 */

public class HomeFragment extends Fragment implements HomeFragmentInterface {
    private User mUser;
    public static HomeFragment newInstance() {

        Bundle args = new Bundle();

        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setUserInformation(User user) {
        mUser = user;
        // TODO: 04.03.2017 add updating
    }
}
