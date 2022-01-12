// https://practice.geeksforgeeks.org/problems/column-name-from-a-given-column-number4244/1/#
class Solution
{
    String colName (long n)
    {
    
        String res="";
        
        while(n>0){
            char ch= (charOf(n%26));
            res=ch+res;
            n=(n-1)/26;
        }
        
        return res.toString();
    }
    
    public char charOf(long val){
        if(val==0)
            return('Z');
        else
            return((char)(64+val));
            
    }
}
