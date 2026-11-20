package com.example.studyguard;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AttendanceRecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_attendance_record);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnCheckStatus = findViewById(R.id.btnCheckStatus);
        ImageView imageView2 = findViewById(R.id.imageView2);

        if (btnCheckStatus != null) {
            btnCheckStatus.setOnClickListener(v -> Toast.makeText(AttendanceRecord.this, "Attendance status checked!", Toast.LENGTH_SHORT).show());
        }

        if (imageView2 != null) {
            imageView2.setOnClickListener(v -> finish());
        }
    }
}
