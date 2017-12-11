package com.jware.gatoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseActivity extends Activity {

    Button x, o;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        x = (Button) findViewById(R.id.btnx);
        x.setBackgroundResource(R.mipmap.cross);
        o = (Button) findViewById(R.id.btno);
        o.setBackgroundResource(R.mipmap.nought);

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent choose = new Intent(ChooseActivity.this, DifficultyActivity.class);
                choose.putExtra("manPlay", 'X');
                choose.putExtra("comPlay", 'O');
                startActivity(choose);
            }
        });

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent choose = new Intent(ChooseActivity.this, DifficultyActivity.class);
                choose.putExtra("manPlay", 'O');
                choose.putExtra("comPlay", 'X');
                startActivity(choose);
            }
        });
    }
}
