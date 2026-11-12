package com.example.studyguard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogOut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_out);

        TextView btnLogOut = findViewById(R.id.btnLogOut);
        Button btnCancel = findViewById(R.id.btnCancel);
        TextView tvTerms = findViewById(R.id.tvTerms);

        if (btnLogOut != null) {
            btnLogOut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(LogOut.this, "Logged out successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LogOut.this, LogIn.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    finish();
                }
            });
        }

        if (btnCancel != null) {
            btnCancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(LogOut.this, "Logout cancelled", Toast.LENGTH_SHORT).show();
                    finish();
                }
            });
        }

        if (tvTerms != null) {
            tvTerms.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(LogOut.this, "Terms & Conditions clicked", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
