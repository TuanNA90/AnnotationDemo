/******************************************************************************
 * Copyright (c) 2015. By tuanna (Jackson Nguyen)                             *
 ******************************************************************************/

package com.tuanna.annotationdemo.view.fragment;

import android.support.v4.app.Fragment;
import android.widget.ListView;

import com.tuanna.annotationdemo.R;
import com.tuanna.annotationdemo.adapter.ListViewAdapter;
import com.tuanna.annotationdemo.common.Shop;
import com.tuanna.annotationdemo.view.activity.MainActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

/**
 * AnnotationDemo.
 * Created by tuanna on 27/10/2015.
 */
@EFragment(R.layout.fragment_list_view)
public class ListViewFragment extends Fragment {
    @Bean
    ListViewAdapter mAdapter;
    @ViewById(R.id.lvShop)
    ListView lvShop;

    private List<Shop> mShopList;
    private Shop mShop;

    @AfterViews
    void binAdapter() {
        mShopList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            mShop = new Shop("Shop " + i + "", "This is Shop " + i + "");
            mShopList.add(mShop);
        }
        mAdapter.setShopList(mShopList);
        lvShop.setAdapter(mAdapter);
        lvShop.setDivider(null);
    }

    @ItemClick
    public void lvShopItemClicked(Shop shop) {
        ((MainActivity) getActivity()).addFragment(DetailFragment_
                        .builder()
                        .title(shop.mTitle)
                        .description(shop.mContent)
                        .build()
        );
    }
}
