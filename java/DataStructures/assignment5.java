package assignment5;

public class assignment5 {

   //finds the size needed for the arrays for the string inputs
   public static int findSize(String input){
   
      // index
      int size = 0;
      
      // counts the amount of objects using a semicolon
      for(int i = 0; i < input.length(); i++){
      
         if(input.charAt(i) == ':') size++;
      
      }
      
      return size;
   
   } // close findSize()
   
   //finds if the char is a number/integer
   public static boolean isNum(char c){
   
      if(c >= 48 && c < 58) return true;
      else return false;
   
   } // close isNum()
   
   //finds the maximum between two integers
   public static int max(int a, int b){
   
      return (a > b) ? a : b;
   
   } // close max()
   
   //finds the minimum of three integers
   public static int min(int x, int y, int z){
   
      //if x is less than y and z return x
      if(x <= y && x <= z) return x;
      
      //if y is less than x and z return y
      if(y <= x && y <= z) return y;
      
      //if z is less than x and y return z
      else return z;
   
   } // close min()
   
   
   public static int knapSack(int [] val, int [] wt, int cap, int n){
   
      //if the cap has been reached return 0
      // base case
      if(n == 0 || cap == 0) return 0;
      
      // if wt at n is more than cap than cannot be included
      if (wt[n - 1] > cap) return knapSack(val, wt, cap, n - 1);
      
      // return the max of the nth item and the not included
      else return max(val[n - 1] + knapSack(val, wt, cap - wt[n - 1], n - 1), knapSack(val, wt, cap, n - 1));
   
   } // close knapSack()
   
   
   public static int repeatableKnapSack(int [] val, int [] wt, int cap, int n){
      
      //if we are an index of 0
      //base case
      if(n == 0) return (cap / wt[0]) * val[0];
      
      //if not take
      int doNotTake = 0 + repeatableKnapSack(val, wt, cap, n - 1);
      
      //if take
      int take = Integer.MIN_VALUE;
      if(wt[n] <= cap) take = val[n] + repeatableKnapSack(val, wt, cap - wt[n], n);
      
      // return the max of take and not take
      return max(take, doNotTake);
   
   } // close repeatableKnapSack()
   
   
   public static int editDist(String input1, String input2, int length1, int length2){
      
      //if the first string is empty return the remaining length of the second string
      if(length1 == 0) return length2;
      
      //if the second string is empty return the remaining length of the first string     
      if(length2 == 0) return length1;
      
      // if the last characters are the same decrement length and iterate
      if(input1.charAt(length1 - 1) == input2.charAt(length2 - 1)) 
         return editDist(input1, input2, length1 - 1, length2 - 1);
      
      // if not the same return 1 + the remaining string editDist()
      return 1 + min(editDist(input1, input2, length1, length2 - 1), editDist(input1, input2, length1 - 1, length2), editDist(input1, input2, length1 - 1, length2 - 1));
      
   } // close editDist()
   
   
   public static int question1(String input1, int input2){
      
      //the size needed for integer arrays
      int size = findSize(input1);
      
      //index's to fill arrays
      int valIndex = 0, weightIndex = 0;
      
      //arrays to hold values and weights
      int [] values = new int[size];
      int [] weights = new int[size];
      
      //for loop to fill arrays with values and their weights
      for(int i = 0; i < input1.length(); i++){
      
         if(input1.charAt(i) == ':'){
         
            // if val is a three digit int
            if(i - 3 != -1 && isNum(input1.charAt(i - 3)) && isNum(input1.charAt(i - 2)) && isNum(input1.charAt(i - 1))){
               values[valIndex++] = (input1.charAt(i - 3) - 48) * 100 + (input1.charAt(i - 2) - 48) * 10 + (input1.charAt(i - 1) - 48);
            }
            
            // if val is a two digit int
            else if(isNum(input1.charAt(i - 2)) && isNum(input1.charAt(i - 1))){
               values[valIndex++] = (input1.charAt(i - 2) - 48) * 10 + (input1.charAt(i - 1) - 48);
            }
            
            // if val is a one digit int
            else if(isNum(input1.charAt(i - 2)) == false && isNum(input1.charAt(i - 1))){
               values[valIndex++] = (input1.charAt(i - 1) - 48);
            }
            
            // if weight is a two digit int
            if(i + 2 <= input1.length() - 1 && isNum(input1.charAt(i + 2)) && isNum(input1.charAt(i + 1))){
               weights[weightIndex++] = (input1.charAt(i + 2) - 48) + (input1.charAt(i + 1) - 48) * 10;
            }
            
            // if weight is a one digit int
            else if(isNum(input1.charAt(i + 1))){
               weights[weightIndex++] = (input1.charAt(i + 1) - 48);
            }
         
         }
      
      } //close for()
      
      // return the knapSack()
      return knapSack(values, weights, input2, values.length);  
   } // close question 1
   
   
   public static int question2(String input1, int input2){
      
      //the size needed for integer arrays
      int size = findSize(input1);
      
      //index's to fill arrays
      int valIndex = 0, weightIndex = 0;
      
      //arrays to hold values and weights
      int [] values = new int[size];
      int [] weights = new int[size];
      
      //for loop to fill arrays with values and their weights
      for(int i = 0; i < input1.length(); i++){
      
         if(input1.charAt(i) == ':'){
         
            // if val is a three digit int
            if(i - 3 != -1 && isNum(input1.charAt(i - 3)) && isNum(input1.charAt(i - 2)) && isNum(input1.charAt(i - 1))){
               values[valIndex++] = (input1.charAt(i - 3) - 48) * 100 + (input1.charAt(i - 2) - 48) * 10 + (input1.charAt(i - 1) - 48);
            }
            
            // if val is a two digit int
            else if(isNum(input1.charAt(i - 2)) && isNum(input1.charAt(i - 1))){
               values[valIndex++] = (input1.charAt(i - 2) - 48) * 10 + (input1.charAt(i - 1) - 48);
            }
            
            // if val is a one digit int
            else if(isNum(input1.charAt(i - 2)) == false && isNum(input1.charAt(i - 1))){
               values[valIndex++] = (input1.charAt(i - 1) - 48);
            }
            
            // if weight is a two digit int
            if(i + 2 <= input1.length() - 1 && isNum(input1.charAt(i + 2)) && isNum(input1.charAt(i + 1))){
               weights[weightIndex++] = (input1.charAt(i + 2) - 48) + (input1.charAt(i + 1) - 48) * 10;
            }
            
            // if weight is a one digit int
            else if(isNum(input1.charAt(i + 1))){
               weights[weightIndex++] = (input1.charAt(i + 1) - 48);
            }
         
         }
      
      }//close for()
   
      return repeatableKnapSack(values, weights, input2, values.length - 1);
   } // close question2()
   
   // passes the two strings and their lengths to editDist()   
   public static int question3(String input1, String input2){
      return editDist(input1, input2, input1.length(), input2.length());
   } // close question3
   
   
}