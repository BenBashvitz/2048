package com.example.a2048;

import android.widget.TextView;
import java.util.Random;
public class MatrixView extends GameActivity {
    int[][] Cal_Matrix = new int[4][4];
    public MatrixView()
    {
        for (int i  = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                this.Cal_Matrix[i][j] = 0;
            }
        }
    }
    public int[][] GetMatrix()
    {
        return this.Cal_Matrix;
    }
    public void SlideUp()
    {
        for (int i = 1; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if(this.Cal_Matrix[i][j] != 0)
                {
                    MoveUp(i, j);
                }
            }
        }
        AddUp();
        for (int i = 1; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if(this.Cal_Matrix[i][j] != 0)
                {
                    MoveUp(i, j);
                }
            }
        }
    }
    private void MoveUp(int i, int j)
    {
        int temp = i;
        for (int k = i-1; k >= 0; k--)
        {
            if(this.Cal_Matrix[k][j] == 0)
            {
                this.Cal_Matrix[k][j] = this.Cal_Matrix[temp][j];
                this.Cal_Matrix[temp--][j] = 0;
            }
        }
    }
    private void AddUp()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if(this.Cal_Matrix[i][j] != 0 && this.Cal_Matrix[i+1][j] == this.Cal_Matrix[i][j])
                {
                    this.Cal_Matrix[i][j] = 2*this.Cal_Matrix[i][j];
                    this.Cal_Matrix[i+1][j] = 0;
                }
            }
        }
    }
    public void SlideRight()
    {
        for (int j = 2; j >= 0; j--)
        {
            for (int i = 0; i < 4; i++)
            {
                if(this.Cal_Matrix[i][j] != 0)
                {
                    MoveRight(i, j);
                }
            }
        }
        AddRight();
        for (int j = 2; j >= 0; j--)
        {
            for (int i = 0; i < 4; i++)
            {
                if(this.Cal_Matrix[i][j] != 0)
                {
                    MoveRight(i, j);
                }
            }
        }
    }
    private void MoveRight(int i, int j)
    {
        int temp = j;
        for (int k = j+1; k < 4; k++)
        {
            if(this.Cal_Matrix[i][k] == 0)
            {
                this.Cal_Matrix[i][k] = this.Cal_Matrix[i][temp];
                this.Cal_Matrix[i][temp++] = 0;
            }
        }
    }
    private void AddRight()
    {
        for (int j = 3; j > 0; j--)
        {
            for (int i = 0; i < 4; i++)
            {
                if(this.Cal_Matrix[i][j] != 0 && this.Cal_Matrix[i][j-1] == this.Cal_Matrix[i][j])
                {
                    this.Cal_Matrix[i][j] = 2*this.Cal_Matrix[i][j];
                    this.Cal_Matrix[i][j-1] = 0;
                }
            }
        }
    }
    public void SlideLeft()
    {
        for (int j = 1; j < 4; j++)
        {
            for (int i = 0; i < 4; i++)
            {
                if(this.Cal_Matrix[i][j] != 0)
                {
                    MoveLeft(i, j);
                }
            }
        }
        AddLeft();
        for (int j = 1; j < 4; j++)
        {
            for (int i = 0; i < 4; i++)
            {
                if(this.Cal_Matrix[i][j] != 0)
                {
                    MoveLeft(i, j);
                }
            }
        }
    }
    private void MoveLeft(int i, int j)
    {
        int temp = j;
        for (int k = j-1; k >= 0; k--)
        {
            if(this.Cal_Matrix[i][k] == 0)
            {
                this.Cal_Matrix[i][k] = this.Cal_Matrix[i][temp];
                this.Cal_Matrix[i][temp--] = 0;
            }
        }
    }
    private void AddLeft()
    {
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if(this.Cal_Matrix[i][j] != 0 && this.Cal_Matrix[i][j+1] == this.Cal_Matrix[i][j])
                {
                    this.Cal_Matrix[i][j] = 2*this.Cal_Matrix[i][j];
                    this.Cal_Matrix[i][j+1] = 0;
                }
            }
        }
    }
    public void SlideDown()
    {
        for (int i = 2; i >= 0; i--)
        {
            for (int j = 0; j < 4; j++)
            {
                if(this.Cal_Matrix[i][j] != 0)
                {
                    MoveDown(i, j);
                }
            }
        }
        AddDown();
        for (int i = 2; i >= 0; i--)
        {
            for (int j = 0; j < 4; j++)
            {
                if(this.Cal_Matrix[i][j] != 0)
                {
                    MoveDown(i, j);
                }
            }
        }
    }
    private void MoveDown(int i, int j)
    {
        int temp = i;
        for (int k = i+1; k < 4; k++)
        {
            if(this.Cal_Matrix[k][j] == 0)
            {
                this.Cal_Matrix[k][j] = this.Cal_Matrix[temp][j];
                this.Cal_Matrix[temp++][j] = 0;
            }
        }
    }
    private void AddDown()
    {
        for (int i = 3; i > 0; i--)
        {
            for (int j = 0; j < 4; j++)
            {
                if(this.Cal_Matrix[i][j] != 0 && this.Cal_Matrix[i-1][j] == this.Cal_Matrix[i][j])
                {
                    this.Cal_Matrix[i][j] = 2*this.Cal_Matrix[i][j];
                    this.Cal_Matrix[i-1][j] = 0;
                }
            }
        }
    }
    public void GameStart()
    {
        Random rnd = new Random();
        int x1 = rnd.nextInt(4), y1 = rnd.nextInt(4);
        System.out.println(x1 + "," + y1);
        this.Cal_Matrix[x1][y1] = 2;
        int x2 = rnd.nextInt(4), y2 = rnd.nextInt(4);
        while(x2 == x1 && y2 == y1)
        {
            x2 = rnd.nextInt(4);
            y2 = rnd.nextInt(4);
        }
        this.Cal_Matrix[x2][y2] = 2;
    }

    public void AfterMove()
    {
        Random rnd = new Random();
        int x1 = rnd.nextInt(4), y1 = rnd.nextInt(4);
        while(this.Cal_Matrix[x1][y1] != 0)
        {
            x1 = rnd.nextInt(4);
            y1 = rnd.nextInt(4);
        }
        this.Cal_Matrix[x1][y1] = 2;
    }

    public boolean CheckLose()
    {
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(i == 0)
                {
                    if(this.Cal_Matrix[i][j] == this.Cal_Matrix[i+1][j])
                        return false;
                    if(j == 0)
                    {
                        if(this.Cal_Matrix[i][j] == this.Cal_Matrix[i][j+1])
                            return false;
                    }
                    else if(j == 3)
                    {
                        if(this.Cal_Matrix[i][j] == this.Cal_Matrix[i][j-1])
                            return false;
                    }
                    else
                    {
                        if(this.Cal_Matrix[i][j] == this.Cal_Matrix[i][j+1])
                            return false;
                        if(this.Cal_Matrix[i][j] == this.Cal_Matrix[i][j-1])
                            return false;
                    }
                }
                else if (j == 0)
                {
                    if(this.Cal_Matrix[i][j] == this.Cal_Matrix[i][j+1])
                        return false;
                    if(this.Cal_Matrix[i][j] == this.Cal_Matrix[i-1][j])
                        return false;
                    if(i != 3)
                    {
                        if(this.Cal_Matrix[i][j] == this.Cal_Matrix[i+1][j])
                            return false;
                    }
                }
                else if(i == 3)
                {
                    if(this.Cal_Matrix[i][j] == this.Cal_Matrix[i][j-1])
                        return false;
                    if(this.Cal_Matrix[i][j] == this.Cal_Matrix[i-1][j])
                        return false;
                    if( j != 3)
                    {
                        if(this.Cal_Matrix[i][j] == this.Cal_Matrix[i][j+1])
                            return false;
                    }
                }
                else if(j == 3)
                {
                    if(this.Cal_Matrix[i][j] == this.Cal_Matrix[i][j-1])
                        return false;
                    if(this.Cal_Matrix[i][j] == this.Cal_Matrix[i-1][j])
                        return false;
                    if(i != 3)
                    {
                        if (this.Cal_Matrix[i][j] == this.Cal_Matrix[i+1][j])
                            return false;
                    }
                }
                else
                {
                    if(this.Cal_Matrix[i][j] == this.Cal_Matrix[i][j+1])
                        return false;
                    if(this.Cal_Matrix[i][j] == this.Cal_Matrix[i][j-1])
                        return false;
                    if(this.Cal_Matrix[i][j] == this.Cal_Matrix[i-1][j])
                        return false;
                    if(this.Cal_Matrix[i][j] == this.Cal_Matrix[i+1][j])
                        return false;
                }
            }
        }
        return true;
    }
    public boolean CheckWin()
    {
        for(int i = 0; i < 4; i ++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(this.Cal_Matrix[i][j] == 2048)
                    return true;
            }
        }
        return false;
    }
}
