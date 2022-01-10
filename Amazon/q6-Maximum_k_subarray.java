// https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1
class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // creating the max heap ,to get max element always
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            Collections.reverseOrder());

        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        
        for(;i<k;i++){
            pq.add(arr[i]);
        }
        res.add(pq.peek());
        
        pq.remove(arr[0]);
        
        for(; i<n;i++){
            pq.add(arr[i]);
            res.add(pq.peek());
            pq.remove(arr[i-k+1]);
        }
        return res;
    }
}
