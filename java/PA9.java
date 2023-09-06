// CS 172
// PA9.java
// PA 9
// Written by: Robert Stolworthy
// December 2, 2020

import java.util.Scanner;
public class PA9{
   public static void main(String[] args){
      final int NUM_ELEMENT = 200;
      
      // Create array numbers with 50 integers
      int[] numbers = new int[50];
      int i; // Index
      
      // Fill numbers with 50 random integers between 1 and 100
      for (i = 0; i < numbers.length; ++i){
         numbers[i] = 1 + (int) (Math.random() * 100);
      } // Close for loop
      
      System.out.println("Test: ");
      
      // Test printIntArray
      SearchSort.printIntArray( numbers );
      
      System.out.println();
      
      // Test linearSearch
      System.out.println(SearchSort.linearSearch(numbers, 63));
      
      // Test linearSearch2
      System.out.println(SearchSort.linearSearch2(numbers, 63));
      
      // Test selectionSort
      SearchSort.selectionSort( numbers );
      
      // Test binarySearch
      System.out.println(SearchSort.binarySearch(numbers, 63));
      
      // Creates first array with 200 integer elements
      int[] array1 = new int[NUM_ELEMENT];
      int j; // Index
      
      // Fills array1 with 200 random integers between 1 and 1000
      for (j = 0; j < array1.length; ++j){
         array1[j] = 1 + (int) (Math.random() * 1000);
      } // Closes for loop
      
      System.out.println();
      
      System.out.println("Array1 Unsorted: ");
      
      // Prints array1 using printIntArray method
      SearchSort.printIntArray( array1 );
      
      System.out.println();
      System.out.println();
      
      // Uses linearSearch method on array1 to search for 30
      System.out.println("Is 30 in the array1: " + 
                         SearchSort.linearSearch(array1, 30));
      
      // Uses linearSearch method on array1 to search for 86
      System.out.println("Is 86 in the array1: " + 
                         SearchSort.linearSearch(array1, 86));
      
      // Uses linearSearch method on array1 to search for 87
      System.out.println("Is 87 in the array1: " + 
                         SearchSort.linearSearch(array1, 87));
      
      // Uses linearSearch2 method on array1 to search for 35 and it's
      // position in the array
      System.out.println("The first occurrence of 25 is at: " +
                         SearchSort.linearSearch2(array1, 25));
      
      // Uses linearSearch2 method on array1 to search for 80 and it's
      // position in the array
      System.out.println("The first occurrence of 80 is at: " +
                         SearchSort.linearSearch2(array1, 80));
      
      // Uses linearSearch2 method on array1 to search for 91 and it's
      // position in the array
      System.out.println("The first occurrence of 91 is at: " +
                         SearchSort.linearSearch2(array1, 91));   
      
      // Sorts array1 using selectionSort method
      SearchSort.selectionSort( array1 );
      
      System.out.println();
      
      System.out.println("Array1 Sorted: ");
      
      // Prints sorted array1 using printIntArray method
      SearchSort.printIntArray( array1 );
      
      System.out.println(); 
      System.out.println();
      
      // Uses binarySearch method on array1 to search for 11
      System.out.println("Is 11 in the array1: " + 
                         SearchSort.binarySearch(array1, 11));  
      
      // Uses binarySearch method on array1 to search for 28
      System.out.println("Is 28 in the array1: " + 
                         SearchSort.binarySearch(array1, 28));
      
      // Uses binarySearch method on array1 to search for 74
      System.out.println("Is 74 in the array1: " + 
                         SearchSort.binarySearch(array1, 74));
      
      // Uses binarySearch method on array1 to search for 99
      System.out.println("Is 99 in the array1: " + 
                         SearchSort.binarySearch(array1, 99));
      
      System.out.println();                   
      
      // Creates a new array with 200 integer elements
      int[] array2 = new int[NUM_ELEMENT];
      
      // Fills array2 with 200 random integers between 1 and 1000
      for (j = 0; j < array2.length; ++j){
         array2[j] = 1 + (int) (Math.random() * 1000);
      } // Closes for loop
      
      System.out.println("Array2 Unsorted: ");
      
      // Prints array2 using the printIntArray method
      SearchSort.printIntArray( array2 );
      
      System.out.println();
      
      // Sorts array2 using selectionSort method
      SearchSort.selectionSort( array2 );
      
      System.out.println();
      
      System.out.println("Array Sorted: ");
      
      // Prints sorted array2 using the printIntArray method
      SearchSort.printIntArray( array2 );
      
      System.out.println();
      System.out.println();
      
      // Creates array3 with 200 integer elements
      int[] array3 = new int[NUM_ELEMENT];
      
      // Fills array3 with 200 random integers between 1 and 1000
      for (j = 0; j < array3.length; ++j){
         array3[j] = 1 + (int) (Math.random() * 1000);
      } // Closes for loop
      
      System.out.println("Array3 Unsorted: ");
      
      // Prints array3 using printIntArray method
      SearchSort.printIntArray( array3 );
      
      System.out.println();
      
      // Sorts array3 using insertionSort method
      SearchSort.insertionSort( array3 );
      
      System.out.println();
      
      System.out.println("Array3 Sorted: ");
      
      // Prints sorted array3 using printIntArray method
      SearchSort.printIntArray( array3 );
      
      
                   
   } // Closes main
} // Closes class