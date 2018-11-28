package com.example.computer.ratingbarcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RatingBar firstRatingBar, secondRatingBar, thirdRatingBar, fourthRatingBar, fifthRatingBar, sixthRatingBar;
    private float firstRating, secondRating, thirdRating, fourthRating, fifthRating, sixthRating;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstRatingBar = findViewById(R.id.ratingBar1);
        secondRatingBar = findViewById(R.id.ratingBar2);
        thirdRatingBar = findViewById(R.id.ratingBar3);
        fourthRatingBar = findViewById(R.id.ratingBar4);
        fifthRatingBar = findViewById(R.id.ratingBar5);
        sixthRatingBar = findViewById(R.id.ratingBar6);

        calculate = findViewById(R.id.calculate_button);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstRating = firstRatingBar.getRating();
                secondRating = secondRatingBar.getRating();
                thirdRating = thirdRatingBar.getRating();
                fourthRating = fourthRatingBar.getRating();
                fifthRating = fifthRatingBar.getRating();
                sixthRating = sixthRatingBar.getRating();
                startActivity(new Intent(MainActivity.this, ResultActivity.class)
                        .putExtra("first", firstRating).putExtra("second", secondRating).putExtra("third", thirdRating)
                        .putExtra("fourth", fourthRating).putExtra("fifth", fifthRating).putExtra("sixth", sixthRating));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.about) {
            startActivity(new Intent(MainActivity.this, AboutActivity.class));
        } else if (item.getItemId() == R.id.share) {
            startActivity(new Intent().setAction(Intent.ACTION_SEND)
                    .putExtra(Intent.EXTRA_TEXT, "https://goo.gl/MHPuqp").setType("text/plain"));
        }
        return super.onOptionsItemSelected(item);
    }
}