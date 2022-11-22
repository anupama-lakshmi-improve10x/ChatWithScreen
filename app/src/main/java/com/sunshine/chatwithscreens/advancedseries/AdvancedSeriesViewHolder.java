package com.sunshine.chatwithscreens.advancedseries;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sunshine.chatwithscreens.R;

public class AdvancedSeriesViewHolder extends RecyclerView.ViewHolder {
    ImageView movieImg;
    TextView titleTxt;

    public AdvancedSeriesViewHolder(@NonNull View itemView) {
        super(itemView);
        movieImg = itemView.findViewById(R.id.movie_img);
        titleTxt = itemView.findViewById(R.id.title_txt);
    }
}
