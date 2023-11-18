package com.example.doamneajuta;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result2 extends AppCompatActivity {
    TextView loginRedirectText;
    Button logdata;
    Button popup;
    AlertDialog alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);
        loginRedirectText= findViewById(R.id.textViewLeaderboard);
        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Result2.this, Leaderboard.class);
                startActivity(intent);
            }

        });
        logdata=findViewById(R.id.button);
        logdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Result2.this, LogData2.class);
                startActivity(intent);
            }

        });
        popup = findViewById(R.id.button2);
        popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupDialog();
            }
        });
    }
    private void showPopupDialog() {
        // Create an AlertDialog.Builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // Get the layout inflater
        LayoutInflater inflater = getLayoutInflater();

        // Inflate the custom layout for the dialog
        View dialogView = inflater.inflate(R.layout.popup, null);

        // Set the custom layout to the dialog
        builder.setView(dialogView);

        // Find views in the custom layout
        TextView dialogText = dialogView.findViewById(R.id.dialogText);
        Button dialogButton = dialogView.findViewById(R.id.dialogButton);

        // Set text or perform any customization
        dialogText.setText("Your electricity consumption was very high today; here are some ways you can reduce it and save energy and money:\n" +
                "\n" +
                "1. Upgrade Appliances: Choose energy-efficient models.\n" +
                "2. Turn Off Lights: Develop the habit of switching off lights and electronics.\n" +
                "3. Unplug Chargers: Disconnect chargers and unused devices to prevent standby energy usage.\n" +
                "4. Set Thermostat Wisely: Adjust to an energy-efficient temperature.");

        // Set button click listener
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Dismiss the dialog when the button is clicked
                alertDialog.dismiss();
            }
        });

        // Create the AlertDialog
        alertDialog = builder.create();

        // Set a listener to dismiss the dialog when the "OK" button is clicked
        alertDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                // Code to be executed when the dialog is dismissed
            }
        });

        // Show the dialog
        alertDialog.show();
    }
}