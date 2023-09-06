// CS 172
// Program4
// Programming Assignment 4
// Robert Stolworthy
// September 23, 2020

//
import java.util.Scanner;

public class Program4{
   public static void main(String[] args){
     
      // Problem 1 - a for loop that will print the odd numbers from 1 to 99
      //
      System.out.print("\nThis is the output from problem 1 - for loop\n");
      int i;
      
      for (i = 0; i < 100; i++){
   
	 if ((i % 2) == 0){
            continue;
        } // Determines if the number is even by determining if there is a remainder when
	  // Dividing by 2
	  // If there us not a remainder then it is even and goes through the if branch
	
         else{
	    System.out.print(i + " ");
         } // Since it did not go through the if branch it has a remainder when divided by
           // two and therefore is odd and therefor is printed

      } // Creates a loop to increment i and print when odd. Also sets the number limit at
        // 100
      
      System.out.println();

      // Problem 1 - a while loop that will print the odd numbers from 1 to 99
      //

      int currNumber = 0;
      int remainderN;

      System.out.println("\nThis is the output from problem 1 - while loop\n");

      while (currNumber < 100){
 
        // Determines if a number is odd or even by dividing currNumber by 2
        // And seeing if there is a remainder
        remainderN = currNumber % 2;
         
	if (remainderN == 0){
            currNumber = currNumber + 1;
         } // If there is no remainder then currNumber increments and does not print 
        
         else{
            System.out.print(currNumber + " ");
	    currNumber = currNumber + 1;
         } // If the loop goes to else there is a remainder determining it is a odd
	   // Number causing the programto print and increment
	
      } // Sets the number limit at 100 causing it to stop printing at 99

      System.out.println();

      //Problem 2 - a for loop that will input 10 integer values from the user keep track of 
      //the smallest value entered. After the loop is over, print the smallest value.
      //
      Scanner scnr = new Scanner(System.in);
      int j;
      int minSoFar = 0;
      int currValue;


      System.out.println("\nThis is the output from problem 2 - for loop\n");
      
      System.out.println("Enter 10 integers: ");

      for (j = 0; j < 10; j++){
	 currValue = scnr.nextInt();
         
	 if (j == 0){
            minSoFar = currValue;
	 } // This sets the first number as the first minimum, setting the baseline

         else if (currValue < minSoFar){
            minSoFar = currValue;
	 } // This checks whether the newly inputted integer is smaller than the previous
	   // minimum. If it is then it is set as the new minimum, if not it continues
         
	 else{
	    continue;
	 } // Since the number is not worthy of becoming the minimum the loop is sent to
	   // the beginning of the loop

      } // This creates the limit of integers the user can type to 10 and increments 
        // the integer j
     
      System.out.println("The minimum is: " + minSoFar);

      // Problem 2 - a while loop that will input 10 integer values from the user keep track
      // of the smallest value entered. After the loop is over, print the smallest value.

      int k = 0;
      int minThisFar;
      int currVal;

      System.out.println("\nThis is the output from problem 2 - while loop\n");
      
      System.out.println("Enter 10 integers: ");
      currVal = scnr.nextInt();
      minThisFar = currVal;

      while (k < 9){
         currVal = scnr.nextInt();

	 if (currVal < minThisFar){
            k = k + 1;
	    minThisFar = currVal;
	 } // Determines if the new integer is less than the current minimum

	 else {
            k = k + 1; 
	    continue;
	 }// Since the current integer is more than the current minimum (determined through
	  // the if branch) k is updated and the loop continues
      
      }// Closes the loop, only allowing 9 inputted integers (The first was inputted before
       // the loop)

      System.out.println("The minimum is: " + minThisFar);

      scnr.nextLine();

      // Problem 3 - A for loop that counts the amount of times a certain vowel appears
      // in a string
      
      String userSentence;
      int m;
      char currChar;
      int occurA = 0;
      int occurE = 0;
      int occurI = 0;
      int occurO = 0;
      int occurU = 0;

      System.out.println("\nThis is the output from problem 3 - for loop\n");
      
      System.out.println("Enter a string: ");
      
      // Gets the users string
      userSentence = scnr.next();

      System.out.println("This is how many times every vowel appeared: ");
      
      for (m = 0; m < userSentence.length(); ++m){
         currChar = userSentence.charAt(m);

	 if ((currChar == 'a') || (currChar == 'A')){
            occurA = occurA + 1;
	 } // Keeps track of the occurrence of a or A in the string

	 else if ((currChar == 'e') || (currChar == 'E')){
            occurE = occurE + 1;
	 } // Keeps track of the occurrence of e or E in the string

	 else if ((currChar == 'i') || (currChar == 'I')){
	    occurI = occurI + 1;
	 } // Keeps track of the occurrence of i or I in the string

	 else if ((currChar == 'o') || (currChar == 'O')){
	    occurO = occurO + 1;
	 } // Keeps track of the occurrence of o or O in the string

	 else if ((currChar == 'u') || (currChar == 'U')){
            occurU = occurU + 1;
	 } // Keeps track of the occurrence of u or U in the string

	 else{
	    continue;
	 }// Character does not contain a vowel therefore the loop continues on

      }// Closes loop after all vowels have been counted

      System.out.println("Occurrences of a and A: " + occurA);

      System.out.println("Occurrences of e and E: " + occurE);

      System.out.println("Occurrences of i and I: " + occurI);

      System.out.println("Occurrences of o and O: " + occurO);

      System.out.println("Occurrences of u and U: " + occurU);

      // Problem 3 - a while loop that will count the occurrences of each vowel, no matter
      // what type of case the letter has, and out print each occurrence of each vowel
      //
      System.out.println("\nThis is the output from problem 3 - while loop\n");
      
      String userString;
      int n = 0;
      int occurrenceA = 0;
      int occurrenceE = 0;
      int occurrenceI = 0;
      int occurrenceO = 0;
      int occurrenceU = 0;
      char charCurr;

      System.out.println("Enter a string: ");

      // Gets the users inputted string
      userString = scnr.next();

      while (n < userString.length()){
         charCurr = userString.charAt(n);
	 n = n +  1;

	 if ((charCurr == 'a') || (charCurr == 'A')){
            occurrenceA = occurrenceA + 1;
	 } // Keeps track of the occurrences of a and A

	 else if ((charCurr == 'e') || (charCurr == 'E')){
	    occurrenceE = occurrenceE + 1;
	 } // Keeps track of the occurrences of e and E

	 else if ((charCurr == 'i') || (charCurr == 'I')){
            occurrenceI = occurrenceI + 1;
	 } // Keeps track of the occurrences of i and I

	 else if ((charCurr == 'o') || (charCurr == 'O')){
            occurrenceO = occurrenceO + 1;
         } // Keeps track of the occurrences of o and O 

	 else if ((charCurr == 'u') || (charCurr == 'U')){
	    occurrenceU = occurrenceU + 1;
	 } // Keeps track of the occurrences of u and U

	 else{
            continue;
	 } // This character is not a vowel so integer n increments and the loop continues
	
      } // There are no more occurrences of vowels so the while loop ends

      System.out.println("This is how many times every vowel appeared: ");

      System.out.println("Occurrences of a and A: " + occurrenceA);

      System.out.println("Occurrences of e and E: " + occurrenceE);

      System.out.println("Occurrences of i and I: " + occurrenceI);

      System.out.println("Occurrences of o and O: " + occurrenceO);

      System.out.println("Occurrences of u and U: " + occurrenceU);

      System.out.println();

   } // Closes main
} // Closes class
