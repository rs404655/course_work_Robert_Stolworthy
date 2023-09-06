//lab5
//Robert Stolworthy
//04/2022


import java.util.*;

public class lab5{

   // main prompts numbers and prints array of first 100 integers
   public static void main(String [] args){
   
      // declare variables
      int a, b, c, M;
      
      // integer to hold first 100 values
      int [] array = new int[100];
      
      // Scanner for user input to obtain n
      Scanner input = new Scanner(System.in);
      
      // prompt
      System.out.print("Please enter values of a, b, c, and M in this order: ");
      
      // obtain a, b, c, M
      a = input.nextInt();
      b = input.nextInt();
      c = input.nextInt();
      M = input.nextInt();
      
      // header
      System.out.println("The first 100 elements of the sequence:");
      
      // set first interger to c
      array[0] = c;
      
      // fill the table using the linear congruential random number generator algorithm
      for(int i = 0; i < 99; i++){
      
         array[i + 1] = (a * array[i] + b) % M;
      
      }
      
      // print array in format of 10 by 10
      for(int j = 0; j < 100; j = j + 10){
      
         System.out.printf("%d   %d    %d    %d    %d    %d    %d    %d    %d    %d\n", array[j], array[j+1], array[j+2], array[j+3], array[j+4], array[j+5], array[j+6], array[j+7], array[j+8], array[j+9]);
      
      }
      
      // determine cycle length and print
      System.out.printf("\n Cycle length is %d\n", floyd(a, b, c, M)); 
   
   } // close main
   
   
   // Determines cycle length using Floyd's algorithm
   public static int floyd(int a, int b, int c, int M){
      
      // declare variables
      int x, y, z = 0, yn, xn, cyclestart = 0;
      
      // set x and y to first integer
      x = c;
      y = c;
      
      // while loop that uses Floyd's algorithm
      while( cyclestart != 2 ){
         
         // increment x once
         xn = x;
         x = (a * xn + b ) % M;
         
         // increment y twice
         yn = y;
         y = (a * yn + b ) % M;
         yn = y;
         y = (a * yn + b ) % M;
         
         // if the first equivalents have met count the amount of steps until second time
         if(cyclestart == 1) z++;
         
         // if the vars are equivalent increment cyclestart to start the cycle length count
         if(x == y) cyclestart++;
      
      }
      
      // return index
      return z;
      
   } // close floyd()
   
}