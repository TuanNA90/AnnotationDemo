package com.tuanna.annotationdemo.view.activity;

import android.support.v7.app.AppCompatActivity;

import com.tuanna.annotationdemo.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @AfterViews
    void init() {

    }
}
