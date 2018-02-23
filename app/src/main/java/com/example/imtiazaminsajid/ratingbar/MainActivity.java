package com.example.imtiazaminsajid.ratingbar;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    Button submit;
    String rating_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        submit = findViewById(R.id.submit);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

                rating_value = String.valueOf(v);

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, RatingRasult.class);
                intent.putExtra("Rating", rating_value);

                startActivity(intent);

            }
        });
//
//        Intent intent = new Intent(MainActivity.this, RatingBar.class);
////                intent.putExtra("Rating", (Parcelable) ratingBar);
////
////                startActivity(intent);
    }

}
