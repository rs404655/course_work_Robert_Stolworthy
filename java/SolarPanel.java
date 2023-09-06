// CS 172
// SolarPanel.java
// PA7b
// Written by: Robert Stolworthy
// November 10th, 2020

public class SolarPanel{
   private double openCircuitVoltage;
   private int nominalVoltage;
   private String cellType;
   
   // Default constructor
   public SolarPanel(){
      openCircuitVoltage = 40.0;
      nominalVoltage = 12;
      cellType = "Mono-crystalline";
   }
   
   // Accessor for Voc
   public double getCircuitVoltage(){
      return openCircuitVoltage;
   }
   
   // Accessor for Nom
   public int getNominalVoltage(){
      return nominalVoltage;
   }
   
   // Accessor for cell type
   public String getCellType(){
      return cellType;
   }
   
   // Mutator for Voc
   public double setCircuitVoltage(double circVolt){
    
      if ((circVolt <= 100.0) && (circVolt >= 0.0)){
         openCircuitVoltage = circVolt;
      } // Tests if the voltage is within bounds and sets voltage
      
      else{
         System.out.println("ERROR: Invalid Open Circuit Voltage");
      } // Prints error message if voltage is out of bounds
      
      return openCircuitVoltage;  
   }
   
   // Mutator for Nom
   public int setNominalVoltage(int nomVolt){
      
      if ((nomVolt <= 24) && (nomVolt >= 12)){
         nominalVoltage = nomVolt;
      } // Test if voltage is within bounds and sets voltage
      
      else{
         System.out.println("ERROR: Invalid Nominal Voltage");
      } // Prints error message if voltage is out of bounds
      
      return nominalVoltage;
   }
   
   // Mutator for cell type
   public String setCellType(String s){
      return cellType = s;
   }
   
   // Constructor
   public SolarPanel(double cVolt, int nVolt, String cT){
      setCircuitVoltage(cVolt);
      setNominalVoltage(nVolt);
      setCellType(cT);
   }
   
   // The toString method makes printing easy
   public String toString ( ) {
      return "SolarPanel: Voc = " + openCircuitVoltage + " V Nom = " + 
               nominalVoltage + " V cellType = " + cellType;
   }
} // Closes class
   