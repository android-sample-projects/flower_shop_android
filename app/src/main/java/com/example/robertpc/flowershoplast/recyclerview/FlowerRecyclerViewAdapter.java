package com.example.robertpc.flowershoplast.recyclerview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.robertpc.flowershoplast.DetailActivity;
import com.example.robertpc.flowershoplast.R;
import com.example.robertpc.flowershoplast.model.Flower;
import com.example.robertpc.flowershoplast.viewholder.FlowerViewHolder;

import java.util.List;

/**
 * Created by Robert PC on 4/1/2016.
 */
public class FlowerRecyclerViewAdapter extends BaseRecyclerView {
    private List<Flower> flowerList;

    public FlowerRecyclerViewAdapter(List<Flower> flowerList) { this.flowerList = flowerList; }

    @Override
    public FlowerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_single_row, parent, false);
        return new FlowerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(FlowerViewHolder holder, int position) {
        final Flower flower = flowerList.get(position);
        holder.title.setText(flower.getTitle());
        holder.price.setText(flower.getPrice());
        holder.img.setImageResource(flower.getImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentItem = new Intent(v.getContext(), DetailActivity.class);
                intentItem.putExtra("flower", flower);
                v.getContext().startActivity(intentItem);
            }
        });

    }

    @Override
    public int getItemCount() {
        return flowerList.size();
    }
}
