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
    
    
    int ans=0;
    HashMap<Node, Node> map=new HashMap<>();
    
    public void getParent(Node root,HashMap<Node, Node> map){
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
    // Code has started from here
    
    public  int minTime(Node root, int target) 
    {
        
        getParent(root,map);
        dfs(root, target);
        return ans;
    }
    
    public  void dfs(Node root, int target){
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
      class Pair{
        Node node;
        boolean vis;
        Pair(Node node){
            this.node=node;
            vis=false;
        }
    }
 
   
}
