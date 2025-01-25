package com.example.everythinghere;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button week1_1 = findViewById(R.id.button);
        week1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HelloWorldApp.class);
                startActivity(intent);
            }
        });

        Button week1_2 = findViewById(R.id.button2);
        week1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ToastApp.class);
                startActivity(intent);
            }
        });

        Button week1_3 = findViewById(R.id.button3);
        week1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LifeCycle.class);
                startActivity(intent);
            }
        });

        Button week2 = findViewById(R.id.button4);
        week2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Summation.class);
                startActivity(intent);
            }
        });

        Button week3_1 = findViewById(R.id.button5);
        week3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UserInfo.class);
                startActivity(intent);
            }
        });

        Button week3_2 = findViewById(R.id.button6);
        week3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CalcApp.class);
                startActivity(intent);
            }
        });

        Button week4_1 = findViewById(R.id.button7);
        week4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SourceActivity.class);
                startActivity(intent);
            }
        });

    }
}
