package com.sunshine.chatwithscreens.series;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sunshine.chatwithscreens.R;

import java.util.ArrayList;

public class SeriesScreenActivity extends AppCompatActivity {
    public ArrayList<Series> series;
    public RecyclerView seriesRv;
    public SeriesAdapter seriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series_screen);
        getSupportActionBar().setTitle("Series");
        setupData();
        setupSeriesRecyclerView();
    }

    private void setupSeriesRecyclerView() {
        seriesRv = findViewById(R.id.series_rv);
        seriesRv.setLayoutManager(new LinearLayoutManager(this));
        seriesAdapter = new SeriesAdapter();
        seriesAdapter.setData(series);
        seriesRv.setAdapter(seriesAdapter);
    }

    private void setupData() {
        series = new ArrayList<>();
        Series kungFuPanda = new Series();
        kungFuPanda.seriesId = 1;
        kungFuPanda.title = "Kung Fu Panda Movie Series";
        kungFuPanda.imageUrl = "https://occ-0-1556-1007.1.nflxso.net/dnm/api/v6/E8vDc_W8CLv7-yMQu8KMEC7Rrr8/AAAABduFRBhx6t-Dhqq_nz4teWtFQs7rpEnkYggmaKnJ1jjtbaGGqVSTZi1OfHu6DkmLzO7d5bXlhKYE1Eu6jrJoaO64l0uKJY2YEHJb.jpg?r=109";
        series.add(kungFuPanda);

        Series harryPotter = new Series();
        harryPotter.seriesId = 2;
        harryPotter.title = "Harry Potter";
        harryPotter.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/3/36/Harry-potter-films.png/revision/latest/scale-to-width-down/1000?cb=20110722151247";
        series.add(harryPotter);
    }
}