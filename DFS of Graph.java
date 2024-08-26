//DFS of Graph

public void  helper( ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> adj,boolean vis[], int ele)
    {
        
          ans.add(ele);
          vis[ele]=true;
          for(int i=0;i<adj.get(ele).size();i++)
          {
               int newele=adj.get(ele).get(i);
               if(!vis[newele])
               {
                  helper(ans,adj,vis,newele);
                  
               }
          }
    }
            
     
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       
       ArrayList<Integer> ans= new ArrayList<>();
       boolean vis[]=new boolean[V];
       helper(ans,adj,vis,0);
       return ans;
      
    }
