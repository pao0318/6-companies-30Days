// https://practice.geeksforgeeks.org/problems/is-sudoku-valid4820/1/#
class Solution{
    static int isValid(int mat[][]){
        
        boolean row[][]=new boolean[10][10];
        boolean col[][]=new boolean[10][10];
        boolean box[][]=new boolean[10][10];
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int ch=mat[i][j];
                if(mat[i][j]==0)
                    continue;
                int boxIndex=(i/3)*3+(j/3);
                
                if(row[i][ch] || col[j][ch] || box[boxIndex][ch])
                    return 0;
                
                row[i][ch]=true;
                col[j][ch]=true;
                box[boxIndex][ch]=true;
            }
        }
        return 1;
    
        
        
    }
}
