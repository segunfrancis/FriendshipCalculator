package com.example.computer.ratingbarcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private float first, second, third, fourth, fifth, sixth;
    private String firstString,secondString, thirdString, fourthString, fifthString, sixthString;
    private TextView personality, communication, humour, sensitive, godFearing, smart, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        personality = findViewById(R.id.textView15);
        communication = findViewById(R.id.textView16);
        humour = findViewById(R.id.textView17);
        sensitive = findViewById(R.id.textView18);
        godFearing = findViewById(R.id.textView19);
        smart = findViewById(R.id.textView20);
        total = findViewById(R.id.textView21);

        Intent intent = getIntent();
        first = intent.getFloatExtra("first", 0.0F);
        second = intent.getFloatExtra("second", 0.0F);
        third = intent.getFloatExtra("third", 0.0F);
        fourth = intent.getFloatExtra("fourth", 0.0F);
        fifth = intent.getFloatExtra("fifth", 0.0F);
        sixth = intent.getFloatExtra("sixth", 0.0F);
//        Bundle bundle = getIntent().getExtras();
//        if (bundle != null) {
//            first = bundle.getFloat("first");
//            second = bundle.getFloat("second");
//            third = bundle.getFloat("third");
//            fourth = bundle.getFloat("fourth");
//            fifth = bundle.getFloat("fifth");
//            sixth = bundle.getFloat("sixth");
//        }


        personality.setText(first + " stars");
        communication.setText(second + " stars");
        humour.setText(third + " stars");
        sensitive.setText(fourth + " stars");
        godFearing.setText(fifth + " stars");
        smart.setText(sixth + " stars");

        float totalStars = first + second + third + fourth + fifth + sixth;
        float percentage = totalStars / 30 * 100;
        total.setText(totalStars + " stars " + "(" + percentage + "%" + ")");
    }
}