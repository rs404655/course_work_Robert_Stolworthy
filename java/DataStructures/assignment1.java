package assignment1;
import java.util.*;

public class assignment1{

      public static int question1(int[] input1){
   
      // Integers to hold the mid point, the range of the search, and the start of the search
      int half, length = input1.length - 1, index = 0;
      
      // Binary Search
      while(index < length){
         
         //find mid point
         half = (index + length) / 2;
         
         //if the midpoint is larger than the right neighbor set the start to the mid point
         if(input1[half] > input1[half + 1]) length = half;
         
         //else the neighbor is larger set the range to the neighbor
         else index = half + 1;
      
      }
      
      return index;
      
   } // close question1()
   
   
   public static int question2(int[] input1){
   
       // Integers to hold the mid point, the range of the search, and the start of the search
      int half, length = input1.length - 1, index = 0;
      
       // Binary Search for Missing number
      while(index <= length){
         
         //find mid point
         half = (length + index) / 2;
         
         //if the midpoint is equal to the index the missing number is in the right side
         if(input1[half] == half) index = half + 1;
         
         //else the missing number is in the left
         else length = half - 1;
      
      }
      
      return index;
      
   } // close question2()
   
   
   public static String question3(int[] input1){
      
      //String to hold output
      String output = "";
      
      //Start quicksort
      quicksort(input1, 0, input1.length - 1);
      
      //Create the start of the output
      output = output + input1[0];
      
      //Create the rest of the output
      for(int i = 1; i < input1.length; i++){
      
         output = output + "," + input1[i];
      
      }
      
      //return
      return output;
   } //close question3()
   
   
   public static int question4(int[] input1, int[] input2, int input3){
      
      // new array to hold union
      int[] newA = new int[input1.length + input2.length];
      
      // the length of the first and second array and three indexes
      int length1 = input1.length, length2 = input2.length, i = 0, j = 0, index = 0;
      
      // while statement that fills the new array in order
      while(i < length1 && j < length2){
       
         if(input1[i] < input2[j]) newA[index++] = input1[i++];
         else newA[index++] = input2[j++];
       
         
      }
      
      // fills the rest of the array
      while(i < length1) newA[index++] = input1[i++];
      
      //fills the rest of the array
      while(j < length2) newA[index++] = input2[j++];
      
      //returns the new array at kth
      return newA[input3 - 1];
   } //close question4()
   
   
   public static int Partition(int[] array1, int low, int high){
      
      //Index at random spot
      int index = (int) Math.random() * ((high + 1) - low + 1) + low;
      
      //create a temp value holder and two indexes
      int temp, i = low, j = high;
      
      //swap the index to front of array
      temp = array1[index];
      array1[index] = array1[low];
      array1[low] = temp;
      
      // while statement that swaps till they pass the wall
      while(i < j){
         
         //increments indexes
         while (array1[i] <= array1[low] && i < high) i++;
         while (array1[j] >= array1[low] && j > low) j--;
         
         //swap if i is lower than j
         if(i < j){
            temp = array1[i];
            array1[i] = array1[j];
            array1[j] = temp;
         }
         
      } // close while
      
      //swap the low value with the wall
      temp = array1[low];
      array1[low] = array1[j];
      array1[j] = temp;
      
      // return wall
      return j;      
   } // close Partition()
   
   
   public static void quicksort(int[] array1, int low, int high){
      
      // if low is lower than high
      if(low < high){
         
         // the pivot equals the Partition
         int pivot = Partition(array1, low, high);
         
         //quicksort the low part
         quicksort(array1, low, pivot);
         
         //quicksort the high part
         quicksort(array1, pivot + 1, high);
         
      }
   
   } // close quicksort() 
   
   
} // close