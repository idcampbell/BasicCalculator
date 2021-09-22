package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Grab the textview for the new activity and populate it with the user input.
        resultText = (TextView) findViewById(R.id.result);
        Intent intent = getIntent();
        String result = intent.getStringExtra("result");
        resultText.setText(result);
    }
}