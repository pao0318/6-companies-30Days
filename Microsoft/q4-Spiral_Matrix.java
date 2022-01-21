// https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1/#
class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> res=new ArrayList<>();
        
        int row_start=0;
        int row_end=r-1;
        int col_start=0;
        int col_end=c-1;
        
        while(row_start<=row_end && col_start<=col_end){
            for(int i=col_start;i<=col_end;i++){
                res.add(matrix[row_start][i]);
            }
            row_start++;
            
            for(int i=row_start;i<=row_end;i++){
                res.add(matrix[i][col_end]);
            }
            col_end--;
            
            if(row_start<=row_end){
            for(int i=col_end;i>=col_start;i--){
                res.add(matrix[row_end][i]);
            }
            row_end--;
            }
            
            if(col_start<=col_end){
            
            for(int i=row_end;i>=row_start;i--){
                res.add(matrix[i][col_start]);
            }
            col_start++;
            }
            
            
        }
        return res;
    }
}
