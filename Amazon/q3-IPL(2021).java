// https://practice.geeksforgeeks.org/problems/deee0e8cf9910e7219f663c18d6d640ea0b87f87/1/# 
class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
            Deque<Integer> dq=new ArrayDeque<>();
        ArrayList<Integer> res=new ArrayList<>();
        
        for(int i=0;i<n;i++){
          while(!dq.isEmpty() && arr[dq.getLast()]<=arr[i]){
              dq.removeLast();
          }
          dq.addLast(i);
          
          if(dq.getFirst()==i-k)
            dq.removeFirst();
            
            if(i>=k-1)
                res.add(arr[dq.getFirst()]);
            
        }
        return res;
    }
}
