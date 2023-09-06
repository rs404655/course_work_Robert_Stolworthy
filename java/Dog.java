// CS 172
// Dog.java
// PA7a
// Written by: Robert Stolworthy
// November 3, 2020

public class Dog{
   private String name;
   private int age;
   
   // constructor
   public Dog ( String n, int a ) {
      name = n;
      age = a;
   }
   
   // accessor for name
   public String getName ( ) {
      return name;
   }
   
   // accessor for age
   public int getAge ( ) {
      return age;
   }
   
   // mutator for name
   public void setName ( String n ) {
      name = n;
   }
   
   // mutator for age;
   public void setAge ( int a ) {
      age = a;
   }
   
   // calculate the age in person years
   public int personYears( ) {
      return age * 7;
   }
   
   // the toString method makes printing easy
   public String toString ( ) {
      return "Dog: name = " + name + " age = " + age;
   }
   
} // end class
   
   