package com.example.studyguard;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LanguageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_language);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialization
        RadioGroup radioGroupLanguages = findViewById(R.id.radioGroupLanguages);
        TextView btnCancel = findViewById(R.id.btnCancel);

        // Event listener & data capture for language selection
        if (radioGroupLanguages != null) {
            radioGroupLanguages.setOnCheckedChangeListener((group, checkedId) -> {
                RadioButton selectedRb = findViewById(checkedId);
                if (selectedRb != null) {
                    String selectedLanguage = selectedRb.getText().toString();
                    Toast.makeText(LanguageActivity.this, "Language selected: " + selectedLanguage, Toast.LENGTH_SHORT).show();
                }
            });
        }

        // Cancel button event listener & action
        if (btnCancel != null) {
            btnCancel.setOnClickListener(v -> {
                Toast.makeText(LanguageActivity.this, "Cancelled", Toast.LENGTH_SHORT).show();
                finish();
            });
        }
    }
}
