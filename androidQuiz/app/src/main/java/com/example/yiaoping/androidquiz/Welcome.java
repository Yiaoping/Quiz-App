package com.example.yiaoping.androidquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {
    private Button welcomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        welcomeButton = (Button)findViewById(R.id.welcomeButton);
        welcomeButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent mainIntent = new Intent(Welcome.this, MainActivity.class);
                startActivity(mainIntent);
            }


        });
    }
}
