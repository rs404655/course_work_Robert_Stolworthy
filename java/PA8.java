// CS 172
// PA8.java
// Written by: Robert Stolworthy
// November 17, 2020

import java.util.Scanner;
public class PA8{

   public static void printLettersForward(char c) {
      String k = "";
      
      // base recursion for lowercase
      if (c == 'a'){
         System.out.print(c);
      }
      
      // if the char is any lowercase letter
      else if ((c == 'b') || (c == 'c') || (c == 'd') || (c == 'e') ||
               (c == 'f') || (c == 'g') || (c == 'h') || (c == 'i') ||
               (c == 'j') || (c == 'k') || (c == 'l') || (c == 'm') ||
               (c == 'n') || (c == 'o') || (c == 'p') || (c == 'q') ||
               (c == 'r') || (c == 's') || (c == 't') || (c == 'u') ||
               (c == 'v') || (c == 'w') || (c == 'x') || (c == 'y') ||
               (c == 'z')){
         
         // creates a string that recursively counts backwards
         k = c + k;
         
         // recursion call to letter before current char in alphabet
         printLettersForward((char) (c - 1));
      }
      
      // base recursion for uppercase
      if (c == 'A'){
         System.out.print(c);
      }
      
      // if the char is any uppercase letter
      else if ((c == 'B') || (c == 'C') || (c == 'D') || (c == 'E') ||
               (c == 'F') || (c == 'G') || (c == 'H') || (c == 'I') ||
               (c == 'J') || (c == 'K') || (c == 'L') || (c == 'M') ||
               (c == 'N') || (c == 'O') || (c == 'P') || (c == 'Q') ||
               (c == 'R') || (c == 'S') || (c == 'T') || (c == 'U') ||
               (c == 'V') || (c == 'W') || (c == 'X') || (c == 'Y') ||
               (c == 'Z')){
         
         // creates a string that recursively counts backwards 
         k = c + k;
         
         // recursion call to letter before current char in alphabet
         printLettersForward((char) (c - 1));
      }
      
      System.out.print(k);  
      
   } // closes printLettersForward
   
   public static double powerOfTen(int a){
      
      // base recursion
      if (a == 0){
         return 1.0;
      }
      
      // recursion for positive powers
      if (a > 0){
          return 10.0 * powerOfTen(a - 1);
      }
      
      // recursion for negative powers
      if (a < 0){
          return 1.0 / 10 * ( powerOfTen(a + 1) );
      }
      
      return 1.0 / 10.0 * (powerOfTen(a + 1));
   } // closes powerOfTen
   
   public static void stringByWords(String s){
      String temp = "";
     
      // if there is a space uses it to determine the first word in the
      // string
      if (s.indexOf(' ') > -1){
         // creates a string that uses the first space to determine the first
         // words length and remove it only leaving the rest of the string
         temp = s.substring(s.indexOf(' ', 1) + 1, (s.length()));
         // prints the word
         System.out.println(s.substring(0, s.indexOf(' ', 1)));
         // recursion call
         stringByWords(temp);
      }
      
      // base case (prints last word or only word)
      else{
         System.out.print(s);
      }
   } // closes stringByWords
   
   public static void main(String[] args){
      // Create new scanner
      Scanner scnr = new Scanner(System.in);
      
      // test printLettersForward with f
      printLettersForward('f');
      System.out.println();
      
      // test printLettersForward with D
      printLettersForward('D');
      System.out.println();
      
      // test powerOfTen with 3 and -3
      System.out.print("10 to the power of 3: ");
      System.out.println(powerOfTen(3));
      System.out.print("10 to the power of -3: ");
      System.out.printf("%6.3f", powerOfTen(-3));
      System.out.println();
      
      // Prompts user-input
      System.out.println("Enter a string: ");
     
      // test stringByWords
      String userString = scnr.nextLine();
      stringByWords(userString);
      System.out.println();
      
      // Prompts user-input
      System.out.println("Enter a string: ");
      
      // test stringByWords
      String userStr = scnr.nextLine();
      stringByWords(userStr);
      System.out.println();
 
   } // closes main

} // closes class