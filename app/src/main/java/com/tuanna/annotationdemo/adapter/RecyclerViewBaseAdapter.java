/******************************************************************************
 * Copyright (c) 2015. By tuanna (Jackson Nguyen)                             *
 ******************************************************************************/

package com.tuanna.annotationdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * AnnotationDemo.
 * Created by tuanna on 27/10/2015.
 */
public abstract class RecyclerViewBaseAdapter<T, V extends View> extends RecyclerView.Adapter<ViewHolder<V>> {
    protected List<T> mList = new ArrayList<>();

    @Override
    public ViewHolder<V> onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder<>(onCreateItemView(parent, viewType));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    protected abstract V onCreateItemView(ViewGroup parent, int viewType);
}
