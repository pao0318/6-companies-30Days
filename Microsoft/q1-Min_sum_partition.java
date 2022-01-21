// https://practice.geeksforgeeks.org/problems/minimum-sum-partition3317/1/
class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    int res=Integer.MAX_VALUE;
	    int sum=0;
	    for(int x:arr)
	        sum+=x;
	        
	   boolean dp[][]= new boolean [n+1][sum+1];
	   
	   for(int i=0;i<n+1;i++){
	       for(int j=0;j<sum+1;j++){
	           if(i==0)
	               dp[i][j]=false;
	           if(j==0)
	                dp[i][j]=true;
	       }
	   }
	   
	   for(int i=1;i<n+1;i++){
	       for(int j=1;j<sum+1;j++){
	           if(arr[i-1]<=j)
	                dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
	           else
	                dp[i][j]=dp[i-1][j];
	       }
	   }
	   
	   //Defining arraylist
	   List<Integer> list= new ArrayList<>();
	   
	   int k=n;
	   for(int j=0;j<=sum/2;j++){
	       if(dp[k][j]==true)
	        list.add(j);
	   }
	   
	   // Finding the minimum
	   
	   for(int i=0;i<list.size();i++){
	       res=Math.min(res, (sum-2*list.get(i)));
	   }
	   return res;
	} 
}
