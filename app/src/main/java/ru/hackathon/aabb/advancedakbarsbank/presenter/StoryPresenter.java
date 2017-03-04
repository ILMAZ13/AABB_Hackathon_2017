package ru.hackathon.aabb.advancedakbarsbank.presenter;

import ru.hackathon.aabb.advancedakbarsbank.view.interfaces.StoryFragmentInterface;

/**
 * Created by ILMAZ on 04.03.2017.
 */

public class StoryPresenter {
    private StoryFragmentInterface mInterface;

    public StoryPresenter(StoryFragmentInterface anInterface) {
        mInterface = anInterface;
    }
}
