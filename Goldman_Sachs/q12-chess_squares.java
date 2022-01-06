// https://practice.geeksforgeeks.org/problems/squares-in-nn-chessboard1801/1#
class Solution {
    static Long squaresInChessBoard(Long N) {
        
        if(N==1)
            return N;
        Long sum=N*N;  
        N--;
        while(N>1){
            sum+=N*N;
            N--;
            
        }   
        return ++sum;
    }
};
