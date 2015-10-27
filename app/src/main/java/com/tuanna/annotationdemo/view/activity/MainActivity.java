package com.tuanna.annotationdemo.view.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tuanna.annotationdemo.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @AfterViews
    void init() {
        /*TODO something about view*/
    }

    @Click({R.id.tvListView, R.id.tvRecyclerView})
    void onClick(View v){
        int id = v.getId();
        switch (id){
            case R.id.tvListView:
                /*TODO set event when button "show list_view" clicked*/
                break;
            case R.id.tvRecyclerView:
                /*TODO set event when button "show recycler_view" clicked*/
                break;
            default:
                break;
        }
    }

    /**
     * Method add new Fragment
     * @param fragment parameter of fragment insert into
     */
    public void addFragment(Fragment fragment) {
        if (fragment != null) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(
                    android.R.anim.slide_in_left, android.R.anim.slide_out_right,
                    android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            fragmentTransaction.add(R.id.flContainer, fragment, fragment.getClass().getSimpleName());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
