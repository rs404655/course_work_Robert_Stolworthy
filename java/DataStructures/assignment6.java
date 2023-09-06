package assignment6;

public class assignment6 {

   public static int lcs(char [] x, char [] y, int m, int n){
   
      // if lengths are equal base case
      if(m == 0 || n == 0) return 0;
      
      // if chars match add one to answer and go one cell diagnolly left
      if(x[m - 1] == y[n - 1]) return 1 + lcs(x, y, m - 1, n - 1);
      
      // else return the max of left and above
      else return max(lcs(x, y, m, n - 1), lcs(x, y, m - 1, n));
   
   } //close lcs()
   
   
   //return the max of two ints
   public static int max(int a, int b){
   
      return (a > b)? a : b;
   
   } //close max()
   
   //return the fibonacci
   public static int fib(int x){
   
      //if 1 or less return the input
      if (x <= 1) return x;
      
      //else return the prev plus the present
      return fib(x - 1) + fib(x - 2); 
      
   } // close fib()

   
   public static int question1(String input1, String input2){
      
      //char arrays of the input strings to use for a matrix   
      char [] string1 = input1.toCharArray();
      char [] string2 = input2.toCharArray();
      
      // use the lenght to parse through the matrix
      int length1 = string1.length, length2 = string2.length;
      
      return lcs(string1, string2, length1, length2);
   
   } // close question1()
   
   
   public static int question2(String input1){
      
      //hold the length to parse the matrix   
      int n = input1.length();
      
      //matrix of the string
      int L[][] = new int[n][n];
      
      //fill the matrix with the base case
      for(int i =0; i < n; i++){
      
         L[i][i]=1;
      
      } // close for()
      
      //parse and fill the matrix with dynamic programming
      for(int c1 = 2; c1 <= n; c1++){
      
         // parse through each cell
         for(int j = 0; j < n - c1 + 1; j++){
         
            int k = j + c1 - 1;
            
            // if equal and the size of 2 return 2   
            if(input1.charAt(j) == input1.charAt(k) && c1 == 2) L[j][k] = 2;
             
            // else return the cell that is representative of the inside plus 2
            else if (input1.charAt(j) == input1.charAt(k)) L[j][k] = L[j+1][k-1] + 2;
            
            // return the max of right and above
            else L[j][k] = Integer.max(L[j][k - 1], L[j+1][k]);
         
         } //close for(int j)
      
      } //close for(int c1)
      
      return input1.length() - L[0][n-1];
   
   }//close question2()
   
   
   public static int question3(int input1){
   
      //return the fib of the input plus 1
      return fib(input1 + 1);
         
   } //close question3()
   
   

}