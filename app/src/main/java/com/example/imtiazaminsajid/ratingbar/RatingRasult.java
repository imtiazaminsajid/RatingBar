package com.example.imtiazaminsajid.ratingbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RatingRasult extends AppCompatActivity {
    TextView value;

    String v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_rasult);

        value= findViewById(R.id.value);

        Intent intent = getIntent();

        v = intent.getStringExtra("Rating");

        value.setText("You Rated me "+v);



    }

}
