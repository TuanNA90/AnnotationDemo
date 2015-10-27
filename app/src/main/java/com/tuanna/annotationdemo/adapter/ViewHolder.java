/******************************************************************************
 * Copyright (c) 2015. By tuanna (Jackson Nguyen)                             *
 ******************************************************************************/

package com.tuanna.annotationdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * AnnotationDemo.
 * Created by tuanna on 27/10/2015.
 */
public class ViewHolder<V extends View> extends RecyclerView.ViewHolder {
    private V mView;

    public ViewHolder(V itemView) {
        super(itemView);
        this.mView = itemView;
    }

    public V getView() {
        return mView;
    }
}
