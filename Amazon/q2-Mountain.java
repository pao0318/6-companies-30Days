// https://leetcode.com/problems/longest-mountain-in-array/submissions/
class Solution {
    public int longestMountain(int[] arr) {
        int n=arr.length;
        if(n<3)
            return 0;
        int res=0;
        boolean inc=false;
        boolean dec=false;
        int i=0;
        int j=0;
        
//        First check increasing and then decreasing
        while(i<n-2){
//             Remove decreasing if any
            while((i>=0 && i<n-1)&&arr[i]>arr[i+1])
                i++;
            
            while(i<n-1 &&arr[i]==arr[i+1])
                i++;
            
            inc =false;
            dec=false;
            
            j=i;
            while(j<n-1 && arr[j]<arr[j+1]){
                inc=true;
                j++;
            }
                
            while(j<n-1 && arr[j]>arr[j+1]){
                dec=true;
                j++;
            }
            if(inc && dec)
                res=Math.max(res,(j-i+1));
            i=j;

        }

        if(res>=3)
            return res;
        return 0;
    }
}
