package assignment2;
import java.util.*;

//Robert Stolworthy
// CS372
//10/1/22

public class assignment2{
   
   public static String question1(String input1, int input2){
      
      // remove the arrows in the string
      input1 = removearrows(input1);
      
      //remove the already visited numbers from the string
      input1 = removeknown(input1, input2);

      //create the output and added the newest number
      String output = "" + input2;
      
      
      // for loop that iterate through each path by parsing the string
      for(int i = 0; i < input1.length() - 1; i++){
         
         // if the char is equal to the inputted number to parse
         if(input1.charAt(i) - 48 == input2){
            
            // if the char next to the curr is not equal to it and isn't a comma
            if((input1.charAt(i) != input1.charAt(i + 1)) && (input1.charAt(i + 1) != ',')){
            
               // remove the parsed inputs from the string
               input1= removeknown(input1, input2);
               
               // add to the output and iterate to the next edge
               output = output + "," +  question1(input1, input1.charAt(i + 1) - 48);
               
            } // close if
          
         } // close if
      
      } // close for
      
      // remove duplicate numbers
      output= removedps(output);
      
      //return the answere
      return output;
      
   } // close question1()
   
   
   
   
   
   
   public static String question2(String input1){
      
      // remove the arrows from the string
      String s = removearrows(input1);
      
      // default output is NO
      String output = "No";
     
       // integer array to copy the string 
       int [] array = new int[s.length()];
       
       //index to fill the array
       int index = 0;
       
       // for loop to fill the array with numbers only from the string
       for(int i = 0; i < s.length(); i++){
       
          //if it is not a comma put in array
          if(s.charAt(i) != ',') array[index++] = s.charAt(i) - 48;
       
       }// close for
       
       
       //for loop to parse the array to create a parse list to test if it is cyclic
       for (int j = 0; j < array.length; j++){
       
          // s becomes a list of every possible parse starting at the node
          s = everyParse(input1, array[j]);
          
          // test if j is ever repeated proving cyclicy
          for(int k = 1; k < s.length(); k++){
            
             // if j is found it is cyclic
             if( array[j] == s.charAt(k) - 48){
               
               output = "Yes";
             
             } // close if
          
          } // close for
          
       } // close for

      return output;
      
   } // close question2()
   
   
   
   
   public static int question3(int[][] input1){
      
      // a matching size boolean array to hold if the point has been visited
      boolean visited[][] = new boolean[input1.length][input1[0].length];
      
      // count for the amoutn of islands
      int count = 0;
      
      // for loop to traverse rows
      for(int i = 0; i < input1.length; ++i){
         
         // for loop to traverse columns
         for(int j = 0; j < input1[0].length; j++){
            
            // if the spot is a one and has not been marked visited
            if(input1[i][j] == 1 && !visited[i][j])
            {
               
               //determine if it's part of an island or new
               DFS(input1, i, j, visited);
               
               //increment count
               ++count;
               
            } // close if
         
         } // close for
         
      } // close for
           
      //return
      return count;
   
   } // close question3
   
   
   
   // removes all arrows from input strings to make an easier parse
   public static String removearrows(String input){
      
      // for loop to traverse the entire string
      for(int i = 0; i < input.length(); i++){
      
         // if the char is a - remove it and the > next to it
         if(input.charAt(i) == '-') input = input.substring(0,i) + input.substring(i + 2, input.length());
      
      } // close for
      
      
      // return new string
      return input;
      
   } // close removearrows()
   
   
    // removes known or parsed numbers from the string
    public static String removeknown(String input, int index){
      
      // for loop to traverse the string
      for(int j = 0; j < input.length()-1; j++){
      
         // if the char is not a , and is the number remove it from the string
         if( input.charAt(j) != ',' && input.charAt(j + 1) - 48 == index) 
            input = input.substring(0, j + 1) + input.substring(j + 2,input.length());
      
      } // close for
      
      //return new string
      return input;
      
   } // close removeknown()
   
   
   // removes duplicates from the string
   public static String removedps(String input){
      
      // for loop to traverse the string
      for(int i = 0; i < input.length(); i++){
         
         // for loop to traverse the string
         for(int j = i + 1; j < input.length(); j++){
            
            // if the char at the index's match remove j
            if(input.charAt(i) == input.charAt(j) && input.charAt(i) != ','){
               input = input.substring(0,j) + input.substring(j + 1, input.length());
            } // close if
            
         } // close for
         
      } // close for
      
      // for loop to traverse the string
      for(int l = 0; l < input.length() - 1; l++){
      
         // if dups are next to each other remove
         if(input.charAt(l) == input.charAt(l+1))
            input = input.substring(0,l) + input.substring(l+1,input.length());
      } // close for
      
      // if the last character is a , remove it
      if(input.charAt(input.length() - 1) == ',') input = input.substring(0, input.length() - 1);
      
      // return new string
      return input;
      
   } // close removedps()
   
   
   // creates a string of every parse and what node it parses
   public static String everyParse(String input1, int input2){
      
      // remove arrows from string
      input1 = removearrows(input1);
      
      // create out put starting with initial node
      String output = "" + input2;
      
      // for loop that traverses the string
      for(int i = 0; i < input1.length() - 1; i++){
         
         // if the char equals input2
         if(input1.charAt(i) - 48 == input2){
            
            // if the char is not equal to the one next to it and the char next is not a comma
            if((input1.charAt(i) != input1.charAt(i + 1)) && (input1.charAt(i + 1) != ',')){
            
               // output equals new parse
               output = output + "," +  question1(input1, input1.charAt(i + 1) - 48);
               
            } // close if
            
         } // close if
      
      } // close for
      
      
      // return list of all parses
      return output;
   }
   
  
   // a function to traverse the graph
   public static void DFS(int input[][], int row, int col, boolean visited[][]){
      
      // used to find neighbors of the point
      int currRow[] = new int [] {-1, -1, -1, 0, 0, 1, 1, 1};
      int currCol[] = new int[] {-1, 0, 1, -1, 1, -1, 0, 1};
      
      // mark the point as visited
      visited[row][col] = true;
      
      // for loop test all neighbors
      for(int k = 0; k < 8; ++k){
         
         // if safe test next
         if(isSafe(input, row + currRow[k], col + currCol[k], visited)){
            
            DFS(input, row + currRow[k], col + currCol[k], visited);
         
         } // close if
         
      } // close for
      
   } // close DFS
   
   
   // checks if the point can be used in the DFS
   public static boolean isSafe(int input[][], int row, int col, boolean visited[][]){
   
      // checks to see if neighbor is in range
      return (row >= 0) && (row < input.length) && (col >= 0) && (col < input[0].length) && (input[row][col] == 1 && !visited[row][col]);
   
   }

   
   
}