// https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1/
class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        int[]dp=new int[n];
        if(n==1)
            return arr[0];
        if(n==2)
            return Math.max(arr[0],arr[1]);
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        
        
        for(int i=2;i<n;i++){
            dp[i]=Math.max(arr[i]+dp[i-2], dp[i-1]);
        }
        return dp[n-1];
    }
}
