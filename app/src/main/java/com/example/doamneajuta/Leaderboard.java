package com.example.doamneajuta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Leaderboard extends AppCompatActivity {
    TextView homeRedirectText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);
        homeRedirectText= findViewById(R.id.textViewHome);
        homeRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Leaderboard.this, Result2.class);
                startActivity(intent);
            }

        });
    }
}