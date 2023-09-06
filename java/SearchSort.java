// CS 172
// SearchSort.java
// PA 9
// Written by: Robert Stolworthy
// December 1, 2020

public class SearchSort{
   public static void printIntArray (int [] array){
      int i; // Index
      
      // Prints the array in rows of 10
      for (i = 0; i < array.length; ++i){
         if (i < 10){
            System.out.printf("%5d", array[i]);
         }
      
         if (i == 10){
            System.out.println();
         }  
      
         if ((i > 9) && (i < 20)){
            System.out.printf("%5d", array[i]);
         }
      
         if (i == 20){
            System.out.println();
         }
      
         if ((i > 19) && (i < 30)){
            System.out.printf("%5d", array[i]);
         }
      
         if (i == 30){
            System.out.println();
         }
      
         if ((i > 29) && (i < 40)){
            System.out.printf("%5d", array[i]);
         }
      
         if (i == 40){
            System.out.println();
         }
      
         if ((i > 39) && (i < 50)){
            System.out.printf("%5d", array[i]);
         }
         
         if (i == 50){
            System.out.println();
         }
         
         if ((i > 49) && (i < 60)){
            System.out.printf("%5d", array[i]);
         }
         
         if (i == 60){
            System.out.println();
         }
         
         if ((i > 59) && (i < 70)){
            System.out.printf("%5d", array[i]);
         }
         
         if (i == 70){
            System.out.println();
         }
         
         if ((i > 69) && (i < 80)){
            System.out.printf("%5d", array[i]);
         }
         
         if (i == 80){
            System.out.println();
         }
         
         if ((i > 79) && (i < 90)){
            System.out.printf("%5d", array[i]);
         }
         
         if (i == 90){
            System.out.println();
         }
         
         if ((i > 89) && (i < 100)){
            System.out.printf("%5d", array[i]);
         }
         
         if (i == 100){
            System.out.println();
         }
         
         if ((i > 99) && (i < 110)){
            System.out.printf("%5d", array[i]);
         }
         
         if (i == 110){
            System.out.println();
         }  
      
         if ((i > 109) && (i < 120)){
            System.out.printf("%5d", array[i]);
         }
      
         if (i == 120){
            System.out.println();
         }
      
         if ((i > 119) && (i < 130)){
            System.out.printf("%5d", array[i]);
         }
      
         if (i == 130){
            System.out.println();
         }
      
         if ((i > 129) && (i < 140)){
            System.out.printf("%5d", array[i]);
         }
      
         if (i == 140){
            System.out.println();
         }
      
         if ((i > 139) && (i < 150)){
            System.out.printf("%5d", array[i]);
         }
         
         if (i == 150){
            System.out.println();
         }
         
         if ((i > 149) && (i < 160)){
            System.out.printf("%5d", array[i]);
         }
         
         if (i == 160){
            System.out.println();
         }
         
         if ((i > 159) && (i < 170)){
            System.out.printf("%5d", array[i]);
         }
         
         if (i == 170){
            System.out.println();
         }
         
         if ((i > 169) && (i < 180)){
            System.out.printf("%5d", array[i]);
         }
         
         if (i == 180){
            System.out.println();
         }
         
         if ((i > 179) && (i < 190)){
            System.out.printf("%5d", array[i]);
         }
         
         if (i == 190){
            System.out.println();
         }
         
         if ((i > 189) && (i < 200)){
            System.out.printf("%5d", array[i]);
         }
         
      } // Closes for loop
   } // Closes printIntArray
   
   public static boolean linearSearch (int [ ] array , int key){
      int i; // Index
      
      // A for that searches the array by looking at each element for a match
      // and incrementing
      for (i = 0; i < array.length; ++i){
         
         // If element matches key returns true
         if (array[i] == key){
            return true;
         }
      
      }
      
      // If key is not found returned as false
      return false;
  
   } // Closes linearSearch
   
   public static int linearSearch2 (int [ ] array , int key){
      int i; // Index
      
      // A for that searches the array by looking at each element for a match
      // and incrementing 
      for (i = 0; i < array.length; ++i){
         
         // If element matches key returns the position of the element
         if (array[i] == key){
            return i + 1;
         }  
     
      }
      
      // If key is not found in array returns -1
      return -1;
      
   } // Closes linearSearch2
   
   public static boolean binarySearch (int [] array, int key){
      int mid; // Index for center of array
      int low = 0; // Index for the lowest element
      int high = array.length - 1; // Index for the highest element
      
      // A while loop that shrinks the array using a binary search method until
      // key is found
      while(high >= low){
         
         // Calculates the center of the array
         mid = (high + low) / 2;
         
         // If the middle is lower than the key the low becomes one above the mid 
         // halving the amount of elements
         if(array[mid] < key){
            low = mid + 1;
         }
         
         // If the middle is higher than the key the high becomes one below the mid 
         // halving the amount of elements
         else if(array[mid] > key){
            high = mid - 1;
         }
         
         // If the key equals the mid returns true
         else{
            return true;
         }
      } // Closes while
      
      // If key is not found returns false
      return false;
   }
   
   public static void insertionSort ( int[] list ) {
      
      // A for loop that uses an insertion sort method to sort the array in ascending
      // order
      for (int index = 1; index < list.length; index++) {
         int key = list[index];
         int position = index;
         
         // Shifts larger values to the right
         while (position > 0 && key < list[position - 1]) {
            list[position] = list [position - 1];
            position--;
         } // Closes while loop
         
         list[position] = key;
      } // Closes for loop index
   }
   
   public static void selectionSort(int [] list){
      int min;
      int temp;
      
      // For loop that sorts the array in ascending order
      for (int index = 0; index < list.length - 1; index++){
         
         // Finds the position of the minimum of the array in the unsorted part of the
         // array
         min = index;
         
         for (int scan = index + 1; scan < list.length; scan++){
            if(list[scan] < list[min]){
               min = scan;
            }
         } // Closes for loop scan
         
         // Swaps values
         temp = list[min];
         list[min] = list[index];
         list[index] = temp; 
      } // Closes for loop index
 
   } // Closes selectionSort

} // Closes class
    