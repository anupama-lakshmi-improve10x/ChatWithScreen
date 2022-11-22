package com.sunshine.chatwithscreens.grocery;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sunshine.chatwithscreens.R;

public class GroceryViewHolder extends RecyclerView.ViewHolder {

    ImageView groceryImg;
    TextView titleTxt;

    public GroceryViewHolder(@NonNull View itemView) {
        super(itemView);
        groceryImg = itemView.findViewById(R.id.grocery_img);
        titleTxt = itemView.findViewById(R.id.title_txt);
    }
}
