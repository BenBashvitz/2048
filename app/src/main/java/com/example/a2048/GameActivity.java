package com.example.a2048;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    ImageView[] SqrArray;
    ImageButton BtnRight,BtnLeft,BtnUp,BtnDown;
    MatrixView mtv;
    Intent GameOver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mtv = new MatrixView();
        mtv.GameStart();
        SqrArray = new ImageView[16];
        SqrArray[0] = findViewById(R.id.Sqr1);
        SqrArray[1] = findViewById(R.id.Sqr2);
        SqrArray[2] = findViewById(R.id.Sqr3);
        SqrArray[3] = findViewById(R.id.Sqr4);
        SqrArray[4] = findViewById(R.id.Sqr5);
        SqrArray[5] = findViewById(R.id.Sqr6);
        SqrArray[6] = findViewById(R.id.Sqr7);
        SqrArray[7] = findViewById(R.id.Sqr8);
        SqrArray[8] = findViewById(R.id.Sqr9);
        SqrArray[9] = findViewById(R.id.Sqr10);
        SqrArray[10] = findViewById(R.id.Sqr11);
        SqrArray[11] = findViewById(R.id.Sqr12);
        SqrArray[12] = findViewById(R.id.Sqr13);
        SqrArray[13] = findViewById(R.id.Sqr14);
        SqrArray[14] = findViewById(R.id.Sqr15);
        SqrArray[15] = findViewById(R.id.Sqr16);
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(mtv.GetMatrix()[i][j] == 0)
                    SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile_blank));
                if(mtv.GetMatrix()[i][j] == 2)
                    SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile2));
                if(mtv.GetMatrix()[i][j] == 4)
                    SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile4));
                if(mtv.GetMatrix()[i][j] == 8)
                    SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile8));
                if(mtv.GetMatrix()[i][j] == 16)
                    SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile16));
                if(mtv.GetMatrix()[i][j] == 32)
                    SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile32));
                if(mtv.GetMatrix()[i][j] == 64)
                    SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile64));
                if(mtv.GetMatrix()[i][j] == 128)
                    SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile128));
                if(mtv.GetMatrix()[i][j] == 256)
                    SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile256));
                if(mtv.GetMatrix()[i][j] == 512)
                    SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile512));
                if(mtv.GetMatrix()[i][j] == 1024)
                    SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile1024));
                if(mtv.GetMatrix()[i][j] == 2048)
                    SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile2048));
            }
        }
        BtnRight = findViewById(R.id.BtnRight);
        BtnLeft = findViewById(R.id.BtnLeft);
        BtnDown = findViewById(R.id.BtnDown);
        BtnUp = findViewById(R.id.BtnUp);
        GameOver = new Intent(GameActivity.this, GameEndActivity.class);
        BtnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtv.SlideRight();
                mtv.AfterMove();
                for(int i = 0; i < 4; i++)
                {
                    for(int j = 0; j < 4; j++)
                    {
                        if(mtv.GetMatrix()[i][j] == 0)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile_blank));
                        if(mtv.GetMatrix()[i][j] == 2)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile2));
                        if(mtv.GetMatrix()[i][j] == 4)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile4));
                        if(mtv.GetMatrix()[i][j] == 8)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile8));
                        if(mtv.GetMatrix()[i][j] == 16)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile16));
                        if(mtv.GetMatrix()[i][j] == 32)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile32));
                        if(mtv.GetMatrix()[i][j] == 64)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile64));
                        if(mtv.GetMatrix()[i][j] == 128)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile128));
                        if(mtv.GetMatrix()[i][j] == 256)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile256));
                        if(mtv.GetMatrix()[i][j] == 512)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile512));
                        if(mtv.GetMatrix()[i][j] == 1024)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile1024));
                        if(mtv.GetMatrix()[i][j] == 2048)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile2048));
                    }
                }
                if(mtv.CheckWin())
                {
                    GameOver.putExtra("EXTRA_MESSAGE", "Win!");
                    startActivity(GameOver);
                }
                if(mtv.CheckLose())
                {
                    GameOver.putExtra("EXTRA_MESSAGE", "Lose!");
                    startActivity(GameOver);
                }
            }
        });
        BtnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtv.SlideLeft();
                mtv.AfterMove();
                for(int i = 0; i < 4; i++)
                {
                    for(int j = 0; j < 4; j++)
                    {
                        if(mtv.GetMatrix()[i][j] == 0)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile_blank));
                        if(mtv.GetMatrix()[i][j] == 2)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile2));
                        if(mtv.GetMatrix()[i][j] == 4)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile4));
                        if(mtv.GetMatrix()[i][j] == 8)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile8));
                        if(mtv.GetMatrix()[i][j] == 16)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile16));
                        if(mtv.GetMatrix()[i][j] == 32)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile32));
                        if(mtv.GetMatrix()[i][j] == 64)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile64));
                        if(mtv.GetMatrix()[i][j] == 128)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile128));
                        if(mtv.GetMatrix()[i][j] == 256)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile256));
                        if(mtv.GetMatrix()[i][j] == 512)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile512));
                        if(mtv.GetMatrix()[i][j] == 1024)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile1024));
                        if(mtv.GetMatrix()[i][j] == 2048)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile2048));
                    }
                }
                if(mtv.CheckWin())
                {
                    GameOver.putExtra("EXTRA_MESSAGE", "Win!");
                    startActivity(GameOver);
                }
                if(mtv.CheckLose())
                {
                    GameOver.putExtra("EXTRA_MESSAGE", "Lose!");
                    startActivity(GameOver);
                }
            }
        });
        BtnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtv.SlideDown();
                mtv.AfterMove();
                for(int i = 0; i < 4; i++)
                {
                    for(int j = 0; j < 4; j++)
                    {
                        if(mtv.GetMatrix()[i][j] == 0)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile_blank));
                        if(mtv.GetMatrix()[i][j] == 2)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile2));
                        if(mtv.GetMatrix()[i][j] == 4)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile4));
                        if(mtv.GetMatrix()[i][j] == 8)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile8));
                        if(mtv.GetMatrix()[i][j] == 16)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile16));
                        if(mtv.GetMatrix()[i][j] == 32)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile32));
                        if(mtv.GetMatrix()[i][j] == 64)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile64));
                        if(mtv.GetMatrix()[i][j] == 128)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile128));
                        if(mtv.GetMatrix()[i][j] == 256)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile256));
                        if(mtv.GetMatrix()[i][j] == 512)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile512));
                        if(mtv.GetMatrix()[i][j] == 1024)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile1024));
                        if(mtv.GetMatrix()[i][j] == 2048)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile2048));
                    }
                }
                if(mtv.CheckWin())
                {
                    GameOver.putExtra("EXTRA_MESSAGE", "Win!");
                    startActivity(GameOver);
                }
                if(mtv.CheckLose())
                {
                    GameOver.putExtra("EXTRA_MESSAGE", "Lose!");
                    startActivity(GameOver);
                }
            }
        });
        BtnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtv.SlideUp();
                mtv.AfterMove();
                for(int i = 0; i < 4; i++)
                {
                    for(int j = 0; j < 4; j++)
                    {
                        if(mtv.GetMatrix()[i][j] == 0)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile_blank));
                        if(mtv.GetMatrix()[i][j] == 2)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile2));
                        if(mtv.GetMatrix()[i][j] == 4)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile4));
                        if(mtv.GetMatrix()[i][j] == 8)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile8));
                        if(mtv.GetMatrix()[i][j] == 16)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile16));
                        if(mtv.GetMatrix()[i][j] == 32)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile32));
                        if(mtv.GetMatrix()[i][j] == 64)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile64));
                        if(mtv.GetMatrix()[i][j] == 128)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile128));
                        if(mtv.GetMatrix()[i][j] == 256)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile256));
                        if(mtv.GetMatrix()[i][j] == 512)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile512));
                        if(mtv.GetMatrix()[i][j] == 1024)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile1024));
                        if(mtv.GetMatrix()[i][j] == 2048)
                            SqrArray[i*4+j].setImageDrawable(getResources().getDrawable(R.drawable.tile2048));
                    }
                }
                if(mtv.CheckWin())
                {
                    GameOver.putExtra("EXTRA_MESSAGE", "Win!");
                    startActivity(GameOver);
                }
                if(mtv.CheckLose())
                {
                    GameOver.putExtra("EXTRA_MESSAGE", "Lose!");
                    startActivity(GameOver);
                }
            }
        });
    }


}
