// CS 172
// Kennel.java
// PA7a
// Written by: Robert Stolworthy
// November 4th, 2020

public class Kennel {
   public static void main (String args[ ] ) {
      // instantiate and modify several Dog objects
      
      Dog dog1 = new Dog ("Spot", 3);
      Dog dog2 = new Dog ("Susie", 5);
      
      System.out.println(dog1);
      System.out.println(dog2);
      
      // test mutators
      dog1.setName ( "Hank" );
      dog2.setAge ( 1 );
      
      System.out.println (dog1);
      System.out.println (dog2);
      
      // test personYears method
      System.out.println( dog1.getName ( ) + "'s age in person years = " 
                         + dog1.personYears ( ) );
                         
      System.out.println(dog2.getName ( ) + " is " + dog2.getAge ( ) + 
                         " years old.");
   }
}