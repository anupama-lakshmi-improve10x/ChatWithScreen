package com.sunshine.chatwithscreens.series;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.sunshine.chatwithscreens.R;

import java.util.ArrayList;

public class SeriesAdapter extends RecyclerView.Adapter<SeriesViewHolder> {
    public ArrayList<Series> seriesArray;

    public void setData(ArrayList<Series> seriesList) {
        seriesArray = seriesList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public SeriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.series_items,parent,false);
        SeriesViewHolder seriesViewHolder = new SeriesViewHolder(view);
        return seriesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SeriesViewHolder holder, int position) {
        Series series = seriesArray.get(position);
        Picasso.get().load(series.imageUrl).into(holder.seriesImg);
        holder.seriesTxt.setText(series.title);
    }

    @Override
    public int getItemCount() {
        return seriesArray.size();
    }
}
