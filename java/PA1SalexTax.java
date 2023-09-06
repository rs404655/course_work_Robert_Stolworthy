public class PA1SalexTax {
   public static void main (String args[]) {
      float purchaseAmount = 3.50f;
      float salesTaxRate = 0.0813f;
      // calculate sales tax amount
      float salesTaxAmount = purchaseAmount * salesTaxRate;
      // calculate total purchase amount
      float totalAmount = purchaseAmount + salesTaxAmount;
      // display the receipt
      
      System.out.printf("Purchase Amount %8.2f\n", purchaseAmount);
      System.out.printf("Sales Tax       %8.2f\n", salesTaxAmount);
      System.out.printf("------------------------\n");
      System.out.printf("Total            %8.2f\n", totalAmount);
     } //end main
  } // end class 
      