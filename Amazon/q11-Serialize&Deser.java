// https://practice.geeksforgeeks.org/problems/serialize-and-deserialize-a-binary-tree/1#
class Tree 
{
    //Function to serialize a tree and return a list containing nodes of tree.
	public void serialize(Node root, ArrayList<Integer> A) 
	{
	    if(root==null)
	        return;
	   serialize(root.left,A);
	   A.add(root.data);
	   serialize(root.right,A);
	}
	
	//Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A)
    {
        Node root= new Node(0);
        Node temp=root;
        for(int i=0;i<A.size();i++){
            temp.right=new Node(A.get(i));
            temp=temp.right;
        }
        return root.right;
    }
};
