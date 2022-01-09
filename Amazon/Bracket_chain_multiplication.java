// https://practice.geeksforgeeks.org/problems/brackets-in-matrix-chain-multiplication1024/1/
class Solution{
    
     static String st="";
     static char name;
    
    static void printParenthesis(int i, int j, int n, int[][] bracket){
        
    	if (i == j){
    		st += name;
    		name++;
    		return;
    	}
    	st += '(';
    	printParenthesis(i, bracket[i][j], n,bracket);
    	printParenthesis(bracket[i][j] + 1, j,n, bracket);
    	st += ')';
    }
    
    static String matrixChainOrder(int p[], int n){
        int m[][]=new int[n][n];
    	int bracket[][]=new int[n][n];
    	
    	
    	for (int i = 1; i < n; i++)
    	    m[i][i] = 0;
    	    
    	for (int d=1; d<n-1; d++){
    		for (int i = 1; i < n-d; i++){
    			int j = i+d;
    			m[i][j] = Integer.MAX_VALUE;
    			for (int k = i; k <= j-1; k++){
    				int q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
    				if (q < m[i][j]){
    					m[i][j] = q;
    					bracket[i][j] = k;
    				}
    			}
    		}
    	}
    	name = 'A';
    	st="";
    	 printParenthesis(1, n-1, n, bracket);
    	return st;
    }
}
