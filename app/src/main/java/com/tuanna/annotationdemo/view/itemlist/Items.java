/******************************************************************************
 * Copyright (c) 2015. By tuanna (Jackson Nguyen)                             *
 ******************************************************************************/

package com.tuanna.annotationdemo.view.itemlist;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tuanna.annotationdemo.R;
import com.tuanna.annotationdemo.common.Shop;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * AnnotationDemo.
 * Created by tuanna on 27/10/2015.
 */
@EViewGroup(R.layout.custom_list_items)
public class Items extends RelativeLayout {
    @ViewById(R.id.tv_title)
    TextView tvTitle;
    @ViewById(R.id.tv_content)
    TextView tvContent;

    public Items(Context context) {
        super(context);
    }

    public void bin(Shop shop) {
        tvTitle.setText(shop.mTitle);
        tvContent.setText(shop.mContent);
    }
}
