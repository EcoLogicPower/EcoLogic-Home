package com.example.doamneajuta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DataLog extends AppCompatActivity {
    Button submitanswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_log);
        submitanswers=findViewById(R.id.submitanswers);
        submitanswers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DataLog.this, Score_Calculator.class);
                startActivity(intent);
            }
        });
}
}