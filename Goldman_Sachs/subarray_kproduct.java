// https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/#
class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int start=0;
        int count=0;
        long pro=1;
        for(int end=0;end<n;end++){
            pro=pro*a[end];
            while(start<end && pro>=k){
                pro=pro/a[start];
                start++;
            }
            if(pro<k)
                count+=end-start+1;
                
        }
        return count;
    }
}
