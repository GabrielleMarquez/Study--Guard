package com.example.studyguard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {

    private EditText etStudentNumber, etPassword;
    private Button btnLogin;
    private TextView tvResetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 1. Initialization: Find views by ID matching activity_login.xml
        etStudentNumber = findViewById(R.id.etStudentNumber);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvResetPassword = findViewById(R.id.tvResetPassword);

        // 2. Event listener & data capture for login button
        if (btnLogin != null) {
            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Data capture
                    String studentNumberStr = etStudentNumber != null ? etStudentNumber.getText().toString().trim() : "";
                    String passwordStr = etPassword != null ? etPassword.getText().toString().trim() : "";

                    // Validation
                    if (studentNumberStr.isEmpty()) {
                        if (etStudentNumber != null) {
                            etStudentNumber.setError("Student number is required");
                            etStudentNumber.requestFocus();
                        }
                        return;
                    }

                    if (passwordStr.isEmpty()) {
                        if (etPassword != null) {
                            etPassword.setError("Password is required");
                            etPassword.requestFocus();
                        }
                        return;
                    }

                    // Success Toast with captured data
                    Toast.makeText(LogIn.this, "Login Successful! Student: " + studentNumberStr, Toast.LENGTH_SHORT).show();

                    // Intent navigation to Settings / Dashboard
                    Intent intent = new Intent(LogIn.this, SettingsActivity.class);
                    intent.putExtra("student_number", studentNumberStr);
                    startActivity(intent);
                }
            });
        }

        // 3. Event listener for reset password
        if (tvResetPassword != null) {
            tvResetPassword.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(LogIn.this, "Opening Reset Password", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LogIn.this, ChangePasswordActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}
