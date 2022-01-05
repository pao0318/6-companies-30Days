// https://practice.geeksforgeeks.org/problems/number-following-a-pattern3126/1
class Solution{
    static String printMinNumberForPattern(String S){
        int dig=1;
        String res="";
    
        Stack<Integer> stack=new Stack<>();
        for(char ch: S.toCharArray()){
            if(ch=='D'){
                stack.push(dig);
                dig++;
            }
            else{
                stack.push(dig);
                dig++;
                while(stack.size()>0){
                    res+=String.valueOf(stack.pop());
                }
                
            }
        }
        stack.push(dig);
        
        while(!stack.isEmpty()){
            res+=String.valueOf(stack.pop());
            
        }
        return res;
        
    }
}
