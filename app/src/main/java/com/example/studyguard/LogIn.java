package com.example.studyguard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {

    private EditText studentNumberInput;
    private EditText passwordInput;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        studentNumberInput = findViewById(R.id.studentNumber);
        passwordInput = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(v -> {
            String studentNumber = studentNumberInput.getText().toString().trim();
            String password = passwordInput.getText().toString().trim();

            if (studentNumber.isEmpty()) {
                studentNumberInput.setError("Please enter student number");
                return;
            }

            if (password.isEmpty()) {
                passwordInput.setError("Please enter password");
                return;
            }

            // Perform login logic or navigation
            Toast.makeText(LogIn.this, "Login Successful!", Toast.LENGTH_SHORT).show();

            // Example: Navigate to the next activity (e.g., RFID Scanner)
            Intent intent = new Intent(LogIn.this, rfid_scanner.class);
            startActivity(intent);
        });
    }
}
