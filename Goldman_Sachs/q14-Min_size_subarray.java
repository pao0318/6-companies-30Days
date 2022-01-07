// https://leetcode.com/problems/minimum-size-subarray-sum/
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
   int sum=0;
        int subLen = Integer.MAX_VALUE;
        int left = 0;
        for(int i=0; i<nums.length ; i++)
        {
            sum+=nums[i];
            
            while(sum>=target)
            {
                subLen = Math.min(subLen , (i+1) -left);
                sum-=nums[left++];
            }
        }
        
        return subLen==Integer.MAX_VALUE ? 0 : subLen;
        
    }
}
