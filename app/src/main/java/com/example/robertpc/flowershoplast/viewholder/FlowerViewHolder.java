package com.example.robertpc.flowershoplast.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.robertpc.flowershoplast.R;

/**
 * Created by Robert PC on 4/1/2016.
 */
public class FlowerViewHolder extends BaseViewHolder {

    public FlowerViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.txt_title);
        price = (TextView) itemView.findViewById(R.id.txt_price);
        img = (ImageView) itemView.findViewById(R.id.img_flower);
    }
}
