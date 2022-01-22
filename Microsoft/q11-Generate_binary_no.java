//https://practice.geeksforgeeks.org/problems/generate-binary-numbers-1587115620/1/# 
class solve{
    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
        
        ArrayList<String> res= new ArrayList<>();
        
        for(int i=1;i<=N;i++){
            String s=combine(i);
            res.add(s);
        }
        
        return res;
    }
    
    public static String combine(int X){
        
        StringBuffer str= new StringBuffer();
        
        
        while(X>0){
            str.append(X%2);
            X=X/2;
        }
        str.reverse();
        return str.toString();
    }
    
}
