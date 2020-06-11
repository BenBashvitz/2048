import android.widget.ImageView;

public class MatrixView {
    ImageView[][] Matrix = new ImageView[4][4];
    int[][] Cal_Matrix = new int[4][4];
    public MatrixView()
    {
        for (int i  = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                this.Matrix[i][j] = null;
                this.Cal_Matrix[i][j] = 0;
            }

        }
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
                this.Cal_Matrix[temp++][j] = 0;
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
}
