package com.sunshine.chatwithscreens.movies;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.sunshine.chatwithscreens.R;

import java.util.ArrayList;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesViewHolder> {
    public ArrayList<Movies> moviesArray;

    public void setData(ArrayList<Movies> moviesList){
        moviesArray = moviesList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movies_items,parent,false);
        MoviesViewHolder moviesViewHolder = new MoviesViewHolder(view);
        return moviesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesViewHolder holder, int position) {
        Movies movies = moviesArray.get(position);
        Picasso.get().load(movies.imageUrl).into(holder.moviesImg);
        holder.moviesTxt.setText(movies.title);
    }

    @Override
    public int getItemCount() {

        return moviesArray.size();
    }
}
