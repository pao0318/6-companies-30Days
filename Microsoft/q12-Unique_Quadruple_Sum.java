// https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1#
class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        int n=arr.length;

        
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        Arrays.sort(arr);
        
        HashMap<Integer,Integer> map= new HashMap<>();
        
        
        for(int i=0;i<n-3;i++){
            
            if(i!=0 && arr[i]==arr[i-1])
                continue;
            
            for(int j=i+1;j<n-2;j++){
                if(j!=i+1 && arr[j]==arr[j-1])
                continue;
                
                int low=j+1;
                int high=n-1;
                
                while(low<high){
                    
                    int curr_sum=arr[i]+arr[j]+arr[low]+arr[high];
                    
                    if(curr_sum<k)
                        low++;
                    
                    else if(curr_sum>k)
                        high--;
                    else{
                        ArrayList<Integer> list=new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[low]);
                        list.add(arr[high]);
                        res.add(list);
                        low++;
                        high--;
                    
                    while(low<high && arr[low]==arr[low-1])
                        low++;
                    while(low<high && arr[high]==arr[high+1])
                        high--;
                    }
                    
                    
                }
            }
        }  
        return res;
        
        
    }
}
