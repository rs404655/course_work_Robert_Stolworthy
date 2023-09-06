//Robert Stolworthy
//03/2022
//Lab3

import java.util.*;

public class lab3{

   // pre n is a positive integer
   // test if n is a prime number
   public static boolean prime(int n){
   
      // hold return value
      boolean tf;
      
      // count extra factors besides 1 and n
      int factorCount = 0;
      
      // if n is divided by a number other than itself or one increment factorCount
      for(int i = 2; i < n; i++){
      
         if (n % i == 0) factorCount++;
      
      } // close for
   
      // if factorCount is greater than 0 n is not prime
      if(factorCount > 0) tf = false;
      
      // else n is a prime number
      else tf = true;
      
      // if n is negative or 0 or 1 return false
      if(n <= 1) tf = false;
      
      // return statement
      return tf;
   
   } //  close prime
   
   public static void main(String [] args){
   
      // to hold the value fo the counterexample
      int counterexample = 0;
      
      // for loop to go through every odd until a counter example is found
      for(int j = 3; j < 10000; j++){
      
         // if number is odd
         if( j % 2 == 1 ){
          
            // if test is false counter example found
            if(test(j) == false){ 
             
              // set counter example
              counterexample = j;
            
              break;
            
            } // close if
            
            
         } // close if
         
      } // close for
      
      
      // print counter example
      System.out.printf("Counter Example: %d\n", counterexample);
      
      
   } // close main
   
   // pre int
   // test if the number difference between every square * 2 is ever prime
   public static boolean test(int n){
   
      // holds array of every square number
      int [] squareNums = new int[100];
      
      // hold the value of square * 2
      int num;
      
      // fill square array
      for(int i = 0; i < 100; i++){
      
         squareNums[i] = i * i;
      
      } // close for
      
      
      // see if the difference is prime if true return true
      for( int k = 0; k < 100; k++){
      
         num = n - (2 * squareNums[k]);
         
         if(prime(num) == true) return true;
      
      }
      
      // counter example found
      return false; 
   
   } // close test
   
} // close lab3