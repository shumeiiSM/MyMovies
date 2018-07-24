package com.example.a17010233.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    ImageView tvRated;
    TextView tvTitle;
    TextView tvYear;
    TextView tvGenre;
    TextView tvDescript;
    TextView tvWatch;
    TextView tvTheatre;
    RatingBar rateStar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvRated = findViewById(R.id.imageViewPG);
        tvTitle = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewDate);
        tvGenre = findViewById(R.id.textViewGenre);
        tvDescript = findViewById(R.id.textViewDescipt);
        tvWatch = findViewById(R.id.textViewWatch);
        tvTheatre = findViewById(R.id.textViewTheater);
        rateStar = findViewById(R.id.ratingBarMovie);

        Intent intentReceived = getIntent();

        String title = intentReceived.getStringExtra("title");
        String year = intentReceived.getStringExtra("year");
        String rated = intentReceived.getStringExtra("rated");
        String genre = intentReceived.getStringExtra("genre");
        String watch = intentReceived.getStringExtra("watchOn");
        String theatre = intentReceived.getStringExtra("inTheatre");
        String description = intentReceived.getStringExtra("descript");
        int rating = intentReceived.getIntExtra("rating", 0);


        tvTitle.setText(title);
        tvYear.setText(year + " - ");
        tvGenre.setText(genre);

        tvDescript.setText(description);
        tvWatch.setText("Watch on: "+ watch);
        tvTheatre.setText("In Theatre: "+ theatre );

        if (rated.equals("g")){
            tvRated.setImageResource(R.drawable.rating_g);
            rateStar.setRating(rating);

        } else if (rated.equals("pg")) {
            tvRated.setImageResource(R.drawable.rating_pg);
            rateStar.setRating(rating);

        } else if (rated.equals("pg13")) {
            tvRated.setImageResource(R.drawable.rating_pg13);
            rateStar.setRating(rating);

        } else if (rated.equals("nc16")) {
            tvRated.setImageResource(R.drawable.rating_nc16);
            rateStar.setRating(rating);

        } else if (rated.equals("m18")) {
            tvRated.setImageResource(R.drawable.rating_m18);
            rateStar.setRating(rating);

        } else {
            tvRated.setImageResource(R.drawable.rating_r21);
            rateStar.setRating(rating);
        }





    }

}
