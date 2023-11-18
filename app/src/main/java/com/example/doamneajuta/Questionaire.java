package com.example.doamneajuta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Questionaire extends AppCompatActivity  {

    Button signButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionaire);

        signButton = findViewById(R.id.signButton);
        signButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the spinner selections here
                // Access the selected values from helper2.getPers(), helper2.getCam(), etc.
                Toast.makeText(Questionaire.this, "You have registered successfully", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Questionaire.this, Login.class);
                startActivity(intent);
            }
        });
    }


}