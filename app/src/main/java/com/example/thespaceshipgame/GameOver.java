package com.example.thespaceshipgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.OverScroller;
import android.view.View.OnClickListener;

public class GameOver extends AppCompatActivity {

    private Button playAgain, quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        playAgain = (Button) findViewById(R.id.playAgain);

        Intent intent = getIntent();
       String total_score = intent.getStringExtra("scoreValue");


        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameOver.this, MainActivity.class);
                startActivity(intent);
            }
        });



    quit =(Button)

    findViewById(R.id.quit);
        quit.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){
        finish();
        System.exit(0);
        }
        });
    }

}




