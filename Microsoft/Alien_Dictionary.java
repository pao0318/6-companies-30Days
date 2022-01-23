// https://practice.geeksforgeeks.org/problems/alien-dictionary/1/#
class Solution
{
    public String findOrder(String [] dict, int N, int K)
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
       for(int i=0;i<K;i++)
           adj.add(new ArrayList<>());
           
       for(int i=0;i<N-1;i++){
           String s1=dict[i];
           String s2=dict[i+1];
           for(int j=0;j<Math.min(s1.length(),s2.length());j++)
           {
               if(s1.charAt(j)!=s2.charAt(j))
               {
                   adj.get(s1.charAt(j)-'a').add(s2.charAt(j)-'a');
                   break;
               }
           }
       }
        
        
    String res= topobaaz(adj,K);
    return res;
    }
    
    
    public String topobaaz( ArrayList<ArrayList<Integer>> adj, int N){
        Stack<Integer> stack= new Stack<>();
    
        boolean[]vis= new boolean[N];
        
        
        for(int i=0;i<N;i++){
            if(!vis[i])
                dfs(adj,i,stack,vis);
            
        }
        String str="";
        while(!stack.isEmpty()){
            char ch=(char)(stack.pop()+'a');
            str+=Character.toString(ch);
        }
        return str;
        
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj, int pos, Stack<Integer>stack, boolean[]vis){
        vis[pos]= true;
        
        for(int x: adj.get(pos)){
            if(!vis[x])
                dfs(adj,x,stack,vis);
        }
        
        stack.push(pos);
        
    }
}
