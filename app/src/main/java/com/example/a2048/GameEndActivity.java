package com.example.a2048;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameEndActivity extends AppCompatActivity {
    Intent i;
    Button btnNew;
    Button btnMenu;
    TextView tvMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_end);
        tvMsg = (TextView)findViewById(R.id.tv_msg);
        tvMsg.setText("You " + i.getStringExtra("EXTRA_MESSAGE"));
        btnNew = (Button)findViewById(R.id.btnNew);
        btnMenu = (Button)findViewById(R.id.btnMenu);
        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NewGame = new Intent(GameEndActivity.this, GameActivity.class);
            }
        });
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Menu = new Intent(GameEndActivity.this, MainActivity.class);
            }
        });

    }
}
