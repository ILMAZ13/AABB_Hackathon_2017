package ru.hackathon.aabb.advancedakbarsbank.view.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import ru.hackathon.aabb.advancedakbarsbank.R;
import ru.hackathon.aabb.advancedakbarsbank.presenter.Authorization;
import ru.hackathon.aabb.advancedakbarsbank.view.interfaces.AuthorizationInterface;

import static ru.hackathon.aabb.advancedakbarsbank.R.id.ll_account;

public class AuthorizationActivity extends AppCompatActivity implements AuthorizationInterface{

    private Authorization mAuthorizationPresenter;
    private EditText mETLogin;
    private EditText mETPassword;
    private Button mButtonSend;
    private LinearLayout mAccountLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);

        //Presenter generation
        mAuthorizationPresenter = new Authorization(this);
        if(savedInstanceState == null){
            mAuthorizationPresenter.getAuthorizationType();
        }
        mAccountLinearLayout = (LinearLayout) findViewById(ll_account);
        mETLogin = (EditText) findViewById(R.id.et_login);
        mETPassword = (EditText) findViewById(R.id.et_password);
        mButtonSend = (Button) findViewById(R.id.btn_send);
        mButtonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuthorizationPresenter.authorizeByAccount(mETLogin.getText().toString(), mETPassword.getText().toString());
            }
        });
    }

    @Override
    public void setAccountAuthorization() {
        mAccountLinearLayout.setVisibility(View.VISIBLE);
    }

    @Override
    public void setCodeAuthorization() {

    }

    @Override
    public void setFingerprintAuthorization() {

    }
}