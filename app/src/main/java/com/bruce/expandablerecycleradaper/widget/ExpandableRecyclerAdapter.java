package com.bruce.expandablerecycleradaper.widget;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by Bruce too
 * On 2015/10/27
 * At 15:05
 * RecyclerView has Header and footer
 */
public abstract class ExpandableRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    protected static final int VIEW_TYPE_HEADER = -1;
    protected static final int VIEW_TYPE_FOOTER = -2;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_HEADER) {
            return onCreateHeaderViewHolder(parent, viewType);
        } else if (viewType == VIEW_TYPE_FOOTER) {
            return onCreateFooterViewHolder(parent, viewType);
        }
        return onCreateNormalItemViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        //Header view's position must equal 0,and type == VIEW_TYPE_HEADER
        if (position == 0 && holder.getItemViewType() == VIEW_TYPE_HEADER) {
            onBindHeaderView(holder, position);
        }
        //footer view's position equals getNormalItemCount() but if u use hasHeader you must +1
        //(hasHeader() ? 1 : 0) this judgement is important or you'll get wrong position when header is available
        else if (position == getNormalItemCount() + (hasHeader() ? 1 : 0) && holder.getItemViewType() == VIEW_TYPE_FOOTER) {
            onBindFooterView(holder, position);
        } else {
            //the same here
            onBindNormalItemView(holder, position - (hasHeader() ? 1 : 0));
        }
    }

    @Override
    public int getItemCount() {
        int itemCount = getNormalItemCount();
        //if use header,item count plus 1
        if (hasHeader()) {
            itemCount += 1;
        }
        ////if use footer,item count plus 1
        if (hasFooter()) {
            itemCount += 1;
        }
        //return real item count
        return itemCount;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0 && hasHeader()) {
            return VIEW_TYPE_HEADER;
        }
        if (position == getNormalItemCount() + (hasHeader() ? 1 : 0) && hasFooter()) {
            return VIEW_TYPE_FOOTER;
        }
        return getNormalItemType(position);
    }

    /**
     * Handle if has header view
     *
     * @return
     */
    public abstract boolean hasHeader();

    /**
     * Create Header ViewHolder
     *
     * @param parent
     * @param viewType
     * @return
     */
    public abstract RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup parent, int viewType);

    /**
     * Bind Header View
     *
     * @param holder
     * @param position
     */
    public abstract void onBindHeaderView(RecyclerView.ViewHolder holder, int position);

    /**
     * Handle if has footer view
     *
     * @return
     */
    public abstract boolean hasFooter();

    /**
     * Create Footer ViewHolder
     *
     * @param parent
     * @param viewType
     * @return
     */
    public abstract RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup parent, int viewType);

    /**
     * Bind Footer View
     *
     * @param holder
     * @param position
     */
    public abstract void onBindFooterView(RecyclerView.ViewHolder holder, int position);

    /**
     * Create Normal item ViewHolder
     *
     * @param parent
     * @param viewType
     * @return
     */
    public abstract RecyclerView.ViewHolder onCreateNormalItemViewHolder(ViewGroup parent, int viewType);

    /**
     * Bind normal view
     *
     * @param holder
     * @param position
     */
    public abstract void onBindNormalItemView(RecyclerView.ViewHolder holder, int position);

    /**
     * except Header and Footer
     *
     * @return
     */
    public abstract int getNormalItemCount();

    /**
     * Normal item type,also can have multiple types
     * @param position
     * @return
     */
    public abstract int getNormalItemType(int position);
}
