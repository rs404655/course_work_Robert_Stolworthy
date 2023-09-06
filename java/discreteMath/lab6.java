//lab6
//Robert Stolworthy
//04/2022


import java.util.*;

public class lab6{

   //PRE: n is an integer >= 0
   //POST: returns summation
   public static int sum1(int n){
   
      // indexes
      int x = 0, j = 0;
      
      //base case
      if(n == 0) return 1;
      
      //inductive/recursive case
      else{
      
         //calculate 2^n or 2^i
         while(j < n){
            x = x + 2;
            j++;
         } //close while
         
         //return summation
         return x + sum1(n-1);
      
      } // close else
   
   } // close sum1()
   
   
   //PRE: n is an integer > 0
   //POST: return summation
   public static int sum2(int n){
   
      //index for current function
      int x;
      
      //base case
      if(n == 1) return 2;
      
      //inductive/recursive case
      else{
           
         x = n * ( n + 1 ); // i(i+1)
         
         return x + sum2(n-1); // return summation
      
      }//close else
   
   }// close sum2()
   
   public static void main(String [] args){
   
      // variable to hold user input
      int n;
      
      // Scanner for user input to obtain n
      Scanner input = new Scanner(System.in);
      
      // prompt
      System.out.printf("Please enter the value of n: ");
      
      // obtain n
      n = input.nextInt();
      
      //output
      System.out.printf("The value of the 1st summation is %d\n", sum1(n));
      System.out.printf("The value of the 2nd summation is %d\n", sum2(n)); 

   
   }

}
