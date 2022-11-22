package com.sunshine.chatwithscreens.advancedseries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sunshine.chatwithscreens.R;

import java.util.ArrayList;

public class AdvancedSeriesActivity extends AppCompatActivity {
    public ArrayList<AdvancedSeries> moviesList;
    public RecyclerView advancedSeriesRv;
    public AdvancesSeriesAdapter advancesSeriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_series);
        getSupportActionBar().setTitle("Series");
        setupData();
        setupAdavanceSeriesRecyclerView();
    }

    private void setupAdavanceSeriesRecyclerView() {
        advancedSeriesRv = findViewById(R.id.adavanced_series_rv);
        advancedSeriesRv.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));
        advancesSeriesAdapter = new AdvancesSeriesAdapter();
        advancesSeriesAdapter.setData(moviesList);
        advancedSeriesRv.setAdapter(advancesSeriesAdapter);
    }

    public void setupData() {
        moviesList = new ArrayList<>();
        AdvancedSeries harryPotter1 = new AdvancedSeries();
        harryPotter1.seriesId = 1;
        harryPotter1.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/f/f3/Harry_Potter_and_the_Philosopher%27s_Stone_%28film%29%28Movieposter%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004220";
        harryPotter1.title = "Harry Potter and the Sorcerer's Stone";
        moviesList.add(harryPotter1);

        AdvancedSeries harryPotter2 = new AdvancedSeries();
        harryPotter2.seriesId = 2;
        harryPotter2.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/1/1c/Harry_Potter_and_the_Chamber_of_Secrets_%28film%29%28Movie_Poster%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004647";
        harryPotter2.title = "Harry Potter and the Chamber's Stone";
        moviesList.add(harryPotter2);

        AdvancedSeries harryPotter3 = new AdvancedSeries();
        harryPotter3.seriesId = 3;
        harryPotter3.imageUrl = "https://images.moviesanywhere.com/1da041f4db01054fe099a9be01ddb6a2/f981fa35-0a7a-449a-ba99-f54a724ce278.jpg";
        harryPotter3.title = " Harry Potter and the Prisoner of Azkaban";
        moviesList.add(harryPotter3);

        AdvancedSeries harryPotter4 = new AdvancedSeries();
        harryPotter4.seriesId = 4;
        harryPotter4.imageUrl = "https://img2.sfilm.hu/original/7VRkmVB23rloRbZHsCRPscXlgQp.jpg";
        harryPotter4.title = "Harry Potter and the Goblet of Fire";
        moviesList.add(harryPotter4);

        AdvancedSeries harryPotter5 = new AdvancedSeries();
        harryPotter5.seriesId = 5;
        harryPotter5.imageUrl = "https://images.moviesanywhere.com/e1752b37b6a6277dc16ed75b55b4883f/688a801d-4a1b-424e-b949-80253e07d0e2.jpg";
        harryPotter5.title ="Harry Potter and the Order of the Phoenix";
        moviesList.add(harryPotter5);

        AdvancedSeries harryPotter6 = new AdvancedSeries();
        harryPotter6.seriesId = 6;
        harryPotter6.imageUrl = "https://images.moviesanywhere.com/144db183a81872d493990cb46599dc92/78f6e38f-1223-4dd9-b5e2-98181d340dde.jpg";
        harryPotter6.title = "HarryPotter And The Half Blood Prince";
        moviesList.add(harryPotter6);

        AdvancedSeries harryPotter7 = new AdvancedSeries();
        harryPotter7.seriesId = 7;
        harryPotter7.imageUrl = "https://images.moviesanywhere.com/de6092b467fc299fdf79a51dfa7f9710/12b877a3-28de-46ff-820f-dd8bf07e8edb.jpg";
        harryPotter7.title = "Harry Potter and the Deathly Hallows part 1";
        moviesList.add(harryPotter7);

        AdvancedSeries harryPotter8 = new AdvancedSeries();
        harryPotter8.seriesId = 8;
        harryPotter8.imageUrl ="https://images.moviesanywhere.com/5f0537520f90b687fc5db7f241affc4c/0280fd81-6b8a-49cc-9b81-5154eee498dc.jpg";
        harryPotter8.title = "Harry Potter and the Deathly Hallows part 2";
        moviesList.add(harryPotter8);
    }
}