// https://practice.geeksforgeeks.org/problems/find-the-position-of-m-th-item1723/1/# 
class Solution {
    static int findPosition(int N , int M , int K) {
        if(N==1)
            return 1;
        int pos=K+M-1;
    
            if(pos%N==0)
                return N;
        
           
            
        return pos%N;
    }
};
