// CS 172
// PA5.java
// PA5a
// Written by: Robert Stolworthy
// October 6th, 2020

// Importing Scanner, IO,and Random
import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class PA5a{ // Adding class header
   public static void main (String[] args) throws IOException{ // Adding the main method header
   
      // Creates an fianl int that is used to set the number of elements to 
      // 25
      final int NUM_ELEMENTS = 25;
      // Creates the first array as array 1
      int[] array1 = new int[NUM_ELEMENTS];
      // Loop index
      int i;
      // New random number generator
      Random randGen = new Random(); 
   
      for (i = 0; i < array1.length; ++i){
         array1[i] = 1+ (int) (Math.random() * 100);
      }// A for loop that fills the elements of array1 with random numbers 
       // between 1 and 100 
   
      System.out.print("Contents or array1: ");
   
      for (i = 0; i < array1.length; ++i){
         System.out.print(array1[i] + " ");
      } // Prints the elements of array1 on one line
      
      // Print new line
      System.out.println();
      System.out.println();
      
      int j;
      
      System.out.println("Contents of array 1, 5 elements per line: ");
      
      for (i = 0; i < 5; ++i){
         System.out.print(array1[i] + " ");
      } // Print 1-5
      
      System.out.println();
      
      for (i = 5; i < 10; ++i){
         System.out.print(array1[i] + " ");
      } // Print 6-10
      
      System.out.println();
      
       for (i = 10; i < 15; ++i){
          System.out.print(array1[i] + " ");
      } // Print 11-15
      
      System.out.println();
      
       for (i = 15; i < 20; ++i){
          System.out.print(array1[i] + " ");
      } // Print 16-20
      
      System.out.println();
      
       for (i = 20; i < 25; ++i){
          System.out.print(array1[i] + " ");
      } // Print 21-25
      
      System.out.println();
      System.out.println();
      
      // Sets a final int for the number of elements for array2
      final int NUM_ELEMENTSTWO = 50;
      // Creates array2
      int[] array2 = new int[NUM_ELEMENTSTWO];
      int num;
      
      for (i = 0; i < array2.length; ++i){
         array2[i] = 1 + (int) (Math.random() * 1000);
      }// Creates 50 elements imbetween 1 and 1000 randomly
      
      System.out.println("Contents of array2, 10 elements per line: ");
      
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
      System.out.println();
      
      System.out.print("Even numbers in array1: ");
      
      for (i = 0; i < array1.length; ++i){
         if ((array1[i] % 2) == 0){
            System.out.print(array1[i] + " ");
         }
      } // A for loop that determines if a element from array1 is even and
        // prints the element
      
      System.out.println();
      System.out.println();
      
      // Sets the number of elements of array3 to 25
      int[] array3 = new int[NUM_ELEMENTS];
      
      for (i = 0; i < array3.length; ++i){
         array3[i] = array1[i];
      } // Copies array1's elements to array3's
      
      // Adds 1 to the 25th element in array3
      array3[24] = array3[24] + 1;
      
      // Sets an index for the max of array1
      int max1 = array1[0];
      
      for (i = 0; i < array1.length; ++i){
         if (array1[i] > max1){
            max1 = array1[i];
         }
      } // Finds and sets the max of array1
      
      System.out.println("Maximum value in array1 = " + max1);
      
      System.out.println();
      
      // Sets an index for the max of array2
      int max2 = array2[0];
      
      for (i = 0; i < array2.length; ++i){
         if (array2[i] > max2){
            max2 = array2[i];
         }
      } // Finds and sets the max of array2
      
      System.out.println("Maximum value in array2 = " + max2);
      
      System.out.println();
      
      // Creates array4 which is filled with String references
      String[] array4 = new String[10];
      
      // Creates variable for the wanted file's name
      String filename;
      
      // Creates scanner to get inputted file name
      Scanner scnr = new Scanner(System.in);
      
      System.out.println("Enter the file's name: ");
      filename = scnr.next();
      
      System.out.println();
      
      // Creates a scanner to scan determined file
      Scanner fileScan = new Scanner(new File(filename));
      
      i = 0;
      while ((fileScan.hasNext()) && (i < 10)){
         array4[i] = fileScan.nextLine(); 
         ++i;
      } // Fills array4 elements with a line from each document and nulls
        // any left over elements
     
      String firstElement = array4[0];
      int currentLength;
      int max4 = firstElement.length();
      String element;
      
      
      for (i = 0; i < array4.length; ++i){
      if (!(array4[i] == null)){
         element = array4[i];
         currentLength = element.length();
         
         if (currentLength > max4){
            max4 = currentLength;
            }
         }  
      }
      
      System.out.print("The length of the longest string in the file = " + max4);
        
   }   
}      
      