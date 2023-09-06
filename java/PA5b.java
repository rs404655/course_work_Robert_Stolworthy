// CS 172
// PA5b.java
// PAb
// Written by: Robert Stolworthy
// October 13th, 2020

import java.util.Scanner;

public class PA5b{
   public static void main(String[] args){
   
     // Create new scanner object
     Scanner scnr = new Scanner(System.in);
     
     // Create loop index
     int i;
     
     // Create second loop index
     int j;
     
     System.out.println("Problem 1");
     
     // Creates a array1 with twenty elements that contain the first 20
     // counting letters
     String[] array1 = new String[20];
     array1[0] = "one";
     array1[1] = "two";
     array1[2] = "three";
     array1[3] = "four";
     array1[4] = "five";
     array1[5] = "six";
     array1[6] = "seven";
     array1[7] = "eight";
     array1[8] = "nine";
     array1[9] = "ten";
     array1[10] = "eleven";
     array1[11] = "twelve";
     array1[12] = "thirteen";
     array1[13] = "fourteen";
     array1[14] = "fifteen";
     array1[15] = "sixteen";
     array1[16] = "seventeen";
     array1[17] = "eighteen";
     array1[18] = "nineteen";
     array1[19] = "twenty";
     
     // Gets the user's input
     String word1 = scnr.next();
     
     // Gets the user's character from the input
     char char1 = word1.charAt(0);
     
     
     while ((char1 == '1') || (char1 == '2') || (char1 == '3') ||
            (char1 == '4') || (char1 == '5') || (char1 == '6') ||
            (char1 == '7') || (char1 == '8') || (char1 == '8')){
        System.out.println("ERROR: CHAR WAS A #");
        System.out.println("Enter new char: ");
        word1 = scnr.next();
        char1 = word1.charAt(0);
     } // Loop designed to make sure the user's input is a letter and prints
       // error if not
     
     // Changes the charater to lowercase version
     word1 = word1.toLowerCase();
     char1 = word1.charAt(0);
     
     System.out.println();
     
     // Creates a tempString for the current array String so that it can 
     // Evaluate the character of each letter in the array String
     String word2;
    
     // Creates a index to determine later if there is a String the user
     // inputted charater
     int countChar = 0;
     
     System.out.println("Elements that include inputted char: ");
     
     for (i = 0; i < array1.length; ++i){
       
        word2 = array1[i];
        
        for (j = 0; j < word2.length(); ++j){
        
           if (word2.charAt(j) == char1){
              System.out.print(array1[i] + " ");
              countChar = 1;
              break;
           } // A if statement that determines if the current char of the
             // String matches the user inputted char and prints the current
             // String if true
           
        } // Evaluates each charater in the current array String and
          // determines whether the user char inputted mactches any of them
        
     } // Creates a loop to evaluate each String of the array 
     
     if (countChar != 1){
        System.out.println("No elements contain that letter.");
     } // An if statement that determines using the countChar index whether
       // the user inputted char does not exist in any of the array's 
       // Strings and prints a statement acknowledging the char does not
       // exist in the array if true
     
     System.out.println();
     System.out.println();     

     System.out.println("Problem 2");
     
     // Creates a new array of 100 elements
     final int NUM_ELEMENTS = 100;
     int[] array2 = new int[NUM_ELEMENTS];
     
     // Creates a integer to keep track of the sum of the elements
     int sum = 0;
     
     // Creates a float value that will equal and represent the average of
     // the elements
     float avg;
     
     // Creates an integer that represents the array's minimum
     int min;
     
     // Creates integer that represents the array's maximum
     int max;
     
     for (i = 0; i < array2.length; ++i){
        array2[i] =  1 + (int) (Math.random() * 1000);
     } // Fills the array's elements with random numbers between 1-1000
       // inclusive
     
     // Sets the base of the minimum
     min = array2[0];
     
     // Sets the base of the maximum
     max = array2[0];
     
     System.out.println();
     System.out.println("Elements of the problem 2: ");
     
     for (i = 0; i < 10; ++i){
         System.out.printf("%5d", array2[i]);
      } // Print 1-10
       
      System.out.println();
      
      for (i = 10; i < 20; ++i){
         System.out.printf("%5d", array2[i]);
      } // Print 11-20
       
      System.out.println();
      
      for (i = 20; i < 30; ++i){
         System.out.printf("%5d", array2[i]);
      } // Print 21-30
       
      System.out.println();
      
      for (i = 30; i < 40; ++i){
         System.out.printf("%5d", array2[i]);
      } // Print 31-40
       
      System.out.println();
      
      for (i = 40; i < 50; ++i){
         System.out.printf("%5d", array2[i]);
      } // Print 41-50
       
      System.out.println();
      
      for (i = 50; i < 60; ++i){
         System.out.printf("%5d", array2[i]);
      } // Print 51-60
       
      System.out.println();
      
      for (i = 60; i < 70; ++i){
         System.out.printf("%5d", array2[i]);
      } // Print 61-70
       
      System.out.println();
      
      for (i = 70; i < 80; ++i){
         System.out.printf("%5d", array2[i]);
      } // Print 71-80
       
      System.out.println();
      
      for (i = 80; i < 90; ++i){
         System.out.printf("%5d", array2[i]);
      } // Print 81-90
       
      System.out.println();
      
      for (i = 90; i < 100; ++i){
         System.out.printf("%5d", array2[i]);
      } // Print 91-100
       
      System.out.println();
      
      for (i = 0; i < array2.length; ++i){
         sum = sum + array2[i];
      } // Sums the array's elements
      
      System.out.println();
      
      // Determines the array's average
      avg = sum / array2.length;
      
      System.out.println("The average of the array is: " + avg);
      
      for (i = 0; i < array2.length; ++i){
         
         if (array2[i] < min){
            min = array2[i];
         } // Determines if the current element is smaller than the current
           // minimum and sets it to the minimum if true
         
      } // A for loop to determine the minimum of the array's elements
      
      System.out.println("The minimum of the array is: " + min);
      
      for (i = 0; i < array2.length; ++i){
          
          if (array2[i] > max){
             max = array2[i];
          } // Determines if the current element is bigger than the current
            // maximum and sets it to the max if true
          
       } // A for loop to determine the max of the array's elements
       
       System.out.println("The max of the array is: " + max);
       
         

   } // Closes the main method
   
} // Closes the class