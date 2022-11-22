package com.sunshine.chatwithscreens.grocery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.sunshine.chatwithscreens.R;

import java.util.ArrayList;

public class GroceryAdapter extends RecyclerView.Adapter<GroceryViewHolder> {

    public ArrayList<Grocery> groceriesArrayList;

    public void setData(ArrayList<Grocery> groceryList) {
        groceriesArrayList = groceryList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public GroceryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grocery_items, parent, false);
        GroceryViewHolder groceryViewHolder = new GroceryViewHolder(view);
        return groceryViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GroceryViewHolder holder, int position) {
        Grocery grocery = groceriesArrayList.get(position);
        Picasso.get().load(grocery.imageUrl).into(holder.groceryImg);
        holder.titleTxt.setText(grocery.title);
    }

    @Override
    public int getItemCount() {
        return groceriesArrayList.size();
    }
}
