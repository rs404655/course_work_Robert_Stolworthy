// CS 172
// Car.java
// PA7a
// Written by: Robert Stolworthy
// November 3, 2020

public class Car{
   private String make;
   private String model;
   private int year;
   
   // Author constructor
   public Car( String ma, String mo, int y){
      make = ma;
      model = mo;
      year = y;
   }
   
   // Default constructor
   public Car(){
      make = "Ford";
      model = "Escape";
      year = 2019;
   }
   
   // accessor for make
   public String getMake(){
      return make;
   }
   
   // accessor for model
   public String getModel(){
      return model;
   }
   
   // accessor for year
   public int getYear (){
      return year;
   }
   
   // mutator for make
   public void setMake(String ma){
      make = ma;
   }
   
   // mutator for model
   public void setModel(String mo){
      model = mo;
   }
   
   // mutator for year
   public void setYear(int y){
      year = y;
   }
   
   // the toString method makes printing easy
   public String toString(){
      return "Car: make = " + make + " model = " + model + " year = " + year;
   }
} // end class


   
   