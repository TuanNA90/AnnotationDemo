/******************************************************************************
 * Copyright (c) 2015. By tuanna (Jackson Nguyen)                             *
 ******************************************************************************/

package com.tuanna.annotationdemo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.tuanna.annotationdemo.common.Shop;
import com.tuanna.annotationdemo.view.itemlist.Items;
import com.tuanna.annotationdemo.view.itemlist.Items_;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.ArrayList;
import java.util.List;

/**
 * AnnotationDemo.
 * Created by tuanna on 27/10/2015.
 */
@EBean
public class ListViewAdapter extends BaseAdapter {
    @RootContext
    Context mContext;
    private List<Shop> mShopList = new ArrayList<>();

    public void setShopList(List<Shop> shopList) {
        this.mShopList = shopList;
    }

    @Override
    public int getCount() {
        return mShopList.size();
    }

    @Override
    public Shop getItem(int position) {
        return mShopList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Items items;
        if (view == null) {
            items = Items_.build(mContext);
        } else {
            items = (Items) view;
        }
        items.bin(getItem(position));
        return items;
    }
}
