package assignment4;
import java.io.*;
import java.lang.*;
import java.util.*;

public class assignment4{

   public static boolean isNum(char c){
   
      if(c >= 48 && c < 58) return true;
      else return false;
   
   }
   
   public static int find(subset subsets[], int i){
   
      if (subsets[i].parent != i)
            subsets[i].parent
                = find(subsets, subsets[i].parent);
 
        return subsets[i].parent;
    
   }
   
   public static void union(subset subsets[], int x, int y){
   
      int xroot = find(subsets, x);
        int yroot = find(subsets, y);
 
        // Attach smaller rank tree under root
        // of high rank tree (Union by Rank)
        if (subsets[xroot].rank < subsets[yroot].rank)
            subsets[xroot].parent = yroot;
        else if (subsets[xroot].rank > subsets[yroot].rank)
            subsets[yroot].parent = xroot;
 
        // If ranks are same, then make one as
        // root and increment its rank by one
        else {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
   
   }
   
   
   

   public static int question1(String input1, int input2){
      
      int size = 0;
      
      for(int i = 0; i < input1.length(); i++){
      
         if(input1.charAt(i) == ':') size++;
      
      }
      
      ItemValue [] items = new ItemValue[size];
      
      int index = 0, val = 0, wt = 0;
      
      for(int i = 0; i < input1.length(); i++){
      
         if(input1.charAt(i) == 58){
         
            
            if(i - 3 != -1 && isNum(input1.charAt(i - 3)) && isNum(input1.charAt(i - 2)) && isNum(input1.charAt(i - 1))){
               val = (input1.charAt(i - 3) - 48) * 100 + (input1.charAt(i - 2) - 48) * 10 + (input1.charAt(i - 1) - 48);
            }
            
            else if(isNum(input1.charAt(i - 2)) && isNum(input1.charAt(i - 1))){
               val = (input1.charAt(i - 2) - 48) * 10 + (input1.charAt(i - 1) - 48);
            }
            
            else if(isNum(input1.charAt(i - 2)) == false && isNum(input1.charAt(i - 1))){
               val = (input1.charAt(i - 1) - 48);
            }
            
            
            if(i + 2 <= input1.length() - 1 && isNum(input1.charAt(i + 2)) && isNum(input1.charAt(i + 1))){
               wt = (input1.charAt(i + 2) - 48) + (input1.charAt(i + 1) - 48) * 10;
            }
            
            else if(isNum(input1.charAt(i + 1))){
               wt = (input1.charAt(i + 1) - 48);
            }
            
            items[index++] = new ItemValue(val,wt);
                        
         }
      
      }
      
      Arrays.sort(items, new Comparator<ItemValue>() {
			@Override
			public int compare(ItemValue item1,
							ItemValue item2)
			{
				double cpr1 = Double.valueOf((double)item1.value / (double)item1.weight);
				double cpr2 = Double.valueOf((double)item2.value / (double)item2.weight);

				if (cpr1 < cpr2) return 1;
				else return -1;
			}
		});
      
        
      double totalValue = 0d;
      
      
		for (ItemValue i : items) {

			int curWt = (int)i.weight;
			int curVal = (int)i.value;

			if (input2 - curWt >= 0) {

				// this weight can be picked while
				input2 = input2 - curWt;
				totalValue += curVal;
			}
			else {

				// Item cant be picked whole
				double fraction
					= ((double)input2 / (double)curWt);
				totalValue += (curVal * fraction);
				input2
					= (int)(input2 - (curWt * fraction));
				break;
			}
		}  
      
      return (int)totalValue;
   }
   
   public static String question2(String input1){
      
      
      
      int numEdges = 0, numVertices = 0, index = 0;
      
      for(int i = 0; i < input1.length(); i = i + 7){
         
         numEdges++;
         
         if(isNum(input1.charAt(i + 5))) i++;
         
      }
      
      ArrayList<Character> tempChars = new ArrayList<Character>();
      
      index = 0;
      
      
      
      while(index < input1.length() - 1){
         
         
         
         if(!tempChars.contains(input1.charAt(index))) tempChars.add(input1.charAt(index));
         
         if(isNum(input1.charAt(index + 5))) index = index + 8;
         
         else index = index + 7;
         
      }
      
      
      numVertices = tempChars.size();
      
      Graph graph = new Graph(numVertices, numEdges);
      
      index = 0;
      int i = 0;
      int _src, _dest, _weight;
      
      while(index < input1.length() - 1){
         
         
         if(isNum(input1.charAt(index + 5))){
         
            _src = input1.charAt(index) - 48;
            _dest = input1.charAt(index + 2) - 48;
            _weight = (input1.charAt(index + 4) - 48) * 10 + input1.charAt(index + 5) - 48;
            
            graph.edge[i].src = _src;
            graph.edge[i].dest = _dest;
            graph.edge[i].weight = _weight;
            
            index = index + 8;
            
         }
         
         else{
            
            _src = input1.charAt(index) - 48;
            _dest = input1.charAt(index + 2) - 48;
            _weight = (input1.charAt(index + 4) - 48);
            
            graph.edge[i].src = _src;
            graph.edge[i].dest = _dest;
            graph.edge[i].weight = _weight;
            
            index = index + 7;
            
         }
         
         i++;
         
      }
      
      
      
      System.out.println(graph.V);
         
      return graph.kruskal();
   }
   
   public static int question3(int[] input1, int[] input2){
      int i;
      int s = 0;
      int n = input1.length;
 
      
      for (i = 0; i < n; i++)
         s += (input1[i] + input2[i]);
 
      
      if (n == 1)
         return input1[0] + input2[0];
 
      
      if (s % n != 0)
          return -1;
 
      
      int x = s / n;
   
      for (i = 0; i < n; i++){
 
        
        if (input1[i] > x)
            return -1;    
 
        
        if (i > 0){
            input1[i] += input2[i - 1];
            input2[i - 1] = 0;
        }
 
        
        if (input1[i] == x)
            continue;
 
        
        int y = input1[i] + input2[i];
        
        if (i + 1 < n) y += input2[i + 1];
        
        if (y == x)
        {
            input1[i] = y;
            input2[i]= 0;
            continue;
        }
 
        
        if (input1[i] + input2[i] == x)
        {
            input1[i] += input2[i];
            input2[i] = 0;
            continue;
        }
 
        
        if (i + 1 < n && input1[i] + input2[i + 1] == x)
        {
            input1[i] += input2[i + 1];
            input2[i + 1] = 0;
            continue;
        }
 
        
        return -1;
    }
 
    
    for (i = 0; i < n; i++)
        if (input2[i] != 0)
            return -1;
 
    
    return x;
      
      
     
   }

   
   
   static class ItemValue{

      int value, weight;
   
      public ItemValue(int _value, int _weight){
      
        this.weight = _weight;
      
        this.value = _value;
      
      }
      
   }
   
   static class Edge implements Comparable<Edge> {
      
      int src, dest, weight;
      
      public int compareTo(Edge compareEdge)
      {
         return this.weight - compareEdge.weight;
      }
      
   }
   
   static class subset{
      int parent, rank;
   }
   
   static class Graph{
      static int V, E;
      static Edge[] edge;
      
      public Graph(int v, int e){
      
         V = v + 1;
         E = e;
         edge = new Edge[e];
         
         for(int i = 0; i < e; ++i){
            edge[i] = new Edge();
         }
      }
      
      public static String kruskal(){
   
         Edge result[] = new Edge[V];
 
        
         int e = 0, i = 0;
         for (i = 0; i < V; ++i)
             result[i] = new Edge();
 
        
         Arrays.sort(edge);
         
        

         subset subsets[] = new subset[V];
         for (i = 0; i < V; ++i)
            subsets[i] = new subset();
 
        
         for (int v = 0; v < V; ++v) {
             subsets[v].parent = v;
             subsets[v].rank = 0;
         }
 
         i = 0; 

         while (e < V - 1) {
            
			Edge next_edge = edge[i++];

			int x = find(subsets, next_edge.src);
			int y = find(subsets, next_edge.dest);

			
			if (x != y) {
				result[e++] = next_edge;
				union(subsets, x, y);
			}
			
           
        }
      
      
         String answer = "";
         Edge temp = new Edge();
         
         for(i = 0; i < e; i++){
            
            if(result[i].src < result[i+1].src){
            
               temp = result[i];
               result[i] = result[i + 1];
               result[i + 1] = temp;
            
            }
            
         }
         
         
         for(i = e - 1; i >= 0; --i){
            answer = answer + "," + result[i].src + '-' + result[i].dest + '(' + result[i].weight + ')';
   
         }
         
         answer = answer.substring(1,answer.length());
      
         return answer;
      }
      
   }
   


}

/*
class ItemValue{

   public int value;
   public int weight;
   
   public ItemValue(int _value, int _weight){
      
      this.weight = _weight;
      
      this.value = _value;
      
   }
   
}
*/