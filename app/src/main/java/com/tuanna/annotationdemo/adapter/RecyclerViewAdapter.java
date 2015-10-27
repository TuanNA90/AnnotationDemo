/******************************************************************************
 * Copyright (c) 2015. By tuanna (Jackson Nguyen)                             *
 ******************************************************************************/

package com.tuanna.annotationdemo.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.tuanna.annotationdemo.common.Shop;
import com.tuanna.annotationdemo.view.itemlist.Items;
import com.tuanna.annotationdemo.view.itemlist.Items_;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.List;

/**
 * AnnotationDemo.
 * Created by tuanna on 27/10/2015.
 */
@EBean
public class RecyclerViewAdapter extends RecyclerViewBaseAdapter<Shop, Items> {
    @RootContext
    Context mContext;

    public void setShopList(List<Shop> shopList) {
        mList = shopList;
    }

    @Override
    protected Items onCreateItemView(ViewGroup parent, int viewType) {
        return Items_.build(mContext);
    }

    @Override
    public void onBindViewHolder(ViewHolder<Items> holder, int position) {
        Items itemList = holder.getView();
        Shop shop = mList.get(position);
        itemList.bin(shop);
    }
}
