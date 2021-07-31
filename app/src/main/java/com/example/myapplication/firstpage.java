package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class firstpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);

        Button newgame , exit;

        newgame = (Button) findViewById(R.id.newgame_button);
        exit = (Button) findViewById(R.id.exit_button);
        Byte[] buffer = new Byte[1024];
        while ((length=myInput.read(buffer))>0){

        }
        newgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firstpage.this, GameBoard.class);
                startActivity(intent);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
//        public void openNewAct() {
//            Intent intent = new Intent(this, GameBoard.class);
//            startActivity(intent);
//        }



    }
}