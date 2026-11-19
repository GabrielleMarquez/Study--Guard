package com.example.studyguard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_settings);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialization
        Button btnLogout = findViewById(R.id.btnLogout);
        Button btnChangePassword = findViewById(R.id.btnChangePassword);
        Button btnNotification = findViewById(R.id.btnNotification);
        Button btnLanguage = findViewById(R.id.btnLanguage);
        TextView txtTerms = findViewById(R.id.txtTerms);
        ImageView profileIcon = findViewById(R.id.profileIcon);

        // Event listeners & Intents
        if (btnLogout != null) {
            btnLogout.setOnClickListener(v -> {
                Intent intent = new Intent(SettingsActivity.this, LogOut.class);
                startActivity(intent);
            });
        }

        if (btnChangePassword != null) {
            btnChangePassword.setOnClickListener(v -> {
                Intent intent = new Intent(SettingsActivity.this, ChangePasswordActivity.class);
                startActivity(intent);
            });
        }

        if (btnNotification != null) {
            btnNotification.setOnClickListener(v -> 
                Toast.makeText(SettingsActivity.this, "Notifications toggled", Toast.LENGTH_SHORT).show()
            );
        }

        if (btnLanguage != null) {
            btnLanguage.setOnClickListener(v -> {
                Intent intent = new Intent(SettingsActivity.this, LanguageActivity.class);
                startActivity(intent);
            });
        }

        if (txtTerms != null) {
            txtTerms.setOnClickListener(v -> 
                Toast.makeText(SettingsActivity.this, "Terms & Conditions clicked", Toast.LENGTH_SHORT).show()
            );
        }

        if (profileIcon != null) {
            profileIcon.setOnClickListener(v -> 
                Toast.makeText(SettingsActivity.this, "Profile icon clicked", Toast.LENGTH_SHORT).show()
            );
        }
    }
}
