package com.myname.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConstraintActivity extends AppCompatActivity {
    TextView neatRoots;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);
        neatRoots = findViewById(R.id.tvNeatRoots);

        // when we move one activity to another activity than we used intent
        neatRoots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = neatRoots.getText().toString();
                Intent intent = new Intent(ConstraintActivity.this,ExplicitIntentActivity.class);
                intent.putExtra("name",data);
                startActivity(intent);

            }
        });

    }
}