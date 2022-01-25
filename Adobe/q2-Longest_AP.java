// https://practice.geeksforgeeks.org/problems/longest-arithmetic-progression1019/1/#
class Solution {
    int lengthOfLongestAP(int[] A, int n) {
        
        if(n==1)
            return 1;
        int[][]dp=new int[10001][10001];
        int res=0;
        
        
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                
                int d=A[j]-A[i];
                
                dp[j][d]=Math.max(dp[i][d]+1,2);
                
                res=Math.max(res,dp[j][d]);
            }
        }
        
        
        return res;
    }
}
