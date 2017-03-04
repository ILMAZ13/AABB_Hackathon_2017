package ru.hackathon.aabb.advancedakbarsbank.view.activities;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import ru.hackathon.aabb.advancedakbarsbank.R;
import ru.hackathon.aabb.advancedakbarsbank.view.fragments.HistoryFragment;
import ru.hackathon.aabb.advancedakbarsbank.view.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    selectHomePage();
                    return true;
                case R.id.navigation_dashboard:

                    return true;
                case R.id.navigation_history:
                    Fragment fragment = HistoryFragment.newInstance();
                    getFragmentManager().beginTransaction()
                            .replace(R.id.content, fragment)
                            .commit();
                    return true;
                case R.id.navigation_map:

                    return true;
                case R.id.navigation_exchange_rates:

                    return true;

            }
            return false;
        }

    };

    private void selectHomePage() {
        Fragment fragment = HomeFragment.newInstance();
        getFragmentManager().beginTransaction()
                .replace(R.id.content, fragment)
                .commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelected(true);
        selectHomePage();
    }

}
