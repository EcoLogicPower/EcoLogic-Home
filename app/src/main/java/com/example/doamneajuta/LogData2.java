package com.example.doamneajuta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogData2 extends AppCompatActivity {
    Button submitanswers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_data2);
        submitanswers=findViewById(R.id.submitanswers);
        submitanswers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogData2.this, ScoreCalculator2.class);
                startActivity(intent);
            }
        });
}}