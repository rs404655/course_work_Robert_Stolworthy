// Robert Stolworthy
// September 9, 2020
// CS 172
//
// PA2Program2.java
//
// Purpose: Calculate the circumference of a circle.
//
//
 import java.util.Scanner;
 
 public class PA2Program2 {
    public static void main(String[] args){
    
       Scanner scan = new Scanner(System.in);
       
       // Input the radius
       double radius;
       double circumference;
       System.out.print("Enter radius: ");
       radius = scan.nextDouble();
       
       // Calculate the circumference
       circumference = 2 * Math.PI * radius;
       
       // Display Output
       System.out.println("The circle with the radius of " + radius);
       System.out.println("has a circumference of " + circumference);
       
    } // end main
 } // end class
       
       
     
    
 
 