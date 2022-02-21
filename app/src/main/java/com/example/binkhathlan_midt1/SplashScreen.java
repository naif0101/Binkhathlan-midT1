package com.example.binkhathlan_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        TextView textView;
        textView = findViewById(R.id.counter);
        /*int j;

        int[] numIndex = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        for (j = 9; j >= 0; j--) { // from 9 to 0
            textView.setText(numIndex[j]);*/


            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    finish();
                    startActivity(new Intent(
                            SplashScreen.this, MainActivity.class
                    ));
                }
            };
            Timer opening = new Timer();
            opening.schedule(timerTask, 9000);
        }
    }