package com.example.everythinghere;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;

public class ToastApp extends AppCompatActivity {

    Button btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        setContentView(R.layout.activity_toast_app);

        btnToast = findViewById(R.id.btnToast);
        btnToast.setOnClickListener(this::toast);

        Toast.makeText(getApplicationContext(),"Toast Message without Button", Toast.LENGTH_LONG).show();

        Button toastBtn = findViewById(R.id.button9);
        toastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ToastApp.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void toast(View view) {
        Toast.makeText(ToastApp.this, "Toast Message with Button", Toast.LENGTH_LONG).show();
    }

}