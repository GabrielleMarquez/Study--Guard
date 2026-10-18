package com.example.studyguard;


import android.widget.FrameLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.appcompa.app.AppCompatActivity;

public class rfid_scanner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rfid_scanner);

        FrameLayout scannerFrame = findViewById(R.id.scannerFrame);

        scannerFrame.setOnClickListener(view ->
                Toast.makeText(
                        rfid_scanner.this,
                        "Scanner tapped! RFID reading is not connected yet.",
                        Toast.LENGTH_SHORT
                ).show()
        );
    }
}


