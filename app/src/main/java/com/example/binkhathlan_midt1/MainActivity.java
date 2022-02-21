package com.example.binkhathlan_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int playing;
    MediaPlayer mediaPlayer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("You are in Activity1");
        ImageView pic = (ImageView)findViewById(R.id.pic);
        mediaPlayer1 = MediaPlayer.create(this, R.raw.track1);
        playing=0;

    pic.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch(playing) {
                case 0:
                    mediaPlayer1.start();
                    playing = 1;
                    break;
                case 1:
                    mediaPlayer1.pause();
                    playing = 0;

                    break;
            }
        }
    });
    }
    }
