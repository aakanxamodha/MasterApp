package com.example.everythinghere;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_life_cycle);

        Log.d("Activity Lifecycle", "onCreate invoked!");

        Button lifeBtn = findViewById(R.id.button10);
        lifeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LifeCycle.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void onStart()
    {
        super.onStart();
        Log.d("Activity Lifecycle", "onStart invoked!");
    }

    protected void onResume() {
        super.onResume();
        Log.d("Activity Lifecycle","onResume invoked");
    }

    protected void onPause() {
        super.onPause();
        Log.d("Activity Lifecycle","onPauseinvoked");
    }

    protected void onStop() {
        super.onStop();
        Log.d("Activity Lifecycle","onStopinvoked");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("Activity Lifecycle","onRestartinvoked");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity Lifecycle","onDestroyinvoked");
    }
}