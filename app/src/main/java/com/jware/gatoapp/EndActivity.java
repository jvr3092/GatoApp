package com.jware.gatoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndActivity extends Activity {

    TextView txtwnr;
    Button btnagain, btnindex;
    char wnr, manPlay, comPlay, difficulty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        txtwnr = (TextView) findViewById(R.id.txtwinner);
        btnagain = (Button) findViewById(R.id.btnagain);
        btnindex = (Button) findViewById(R.id.btnindex);
        wnr = getIntent().getCharExtra("Winner", 'D');
        manPlay = getIntent().getCharExtra("manPlay", 'O');
        comPlay = getIntent().getCharExtra("comPlay", 'X');
        difficulty = getIntent().getCharExtra("diff", 'H');

        if(wnr == 'X') {
            txtwnr.setText(getResources().getString(R.string.winX));
        }else if(wnr == 'O') {
            txtwnr.setText(getResources().getString(R.string.winO));
        }
        else {
            txtwnr.setText(getResources().getString(R.string.draw));
        }

        btnagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(difficulty == 'H') {
                    Intent dif = new Intent(EndActivity.this, GameHActivity.class);
                    dif.putExtra("manPlay", manPlay);
                    dif.putExtra("comPlay", comPlay);
                    startActivity(dif);
                }else if(difficulty == 'N') {
                    Intent dif = new Intent(EndActivity.this, GameNActivity.class);
                    dif.putExtra("manPlay", manPlay);
                    dif.putExtra("comPlay", comPlay);
                    startActivity(dif);
                }else if(difficulty == 'E') {
                    Intent dif = new Intent(EndActivity.this, GameEActivity.class);
                    dif.putExtra("manPlay", manPlay);
                    dif.putExtra("comPlay", comPlay);
                    startActivity(dif);
                }
            }
        });

        btnindex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ini = new Intent(EndActivity.this, ChooseActivity.class);
                startActivity(ini);
            }
        });
    }
}
