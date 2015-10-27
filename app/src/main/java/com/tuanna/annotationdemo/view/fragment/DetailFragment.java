/******************************************************************************
 * Copyright (c) 2015. By tuanna (Jackson Nguyen)                             *
 ******************************************************************************/

package com.tuanna.annotationdemo.view.fragment;

import android.support.v4.app.Fragment;
import android.widget.TextView;

import com.tuanna.annotationdemo.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;

/**
 * AnnotationDemo.
 * Created by tuanna on 27/10/2015.
 */
@EFragment(R.layout.fragment_detail)
public class DetailFragment extends Fragment {
    @FragmentArg
    String title;
    @FragmentArg
    String description;
    @ViewById(R.id.tv_title)
    TextView tvTitle;
    @ViewById(R.id.tv_content)
    TextView tvContent;

    @AfterViews
    void init() {
        if (!title.isEmpty() && !description.isEmpty()) {
            tvTitle.setText(title);
            tvContent.setText(description);
        }
    }
}
