package com.example.yiaoping.androidquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {
    private TextView scoretextView;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        score = intent.getIntExtra("score_value", 0);
        System.out.println(score);

        scoretextView = (TextView)findViewById(R.id.scoreView);
        scoretextView.setText("Your total score is \n" + score + "\n Out of 20");
    }
}
