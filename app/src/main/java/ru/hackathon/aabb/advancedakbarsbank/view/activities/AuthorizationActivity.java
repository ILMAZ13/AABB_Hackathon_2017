package ru.hackathon.aabb.advancedakbarsbank.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ru.hackathon.aabb.advancedakbarsbank.R;
import ru.hackathon.aabb.advancedakbarsbank.presenter.Authorization;
import ru.hackathon.aabb.advancedakbarsbank.view.interfaces.AuthorizationInterface;

public class AuthorizationActivity extends AppCompatActivity implements AuthorizationInterface{

    private Authorization mAuthorizationPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorithation);

        //Presenter generation
        mAuthorizationPresenter = new Authorization(this);
    }

    @Override
    public void setAccountAuthorization() {

    }

    @Override
    public void setCodeAuthorization() {

    }

    @Override
    public void setFingerprintAuthorization() {

    }
}
