package com.example.doamneajuta;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Rezultat extends AppCompatActivity {
    TextView RankingRedirectText;
    Button button;
    AlertDialog alertDialog; // Declare alertDialog as a field

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rezultat);

        // Set up click listener for TextView to redirect to leaderboard2
        RankingRedirectText = findViewById(R.id.textViewLeaderboard);
        RankingRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Rezultat.this, leaderboard2.class);
                startActivity(intent);
            }
        });

        // Set up click listener for Button2 to show the popup dialog
        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
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
        dialogText.setText("Your water consumption was very high today; here are some ways you can reduce it and save water and money:\n" +
                "1. Upgrade Appliances: Invest in water-efficient models.\n" +
                "2. Shorter Showers: Encourage quick showers to cut water consumption.\n" +
                "3. Graywater for Plants: Reuse water for outdoor irrigation.\n" +
                "4. Optimize Dishwashing: Run the dishwasher only with full loads.");

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