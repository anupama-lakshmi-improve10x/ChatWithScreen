package com.sunshine.chatwithscreens.movies;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sunshine.chatwithscreens.R;

public class MoviesViewHolder extends RecyclerView.ViewHolder {
    ImageView moviesImg;
    TextView moviesTxt;

    public MoviesViewHolder(@NonNull View itemView) {
        super(itemView);
        moviesImg = itemView.findViewById(R.id.movies_img);
        moviesTxt = itemView.findViewById(R.id.movies_txt);
    }
}
