// https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1#
class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        int[]res = new int[n];
        Stack<Integer> stack= new Stack<>();
        stack.push(0);
        
        res[0]=1;
        
        for(int i=1;i<n;i++){
            
            while(!stack.isEmpty()&&price[i]>=price[stack.peek()]){
                stack.pop();
            }
            
            if(stack.isEmpty())
                res[i]=i+1;
                
            else
                res[i]=i-stack.peek();    
                
            stack.push(i);
        }
        return res;
        
    }
    
}
