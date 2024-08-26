// Number of Provinces
static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
     
     int ans=0;
     boolean vis[]=new boolean[V];
     for(int i=0;i<V;i++)
     {
         if(vis[i]==false){
             ans++;
             helper(adj,vis,i);
         }
     }
     return ans;
 }
 static void helper(ArrayList<ArrayList<Integer>> adj,boolean[] vis,int ele)
 {
     Queue<Integer> queue= new LinkedList<>();
     queue.add(ele);
     while(!queue.isEmpty())
     {
         int removedele=queue.remove();
         vis[removedele]=true;
         for(int i=0;i<adj.get(removedele).size();i++)
         {
             int newele=adj.get(removedele).get(i);
             if(newele==1 && !vis[i]){
                 vis[i]=true;
                 queue.add(i);
             }
         }
     }
 }
