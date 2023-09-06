package assignment3;

import java.util.*;

public class assignment3{


   public static String question1(String input1, int input2){
   
      //Create a hashmap to be parsed using input1
      HashMap<Integer, ArrayList<Integer>> inputGraph = graph(input1);
      HashSet<Integer> visited = new HashSet<Integer>();csv
      
      //hold current parse
      int curr;
      
      // for output string
      String output = "";
      
      //Create a queue
      ArrayList<Integer> queue = new ArrayList<Integer>();
      
      queue.add(input2);
      visited.add(input2);
      
      //While the queue is not empty remove and add to output
      while(!queue.isEmpty()) {
      
         curr = queue.remove(0);
         
         output = output + curr + ",";
         
         //if the point is not null and not visited add to the queue
         if(inputGraph.get(curr) != null) {
         
            for(int i : inputGraph.get(curr)) {
               
               if(!visited.contains(i)) {
                  queue.add(i);
                  visited.add(i);
               }
            }
         }
      }
      
      
      //output formatting
      output = output.substring(0, output.length() - 1);      
      
      return output;
   
   }
   
   public static String question2(String input1, int input2){
   
      //List to represent the edges
      List<List<Node>> adj = new ArrayList<List<Node>>();
      
      // Calc amount of vertexs
      int vertexs = vertexfinder(input1);
       
      //Add the right amount of vertexs to List     
      for (int j = 0; j < vertexs; j++){
         List<Node> item = new ArrayList<Node>();
         adj.add(item);
      }
      
      //For output
      String output = "";
      
      //indexes
      int x, y;
      
      //For loop to add connections
      for(int i = 0; i < input1.length()-5; i++){
      
         if(input1.charAt(i) >= 48 && input1.charAt(i) < 58){
         
            if(input1.charAt(i + 3) >= 48 && input1.charAt(i + 3) < 58 && input1.charAt(i + 1) != ')' && input1.charAt(i + 5) >= 48 && input1.charAt(i + 5) < 58 ){
            
               x = input1.charAt(i + 3) - 48;
               y = input1.charAt(i + 5) - 48;
               
               if(input1.charAt(i + 6) != ')'){
               
                  y = (y*10) + (input1.charAt(i + 6) - 48);
               
               }
               
               adj.get(input1.charAt(i) - 48).add(new Node( x , y ));
               
            }
               
         }
         
      }
      
      //Create a GFG
      GFG dpq = new GFG(vertexs);
      
      //Use dijkstra
      output = dpq.dijkstra(adj, input2);
   
      
      output = output.substring(0, output.length() - 1);
      return output;
   
   }
   
   public static int question3(int[][] input1) {
      
      //matrix for visited
      boolean [][] vis = new boolean[input1.length][input1[0].length];
      
      //return val
      int res = 0;
      
      //Use BFS to determine if the island is part of a visited increment if not
      for(int i = 0; i < input1.length; i++){
      
         for(int j = 0; j < input1[0].length; j++){
            
            if(input1[i][j]==1 && !vis[i][j]){
               BFS(input1, vis, i, j);
               res++;
            }
         }
         
      }
      
      return res;
   
   }
   
   
   
   public static HashMap<Integer, ArrayList<Integer>> graph(String input){
   
      //Create a hashmap/graph to parse using a string input
      HashMap<Integer, ArrayList<Integer>> output = new HashMap<Integer, ArrayList<Integer>>();
      
      //represents
      int node, edge;
      
      //While the string has not been fully parsed see if the connections are there and add them to the graph
      while(input.length() != 0){
      
         node = Character.getNumericValue(input.charAt(0));
         edge = Character.getNumericValue(input.charAt(3));
         
         if(!output.containsKey(node)) {
          
            ArrayList<Integer> edges = new ArrayList<Integer>();
            edges.add(edge);
            output.put(node, edges);
         
         }
         
         else{
            
            ArrayList<Integer> edges = output.get(node);
            edges.add(edge);
            output.put(node, edges);
            
         }
         
         if(input.length() >= 5) input = input.substring(5);
         
         else input = "";
         
      }
      
      return output;
   
   }
   
   
   //finds the amount of vertexs in input strings
   public static int vertexfinder(String input){
   
      
      String copy = "";
      input = removechars(input);
      
      
      for(int i = 0; i < input.length() + 1; i++){
      
         copy = copy + input.charAt(i);
         
         input = removeknown(input, input.charAt(i) - 48);
      }
      
      
      
      
      return input.length() - 1;
   
   }
   
   // removes all arrows from input strings to make an easier parse
   public static String removechars(String input){
      
      // for loop to traverse the entire string
      for(int i = 0; i < input.length(); i++){
      
         // if the char is a - remove it and the > next to it
         if(input.charAt(i) == '-' || input.charAt(i) == '>' || input.charAt(i) == '(' || input.charAt(i) == ')' || input.charAt(i) == ',') 
            input = input.substring(0,i) + input.substring(i + 1, input.length());
      
      } // close for
      
      
      // return new string
      return input;
      
   } // close removearrows()
   
   
   // removes known or parsed numbers from the string
    public static String removeknown(String input, int index){
      
      // for loop to traverse the string
      for(int j = 0; j < input.length()-1; j++){
      
         // if the char is not a , and is the number remove it from the string
         if( input.charAt(j + 1) - 48 == index) 
            input = input.substring(0, j + 1) + input.substring(j + 2,input.length());
      
      } // close for
      
      //return new string
      return input;
      
   } // close removeknown()
   
   
   //determines if the island is inbounds
   public static boolean isSafe(int input[][], int i, int j, boolean vis[][]){
      
      return(i >= 0) && (i < input.length) && (j >= 0) && (j < input[0].length) && (input[i][j] == 1 && !vis[i][j]);
      
   }
   
   
   public static void BFS(int mat[][], boolean vis[][], int si, int sj){
      
      //used to find neighbors
      int row[] = { -1,-1, -1, 0, 0, 1, 1, 1};
      int col[] = { -1, 0, 1, -1, 1, -1, 0, 1};
      
      //enqueue first
      Queue<pair> q = new LinkedList<pair>();
      q.add(new pair(si,sj));
      vis[si][sj] = true;
      
      //dequeue
      while (!q.isEmpty()){
      
         int i = q.peek().first;
         int j = q.peek().second;
         q.remove();
         
         for (int k = 0; k < 8; k++){
            
            if(isSafe(mat, i + row[k], j + col[k], vis)){
               
               vis[i + row[k]][j + col[k]] = true;
               q.add(new pair(i + row[k], j + col[k]));
               
            }
            
         }
         
      }
      
   }
   
   
   
   

}

class GFG{
   
   //member variables
   private int dist[];
   private Set<Integer> settled;
   private PriorityQueue<Node> pq;
   private int V;
   List<List<Node>> adj;
   
   //constructor
   public GFG(int V){
   
      this.V = V;
      dist = new int[V];
      settled = new HashSet<Integer>();
      pq = new PriorityQueue<Node>(V, new Node());
   
   }
   
   public int[] getDist(){
      return dist;
   }
   
   
   public String dijkstra(List<List<Node>> adj, int src){
      
      this.adj = adj;
      
      String output = "";
     
      for(int i = 0; i < V; i++){
         dist[i] = Integer.MAX_VALUE;
      }
      
      //Add src to priority queue
      pq.add(new Node(src, 0));
      
      //distance is 0
      dist[src] = 0;
      
      //finds the distance to all nodes
      while (settled.size() != V){
      
         if(pq.isEmpty()){
            return "";
         }
         
         // remove min
         int u = pq.remove().node;
         
         //Adding finalized
         if (settled.contains(u))
            continue;
         
         
         settled.add(u);
         
         e_Neighbours(u);
      }
      
      for(int i = 0; i < dist.length; i++){
      
         output = output + src + "->" + i + ":" + dist[i] + ",";
         
      }
      
      return output;
   }
   
   private void e_Neighbours(int u){
   
      int edgeDistance = -1;
      int newDistance = -1;
      
      for(int i = 0; i < adj.get(u).size(); i++) {
      
         Node v = adj.get(u).get(i);
         
         if(!settled.contains(v.node)){
            
            edgeDistance = v.cost;
            newDistance = dist[u] + edgeDistance;
            
            if(newDistance < dist[v.node])
               dist[v.node] = newDistance;
            
            
            
            pq.add(new Node(v.node, dist[v.node]));
            
         }
         
      }
   }
}

class Node implements Comparator<Node>{

   public int node;
   public int cost;
   
   public Node(){}
   
   public Node(int node, int cost){
   
      this.node = node;
      this.cost = cost;
      
   }
   
   public int compare(Node node1, Node node2){
   
      if(node1.cost < node2.cost)
         return -1;
         
      if(node1.cost > node2.cost)
         return 1;
         
      return 0;
   
   }
}


class pair{
   
   int first, second;
   public pair(int first, int second){
      
      this.first = first;
      this.second = second;
      
   }
   
}