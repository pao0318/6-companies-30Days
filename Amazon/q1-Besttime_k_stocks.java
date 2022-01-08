// https://practice.geeksforgeeks.org/problems/maximum-profit4657/1
class Solution {
    static int maxProfit(int K, int N, int A[]) {
        if(N==0)
            return 0;
        int[][]dp=new int[K+1][N];
        
        for(int i=0;i<=;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<N;j++){
                if(i==0 || j==0)
                    dp[i][j]=0;
                else{
                    max=Math.max(max,dp[i-1][j-1]-A[j-1]);
                    dp[i][j]=Math.max(dp[i][j-1],max+A[j]);
                }    
            }
        }
        return dp[K][N-1];
    }
}
