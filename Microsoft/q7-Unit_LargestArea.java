// https://practice.geeksforgeeks.org/problems/length-of-largest-region-of-1s-1587115620/1/# 
class Solution
{
    //Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid)
    {
        
        int area=0;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    area=search(grid,i,j);
                    max=Math.max(max,area);
                }
                
            }
        }
        return max;
    }
    
    
    public int search(int[][]grid,int row, int col){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length||grid[row][col]==0)
            return 0;
        
        grid[row][col]=0;
        int sum=0;
        
        sum+=search(grid,row+1,col);
        sum+=search(grid,row-1,col);
        sum+=search(grid,row+1,col+1);
        sum+=search(grid,row-1,col-1);
        sum+=search(grid,row,col+1);
        sum+=search(grid,row,col-1);
        sum+=search(grid,row-1,col+1);
        sum+=search(grid,row+1,col-1);
        
        return sum+1;
 
        
        
    }
}
