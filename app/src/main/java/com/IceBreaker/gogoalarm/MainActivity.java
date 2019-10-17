package com.IceBreaker.gogoalarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button alarmButton = findViewById(R.id.Alarms);

        alarmButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

            }
        });
    }



}
