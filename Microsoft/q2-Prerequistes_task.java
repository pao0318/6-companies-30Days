// https://practice.geeksforgeeks.org/problems/prerequisite-tasks/1/#
class Solution {
    boolean res=false;
    public boolean isPossible(int N, int[][] prerequisites)
    {
        ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
        
        for(int i=0;i<N;i++)
            graph.add(new ArrayList<Integer>());
        
        
        for(int []a: prerequisites){
            int u=a[0];
            int v=a[1];
            graph.get(v).add(u);
        }
            
        isCycle(graph,N);  
        return (!res);
    }
    
  
    
    public void isCycle(ArrayList<ArrayList<Integer>> graph, int v){
        boolean[] vis = new boolean[v];
        boolean []rec=new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i])
                dfs(graph,vis,rec,i);
        }
        
    }
    
    
    public void dfs(ArrayList<ArrayList<Integer>> graph, boolean[]vis,
                    boolean[]rec, int pos){
                    
                    vis[pos]=true;
                    rec[pos]=true;
                    
                
                for(int x:graph.get(pos)){
                    if(!vis[x])
                        dfs(graph,vis,rec,x);
                    else{
                        if(rec[x])
                            res=true;
                    }    
                        
                    
                }
                rec[pos]=false;
    
}
