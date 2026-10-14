class Solution {
    public void setZeroes(int[][] matrix) {
        int nr=matrix.length;
        int nc=matrix[0].length;
        int [][]arr=new int[nr][nc];
        for(int i=0;i<nr;i++)
        {
            for(int j=0;j<nc;j++)
            {
                arr[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<nr;i++)
        {
            for(int j=0;j<nc;j++)
            {
                if(matrix[i][j]==0)
                {
                    int row=i;
                    int col=j;
                    int temp=0;
                    while(temp<nr)
                    {
                        arr[temp][col]=0;
                        temp++;
                    }
                    temp=0;
                    while(temp<nc)
                    {
                        arr[row][temp]=0;
                        temp++;
                    }
                }
            }
        }
        for(int i=0;i<nr;i++)
        {
            for(int j=0;j<nc;j++)
            {
                matrix[i][j]=arr[i][j];
            }
        }
    }
}