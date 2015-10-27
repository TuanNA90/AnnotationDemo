/******************************************************************************
 * Copyright (c) 2015. By tuanna (Jackson Nguyen)                             *
 ******************************************************************************/

package com.tuanna.annotationdemo.view.fragment;

import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tuanna.annotationdemo.R;
import com.tuanna.annotationdemo.adapter.RecyclerViewAdapter;
import com.tuanna.annotationdemo.common.Shop;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

/**
 * AnnotationDemo.
 * Created by tuanna on 27/10/2015.
 */
@EFragment(R.layout.recycler_view_fragment)
public class RecyclerViewFragment extends Fragment {
    @Bean
    RecyclerViewAdapter mAdapter;
    @ViewById(R.id.rvShop)
    RecyclerView rvShop;

    private List<Shop> mShopList;
    private Shop mShop;

    @AfterViews
    void init() {
        mShopList = new ArrayList<>();
        mAdapter.setShopList(mShopList);
        rvShop.setAdapter(mAdapter);
        rvShop.setItemAnimator(new DefaultItemAnimator());
        rvShop.setLayoutManager(new LinearLayoutManager(getContext()));
        bindViewAdapter();
    }

    void bindViewAdapter() {
        for (int i = 1; i < 10; i++) {
            mShop = new Shop("Shop " + i + "", "This is Shop " + i + "");
            mShopList.add(mShop);
        }
        mAdapter.notifyDataSetChanged();
    }
}
