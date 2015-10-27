package com.bruce.expandablerecycleradaper.widget;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by Bruce too
 * On 2015/10/27
 * At 16:08
 * RecyclerView Only has Footer
 */
public abstract class FooterRecyclerAdapter extends ExpandableRecyclerAdapter {
    @Override
    public boolean hasHeader() {
        return false;
    }

    @Override
    public RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindHeaderView(RecyclerView.ViewHolder holder, int position) {

    }
}
