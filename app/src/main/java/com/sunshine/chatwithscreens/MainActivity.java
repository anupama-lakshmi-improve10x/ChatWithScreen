package com.sunshine.chatwithscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.sunshine.chatwithscreens.advancedseries.AdvancedSeriesActivity;
import com.sunshine.chatwithscreens.grocery.GroceryActivity;
import com.sunshine.chatwithscreens.message.MessagesActivity;
import com.sunshine.chatwithscreens.movies.MoviesScreenActivity;
import com.sunshine.chatwithscreens.series.SeriesScreenActivity;
import com.sunshine.chatwithscreens.template.TemplatesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handleTemplateButton();
        handleMessageButton();
        handleSeriesButton();
        handleMoviesButton();
        handleAdvancedSeriesButton();
        handleGroceryButton();
    }

    public void handleTemplateButton() {
        Button templateBtn = findViewById(R.id.template_btn);
        templateBtn.setOnClickListener(view -> {
            Intent templateIntent = new Intent(this, TemplatesActivity.class);
            startActivity(templateIntent);
        });
    }

    public void handleMessageButton(){
        Button messageBtn = findViewById(R.id.message_btn);
        messageBtn.setOnClickListener(view -> {
            Intent messageIntent = new Intent(this, MessagesActivity.class);
            startActivity(messageIntent);
        });
    }

    public void handleSeriesButton(){
        Button seriesBtn = findViewById(R.id.series_btn);
        seriesBtn.setOnClickListener(view -> {
            Intent seriesIntent = new Intent(this, SeriesScreenActivity.class);
            startActivity(seriesIntent);
        });
    }

    public void handleMoviesButton(){
        Button moviesBtn = findViewById(R.id.movies_btn);
        moviesBtn.setOnClickListener(view -> {
            Intent moviesIntent = new Intent(this, MoviesScreenActivity.class);
            startActivity(moviesIntent);
        });
    }

    public void handleAdvancedSeriesButton(){
        Button seriesBtn = findViewById(R.id.advanced_series_btn);
        seriesBtn.setOnClickListener(view ->{
            Intent advancedSeriesIntent = new Intent(this, AdvancedSeriesActivity.class);
            startActivity(advancedSeriesIntent);
        });
    }

    public void handleGroceryButton(){
        Button groceryBtn = findViewById(R.id.grocery_btn);
        groceryBtn.setOnClickListener(view -> {
            Intent groceryIntent = new Intent(this, GroceryActivity.class);
            startActivity(groceryIntent);
        });
    }
}