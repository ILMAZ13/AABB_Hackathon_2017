package ru.hackathon.aabb.advancedakbarsbank.presenter;

import ru.hackathon.aabb.advancedakbarsbank.model.service.Service;
import ru.hackathon.aabb.advancedakbarsbank.view.interfaces.HomeFragmentInterface;

/**
 * Created by ILMAZ on 04.03.2017.
 */

public class HomePresenter {
    private HomeFragmentInterface mInterface;

    public HomePresenter(HomeFragmentInterface anInterface) {
        mInterface = anInterface;
    }

    public void getUserInformation(){
        Service service = new Service();
        mInterface.setUserInformation(service.getUser());
    }
}
