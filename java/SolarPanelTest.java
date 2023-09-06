// CS 172
// SolarPanel.java
// PA7b
// Written by: Robert Stolworthy
// November 11th, 2020

public class SolarPanelTest{
   public static void main(String[] args){
      
      // Creates new SolarPanel
      SolarPanel panelOne = new SolarPanel();
      
      // Calls toString() method with panelOne
      System.out.println(panelOne);
      
      // Sets panelOne's Voc to 150.0 (illegal)
      panelOne.setCircuitVoltage(150.0);
      
      System.out.println(panelOne);
      
      // Sets panelOne's Nom to -10 (illegal)
      panelOne.setNominalVoltage(-10);
      
      System.out.println(panelOne);
      
      // Creates new SolarPanel
      SolarPanel panelTwo = new SolarPanel( 40.0, 24, "Mono-crystalline");
      
      // Prints panelTwo's Voc
      System.out.println("panelTwo's VOC: " + panelTwo.getCircuitVoltage()
                         + " V");
      
      // Prints panelTwo's Nom
      System.out.println("panelTwo's Nom: " + panelTwo.getNominalVoltage()
                         + " V");
      
      // Prints panelTwo's cell type
      System.out.println("panelTwo's cellType: " + panelTwo.getCellType());
      
      // Sets panelTwo's Voc to 0.0
      panelTwo.setCircuitVoltage(0.0);
      
      System.out.println("panelTwo's VOC: " + panelTwo.getCircuitVoltage()
                         + " V");
      
      // Sets panelTwo's cell type to Vinyl Polymer
      panelTwo.setCellType("Vinyl Polymer");
      
      System.out.println("panelTwo's cellType: " + panelTwo.getCellType());
      
      System.out.println(panelTwo);
      
   } // Closes main() method
} // Closes class