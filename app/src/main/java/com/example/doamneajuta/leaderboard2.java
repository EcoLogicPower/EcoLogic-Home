package com.example.doamneajuta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class leaderboard2 extends AppCompatActivity {
    TextView HomeRedirectText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard2);
        HomeRedirectText= findViewById(R.id.textViewHome);
        HomeRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (leaderboard2.this, Rezultat.class);
                startActivity(intent);
            }

        });
    }
}