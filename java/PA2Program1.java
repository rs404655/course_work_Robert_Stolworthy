// Robert Stolworthy
// September 9, 2020
// CS 172
//
// PA2Program.java
//
// Print the perimeter of a rectangle with given length and width
//
//
 import java.util.Scanner;
 
 public class PA2Program1 {
    public static void main(String[] args) {
       
       // input length and width values
       double length, width; 
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter the length: ");
       length = scan.nextDouble();
       System.out.print("Enter the width: ");
       width = scan.nextDouble();
       
       // calculate the perimeter
       double perimeter = (2 * length) + (2 * width);
       
       // display the results
       System.out.println("The length is " + length + ".");
       System.out.println("The width is " + width + ".");
       System.out.println("The perimeter is " + perimeter + ".");
      
     } //end main
 } // end class
      