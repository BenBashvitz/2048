package com.example.a2048;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        btn = (Button)findViewById(R.id.btn_start);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainActivity.this, GameActivity.class);
                startActivity(i);
            }
        });
    }
}
