// BFS of graph

 // BFS of graph
public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
     
      boolean[] vis= new boolean[V];
      ArrayList<Integer> ans=new ArrayList<>();
      Queue<Integer> queue= new LinkedList<>();
      queue.add(0);
      vis[0]=true;
      
      while(!queue.isEmpty()){
          
          int removedele=queue.remove();
          ans.add(removedele);
          for(int i=0;i<adj.get(removedele).size();i++){
              
               int newele=adj.get(removedele).get(i);
               if(!vis[newele])
               {
                   vis[newele]=true;
                   queue.add(newele);
               }
          }
      }
      return ans;
    }
