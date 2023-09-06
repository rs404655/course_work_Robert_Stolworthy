// CS 172
// PA6Test.java
// PA 6
// Written by: Robert Stolworthy
// October 20th, 2020


public class PA6Test{
   public static void main (String[] args){
      
      PA6Methods.printOddNumbers( 100 );
      System.out.println();
      
      // Sets the test string for formatName method test
      String inputtedName = "Robert Stolworthy";
      
      // Tests and calls the formatName method
      inputtedName = PA6Methods.formatName(inputtedName);
      
      // Prints newly formatted name
      System.out.println(inputtedName);
      
      System.out.println();
      
      // Sets the test string for hasLower method test
      String strng = "Robert";
      boolean lowerC;
      
      // Tests and calls hasLower methods
      lowerC = PA6Methods.hasLower(strng);
      
      if (lowerC == true){
         System.out.println("True");
      } // Prints true if is a lowercase letter
      
      else{
         System.out.println("False");
      } // Prints false if there is no lowercase letter
      
      System.out.println();
      
      // Sets minimum value to 10
      int minTemp = 10;
      
      // Sets maximum value to 100
      int maxTemp = 100;
      
      // Sets the increment to 10
      int increment = 10;
      
      PA6Methods.temperatures(minTemp, maxTemp, increment);
      
   } // Close main method
} // Close class