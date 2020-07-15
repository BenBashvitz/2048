package com.example.a2048;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    int[] arr_id;
    ImageButton BtnRight,BtnLeft,BtnUp,BtnDown;
    MatrixView mtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        arr_id = new int[16];
        arr_id[0] = R.id.Sqr1;
        arr_id[1] = R.id.Sqr2;
        arr_id[2] = R.id.Sqr3;
        arr_id[3] = R.id.Sqr4;
        arr_id[4] = R.id.Sqr5;
        arr_id[5] = R.id.Sqr5;
        arr_id[6] = R.id.Sqr6;
        arr_id[7] = R.id.Sqr7;
        arr_id[8] = R.id.Sqr8;
        arr_id[9] = R.id.Sqr9;
        arr_id[10] = R.id.Sqr10;
        arr_id[11] = R.id.Sqr11;
        arr_id[12] = R.id.Sqr12;
        arr_id[13] = R.id.Sqr13;
        arr_id[14] = R.id.Sqr14;
        arr_id[15] = R.id.Sqr15;
        arr_id[16] = R.id.Sqr16;
        mtv = new MatrixView(arr_id);
        mtv.GameStart();
        BtnRight = (ImageButton)findViewById(R.id.BtnRight);
        BtnLeft = (ImageButton)findViewById(R.id.BtnLeft);
        BtnUp = (ImageButton)findViewById(R.id.BtnUp);
        BtnDown = (ImageButton)findViewById(R.id.BtnDown);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        BtnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtv.SlideDown();
                mtv.AfterMove();
                mtv.UpdateMatrix();
                mtv.CheckLose();
                mtv.CheckWin();
            }
        });
        BtnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtv.SlideUp();
                mtv.AfterMove();
                mtv.UpdateMatrix();
                mtv.CheckLose();
                mtv.CheckWin();
            }
        });
        BtnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtv.SlideRight();
                mtv.AfterMove();
                mtv.UpdateMatrix();
                mtv.CheckLose();
                mtv.CheckWin();
            }
        });
        BtnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtv.SlideLeft();
                mtv.AfterMove();
                mtv.UpdateMatrix();
                mtv.CheckLose();
                mtv.CheckWin();
            }
        });
    }
}
