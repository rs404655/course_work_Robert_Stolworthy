// CS 172
// PA6Methods.java
// Written by: Robert Stolworthy
// October 21st, 2020

import java.util.Scanner;

public class PA6Methods{
   public static void printOddNumbers( int max ) {
      
      // prints the odd numbers less than or equalto max
      
      int n = 1;
      int count = 0;
      while (n <= max) {
         System.out.printf("%5d", n); // prints the number in field of 5
         n = n + 2;
         count++;
         System.out.print( ( count % 10 == 0 ) ?  "\n" : "" );
      } // end while
   } // end printOddNumbers
   
   public static String formatName( String name ){
      String firstName;
      int firstNameLength;
      String lastName;
     
      // Determines first name
      firstName = name.substring(0, name.indexOf(" "));
      
      // Determines last name
      lastName = name.substring(name.indexOf(" ") + 1, name.length());
      
      // Reorders name into last name, first name order
      name = lastName + ", " + firstName;
      
      // Returns the changed name
      return name;
   }
   
   public static boolean hasLower( String text ){
      int i;
      int lower = 0;
      char chr;
      
      for (i = 0; i < text.length(); ++i){
         
         chr = text.charAt(i);
         
         if ((chr >= 'a') && (chr <= 'z')){
            lower++;
         } // Determinse if the current character is lowercase
         
      } // Scans each indiviadual letter
      
      if (lower == 0){
         return false;
      } // If there isn't a lowercase letter returns false
      
      else{
         return true;
      } // If there is a lowercase letter returns true
   }
   
   public static void temperatures( int minTemp, int maxTemp, int increment){
      // Sets the increment of the table
      final int TABLE_LENGTH = maxTemp / increment;
      
      // Creates an array to be filled with the fahrenheit values
      int[] fahrenheit = new int[TABLE_LENGTH];
      
      // Creates an array to be filled with the celsius values
      double[] celsius = new double[TABLE_LENGTH];
      
      // Creates an array to be filled with the kelvin values
      double[] kelvin = new double[TABLE_LENGTH];
      int i;
      fahrenheit[0] = minTemp;
      
      
      for (i = 1; i < fahrenheit.length; ++i){
         fahrenheit[i] = fahrenheit[i-1] + increment;
 
      } // Fills out the fahrenheit based on the min max temps and filled by
        // the incremental pace by the incremental value
      
      
      for (i = 0; i < celsius.length; ++i){
         celsius[i] = (((fahrenheit[i]) - 32.0) * 5.0 / 9.0);
      } // Calculates and fills the celsius elements by using the fahrenheit
        // values
      
      for (i = 0; i < kelvin.length; ++i){
         kelvin[i] = celsius[i] + 273.15;
      } // Calculatees and fills the kelvin elements by using the celsius
        // values
      
      // Prints the table
      System.out.println("Fahreneheit      " + "Celsius      " + "Kelvin");
      System.out.println("-----------      " + "-------      " + "------");
      
      for (i = 0; i < fahrenheit.length; ++i){
         System.out.printf("%10d       %7.2f      %6.2f      %n", fahrenheit[i], 
                           celsius[i], kelvin[i]);
      } // Prints the table  
   } // Closes temperatures() method
      
   
} // end class