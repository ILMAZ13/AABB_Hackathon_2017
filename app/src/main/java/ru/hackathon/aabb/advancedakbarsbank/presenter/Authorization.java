package ru.hackathon.aabb.advancedakbarsbank.presenter;

import ru.hackathon.aabb.advancedakbarsbank.view.interfaces.AuthorizationInterface;

/**
 * Created by ILMAZ on 03.03.2017.
 */

public class Authorization {
    private AuthorizationInterface mInterface;

    public Authorization(AuthorizationInterface anInterface) {
        mInterface = anInterface;
    }
}
