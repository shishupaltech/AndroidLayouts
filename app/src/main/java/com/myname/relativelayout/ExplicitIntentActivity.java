package com.myname.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {
    TextView tvOne, tvTwo;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Explicit Intent");

        tvOne = findViewById(R.id.tvFirst);
        tvTwo = findViewById(R.id.tvSecond);

        // we use intent for data fetch and send

        Intent intent = getIntent();
        data = intent.getStringExtra("name");

        tvOne.setText(data);
        tvTwo.setText(data);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}