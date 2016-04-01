package com.example.robertpc.flowershoplast.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.robertpc.flowershoplast.viewholder.FlowerViewHolder;

/**
 * Created by Robert PC on 4/1/2016.
 */
public class BaseRecyclerView extends RecyclerView.Adapter<FlowerViewHolder> {

    @Override
    public FlowerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(FlowerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
