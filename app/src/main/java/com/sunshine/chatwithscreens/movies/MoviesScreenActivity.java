package com.sunshine.chatwithscreens.movies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sunshine.chatwithscreens.R;

import java.util.ArrayList;

public class MoviesScreenActivity extends AppCompatActivity {

    public ArrayList<Movies> movies;
    public RecyclerView moviesRv;
    public MoviesAdapter moviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_screen);
        getSupportActionBar().setTitle("Movies");
        setupData();
        setupMoviesRecyclerView();
    }

    public void setupMoviesRecyclerView() {
        moviesRv = findViewById(R.id.movies_rv);
        moviesRv.setLayoutManager(new GridLayoutManager(this,2));
        moviesAdapter = new MoviesAdapter();
        moviesAdapter.setData(movies);
        moviesRv.setAdapter(moviesAdapter);
    }

    private void setupData() {
        movies = new ArrayList<>();
        Movies harryPotter1 = new Movies();
        harryPotter1.seriesId = 1;
        harryPotter1.movieId = 1;
        harryPotter1.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/f/f3/Harry_Potter_and_the_Philosopher%27s_Stone_%28film%29%28Movieposter%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004220";
        harryPotter1.title = "Harry Potter and the Sorcerer's Stone";
        movies.add(harryPotter1);

        Movies harryPotter2 = new Movies();
        harryPotter2.seriesId = 2;
        harryPotter2.movieId = 2;
        harryPotter2.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/1/1c/Harry_Potter_and_the_Chamber_of_Secrets_%28film%29%28Movie_Poster%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004647";
        harryPotter2.title = "Harry Potter and the Chamber's Stone";
        movies.add(harryPotter2);

        Movies harryPotter3 = new Movies();
        harryPotter3.seriesId = 3;
        harryPotter3.movieId = 3;
        harryPotter3.imageUrl = "https://images.moviesanywhere.com/1da041f4db01054fe099a9be01ddb6a2/f981fa35-0a7a-449a-ba99-f54a724ce278.jpg";
        harryPotter3.title = " Harry Potter and the Prisoner of Azkaban";
        movies.add(harryPotter3);

        Movies harryPotter4 = new Movies();
        harryPotter4.seriesId = 4;
        harryPotter4.movieId = 4;
        harryPotter4.imageUrl = "https://img2.sfilm.hu/original/7VRkmVB23rloRbZHsCRPscXlgQp.jpg";
        harryPotter4.title = "Harry Potter and the Goblet of Fire";
        movies.add(harryPotter4);

        Movies harryPotter5 = new Movies();
        harryPotter5.seriesId = 5;
        harryPotter5.movieId = 5;
        harryPotter5.imageUrl = "https://images.moviesanywhere.com/e1752b37b6a6277dc16ed75b55b4883f/688a801d-4a1b-424e-b949-80253e07d0e2.jpg";
        harryPotter5.title ="Harry Potter and the Order of the Phoenix";
        movies.add(harryPotter5);

        Movies harryPotter6 = new Movies();
        harryPotter6.seriesId = 6;
        harryPotter6.movieId = 6;
        harryPotter6.imageUrl = "https://images.moviesanywhere.com/144db183a81872d493990cb46599dc92/78f6e38f-1223-4dd9-b5e2-98181d340dde.jpg";
        harryPotter6.title = "HarryPotter And The Half Blood Prince";
        movies.add(harryPotter6);

        Movies harryPotter7 = new Movies();
        harryPotter7.seriesId = 7;
        harryPotter7.movieId = 7;
        harryPotter7.imageUrl = "https://images.moviesanywhere.com/de6092b467fc299fdf79a51dfa7f9710/12b877a3-28de-46ff-820f-dd8bf07e8edb.jpg";
        harryPotter7.title = "Harry Potter and the Deathly Hallows part 1";
        movies.add(harryPotter7);

        Movies harryPotter8 = new Movies();
        harryPotter8.seriesId = 8;
        harryPotter8.movieId = 8;
        harryPotter8.imageUrl ="https://images.moviesanywhere.com/5f0537520f90b687fc5db7f241affc4c/0280fd81-6b8a-49cc-9b81-5154eee498dc.jpg";
        harryPotter8.title = "Harry Potter and the Deathly Hallows part 2";
        movies.add(harryPotter8);

    }
}