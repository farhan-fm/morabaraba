package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timer timer = new Timer();
        timer.schedule((TimerTask)(new TimerTask() {
            public void run() {
                Intent intent = new Intent((Context)MainActivity.this, firstpage.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        }), 3000L);


    }
}