package com.sunshine.chatwithscreens.series;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sunshine.chatwithscreens.R;

public class SeriesViewHolder extends RecyclerView.ViewHolder {

    ImageView seriesImg;
    TextView seriesTxt;

    public SeriesViewHolder(@NonNull View itemView) {
        super(itemView);
        seriesImg = itemView.findViewById(R.id.series_img);
        seriesTxt = itemView.findViewById(R.id.series_txt);
    }
}
