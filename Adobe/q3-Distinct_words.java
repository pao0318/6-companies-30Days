// https://practice.geeksforgeeks.org/problems/7b9d245852bd8caf8a27d6d3961429f0a2b245f1/1/#
class Solution{
    public int kvowelwords(int N,int K){
        int n=N;
        int k=K;
              double[][] dp = new double[n+1][k+1];
        double MOD = 1e9;
        MOD = MOD + 7;
        for(int i =0;i <= n;i++){
            
            for(int j = 0;j <= k;j++){
                if(i == 0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][k]*21%MOD;
                    
                    if(j > 0){
                        dp[i][j] = (dp[i][j] + dp[i-1][j-1]*5%MOD) % MOD;
                    }
                }
                
            }
        
        }
            return (int)dp[n][k];
    }
}