// https://practice.geeksforgeeks.org/problems/count-number-of-subtrees-having-given-sum/1/

/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/


class Tree
{
    int ans=0;
    //Function to count number of subtrees having sum equal to given sum.
    int countSubtreesWithSumX(Node root, int X)
    {
	    int x=helper(root,X);
	    return ans;
    }
    
    int helper(Node root, int X){
        if(root==null)
            return 0;
            
        int l= helper(root.left, X);
        int r=helper(root.right, X);
        
        int sum=root.data+l+r;
        if(sum==X)
            ans++;
        return sum;    
    }
}
