import java.util.Scanner;

public class StringPractice2{
   public static void main(String [] args){
      String userString;
      
      Scanner scnr = new Scanner(System.in);
      
      userString = scnr.nextLine();
      
      System.out.println((userString.charAt(0)) + " " + (userString.charAt(userString.length()-1)));
      System.out.println(userString.toUpperCase());
      System.out.println(userString.length());
      System.out.println(userString.indexOf('a'));
      System.out.println(userString.substring(5));
      
   }
}