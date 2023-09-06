// CS 172
// StringPractice.java
// PA 3
// Written by: Robert Stolworthy
// Sept. 16th, 2020
// Practive using String methods

import java.util.Scanner;

public class StringPractice{
   public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   String userSentence;
   String firstWordLength;
   
   
   // Asks for and recieves user input
   System.out.print("Enter a sentence: ");
   userSentence = scan.nextLine();
   
   // Prints the user's sentence length
   System.out.println("the length of the string is " + userSentence.length() + ".");
   
   //Print the first word of the string
   if(userSentence.contains(" ")){
     firstWordLength = userSentence.substring(0, userSentence.indexOf(" "));
     if (firstWordLength.contains(",")){
     firstWordLength = firstWordLength.replace(",","");
     }
    System.out.println("The first word in the String is '" + firstWordLength + "'."); 
   }
   
   // Print the String in all uppercase
   String upperCase = userSentence.toUpperCase();
   System.out.println("The String uppercased is '" + upperCase + "'.");
   
   // Print the String in all lowercase
   String lowerCase = userSentence.toLowerCase();
   System.out.println("The String lowercased is '" + lowerCase + "'.");
   
   // Replace all 'n' characters with 'm' characters
   if (userSentence.contains("n")){
      String brandNewSentence = userSentence.replace("n","m");
      System.out.println("The String with the character 'n' replaced with 'm' is '" + brandNewSentence + "'.");
   }
   
   // Find and print the location of the first 'a' in the String
   if (userSentence.contains("a")){
      int firstA = userSentence.indexOf('a') + 1;
      System.out.println("the first occurence of the letter a is at the " + firstA + "(th/rd/nd/st) spot.");
   }
   
   // Print the last character of the string
   int lastIndex = userSentence.length()-1;
   char lastCharacter = userSentence.charAt(lastIndex);
   System.out.println("The last character is '" + lastCharacter + "'.");
   
   // Print the first 8 characters or the entire String
   if (userSentence.length() > 8){
      String sentenceEight = userSentence.substring(0,7);
      System.out.println("The first eight characters are '" + sentenceEight + "'.");
   }
   else{
      System.out.println("The first eight characters are '" + userSentence +"'.");
   }
  }
 }