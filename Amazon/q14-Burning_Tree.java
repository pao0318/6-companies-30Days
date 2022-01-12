// https://practice.geeksforgeeks.org/problems/burning-tree/1/

class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
    static int ans=0;
    static HashMap<Node, Node> map=new HashMap<>();
    
    
    public static void getParent(Node root,HashMap<Node, Node> map){
            if(root==null)
                return;
            
            if(root.left!=null){
                if(!map.containsKey(root.left))
                    map.put(root.left, root);
            }
            if(root.right!=null){
                if(!map.containsKey(root.right))
                map.put(root.right, root);
            }
        getParent(root.left, map);
        getParent(root.right,map);
        return;
        
        
    }
    
    public static int minTime(Node root, int target) 
    {
        getParent(root,map);
        dfs(root, target);
        return ans;
    }
    
    public static void dfs(Node root, int target){
        Queue<Pair> pq=new LinkedList<>();
        if(root==null)
            return;
        if(root.data==target){
            pq.add(new Pair(root));
            return;
    }
        dfs(root.left,target);
        dfs(root.right,target);
        
        while(!pq.isEmpty()){
            Pair temp=pq.poll();
            Node tempnode=temp.node;
            if(tempnode.left!=null && temp.vis==false){
                temp.vis=true;
                pq.add(new Pair(tempnode.left));
            }
                
            if(tempnode.right!=null&& temp.vis==false){
                temp.vis=true;
                pq.add(new Pair(tempnode.right));
            }
                
            if(map.containsKey(tempnode)&& temp.vis==false){
                temp.vis=true;
                pq.add(new Pair(map.get(tempnode)));
            }
            ans++;
            
                
        }
        
    }
     static class Pair{
        Node node;
        boolean vis;
        Pair(Node node){
            this.node=node;
            vis=false;
        }
    }
    
    
   
}
