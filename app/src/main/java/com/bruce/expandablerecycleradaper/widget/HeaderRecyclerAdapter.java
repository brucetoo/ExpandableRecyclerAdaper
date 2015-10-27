package com.bruce.expandablerecycleradaper.widget;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by Bruce too
 * On 2015/10/27
 * At 16:05
 * RecyclerView Only has Header
 */
public abstract class HeaderRecyclerAdapter extends ExpandableRecyclerAdapter {

    @Override
    public boolean hasFooter() {
        return false;
    }

    @Override
    public RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindFooterView(RecyclerView.ViewHolder holder, int position) {

    }
}
