// https://practice.geeksforgeeks.org/problems/rotate-by-90-degree0356/1/#
class GFG
{
    static void rotate(int matrix[][]) 
    {
        
     int r=matrix.length;
     int c=matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i>j){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                }
            }
        }
        
        
        for(int i=0;i<r;i++){
            for(int j=0;j<r/2;j++){
                int t=matrix[j][i];
                matrix[j][i]=matrix[r-j-1][i];
                matrix[r-j-1][i]=t;
            }
        }
        
    }
}
