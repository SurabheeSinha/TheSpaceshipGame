package com.example.thespaceshipgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private SpaceshipView spaceView;
    private Handler handler = new Handler();
    private final static long Interval = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        spaceView = new SpaceshipView(this);
        setContentView(spaceView);

        Timer timer = new Timer();
        timer.schedule(new TimerTask(){

            @Override
            public void run() {
                handler.post(new Runnable(){
                    @Override
                    public void run(){
                        spaceView.invalidate();
                    }

                });
            }
        }, 0, Interval);

    }
}