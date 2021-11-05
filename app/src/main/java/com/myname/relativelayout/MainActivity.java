package com.myname.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView one,two,three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       one =  findViewById(R.id.a);
       two = findViewById(R.id.b);
       three = findViewById(R.id.c);

       // basic call when we click on btn
       one.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "One is clicked", Toast.LENGTH_SHORT).show();
           }
       });

    }
}