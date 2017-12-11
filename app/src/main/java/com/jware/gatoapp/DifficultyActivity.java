package com.jware.gatoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DifficultyActivity extends Activity {

    Button easy, normal, hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        final char manPlay = getIntent().getCharExtra("manPlay", 'O');
        final char comPlay = getIntent().getCharExtra("comPlay", 'X');

        easy = (Button) findViewById(R.id.easyBtn);
        normal = (Button) findViewById(R.id.normalBtn);
        hard = (Button) findViewById(R.id.hardBtn);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent difficulty = new Intent(DifficultyActivity.this, GameEActivity.class);
                difficulty.putExtra("manPlay", manPlay);
                difficulty.putExtra("comPlay", comPlay);
                startActivity(difficulty);
            }
        });

        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent difficulty = new Intent(DifficultyActivity.this, GameNActivity.class);
                difficulty.putExtra("manPlay", manPlay);
                difficulty.putExtra("comPlay", comPlay);
                startActivity(difficulty);
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent difficulty = new Intent(DifficultyActivity.this, GameHActivity.class);
                difficulty.putExtra("manPlay", manPlay);
                difficulty.putExtra("comPlay", comPlay);
                startActivity(difficulty);
            }
        });
    }
}
