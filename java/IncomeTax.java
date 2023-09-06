// CS 172
// IncomeTax.java
// PA 3
// Written by: Robert Stolworthy
// September 17th, 2020
// To calculate income tax base on annual income

import java.util.Scanner;

public class IncomeTax {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      double annualSalary = 0;
      double taxRate = 0.0;
      double taxToPay = 0;
      
      // Determine annual salary via user input
      System.out.println("Enter annual salary: ");
      annualSalary = scnr.nextDouble();
      
      // Determine the tax rate from the annual salary
      if (annualSalary <= 0) {
         System.out.println("ERROR!!!");
      }
      else if (annualSalary <= 20000) {
         taxRate = 0.10;
      }
      else if (annualSalary <= 50000) {
         taxRate = 0.20;
      }
      else if (annualSalary <= 100000) {
         taxRate = 0.30;
      }
      else {
         taxRate = 0.40;
      }
      
      // Truncate tax to an integer amount
      taxToPay = annualSalary * taxRate;
      System.out.printf("Annual Salary: $%,8d\n", (int) annualSalary);
      System.out.printf("Tax rate:      %,8d%%\n", (int) (taxRate * 100));
      System.out.printf("Tax to pay:    $%,8d\n", (int) taxToPay);
   } // End of main
} // End of class 
      