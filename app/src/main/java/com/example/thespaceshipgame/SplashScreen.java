package com.example.thespaceshipgame;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;


public class SplashScreen extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        Thread thread = new Thread(){
          @Override
          public void run(){

              try { sleep(4000);}
              catch (Exception e){e.printStackTrace();}
              finally {

                  Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                  startActivity(intent);
              }

          }
        };
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}