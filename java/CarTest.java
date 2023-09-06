// CS 172
// CarTest.java
// PA7a
// Written by: Robert Stolworthy
// November 4, 2020

public class CarTest{
   
   public static void main (String args[]){
      // instantiate and modify several Car objects
      
      Car car1 = new Car();
      Car car2 = new Car("Chevy", "Silverado", 2017);
      
      System.out.println(car1);
      System.out.println(car2);
      
      // test mutators
      car2.setMake("Honda");
      car2.setModel("Civic");
      car2.setYear(2003);
      
      System.out.println(car1);
      System.out.println(car2);
      
      // test accessors
      System.out.println("Car1's make is " + car1.getMake());
      System.out.println("Car1's model is " + car1.getModel());
      System.out.println("Car1's year is " + car1.getYear());
   }
}