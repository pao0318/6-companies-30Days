// https://practice.geeksforgeeks.org/problems/bridge-edge-in-graph/1#
class Solution
{
    //Function to find if the given edge is a bridge in graph.
    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        boolean[]vis = new boolean[V];
        
        Queue<Integer> pq= new LinkedList<>();
        pq.offer(c);
        vis[c]=true;
        adj.get(c).remove(new Integer(d));
        adj.get(d).remove(new Integer(c));
        
        
        
        while(!pq.isEmpty()){
            int it=pq.poll();
            
            for(int x: adj.get(it)){
                if(!vis[x]){
                    pq.add(x);
                    vis[x]=true;
                }
            }
        }
        if(vis[d])
            return 0;
        return 1;    
    }
}
