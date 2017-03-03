package ru.hackathon.aabb.advancedakbarsbank.presenter;

import ru.hackathon.aabb.advancedakbarsbank.model.enums.AuthorizationType;
import ru.hackathon.aabb.advancedakbarsbank.view.interfaces.AuthorizationInterface;

/**
 * Created by ILMAZ on 03.03.2017.
 */

public class Authorization {
    private AuthorizationInterface mInterface;

    public Authorization(AuthorizationInterface anInterface) {
        mInterface = anInterface;
    }

    public void getAuthorizationType() {
        // TODO: 03.03.2017 add request to model
        AuthorizationType authorizationType = AuthorizationType.CODE;
        switch (authorizationType) {
            case ACCOUNT:
                mInterface.setAccountAuthorization();
                break;
            case FINGERPRINT:
                mInterface.setFingerprintAuthorization();
                break;
            case CODE:
                mInterface.setCodeAuthorization();
                break;
        }
    }

    public void authorizeByAccount(String login, String password) {

    }
}
