import java.util.Scanner;
import java.util.Random
public class PracticeTriangle{
   public static void main(String [] args){
      Scanner scnr = new Scanner(System.in);
      int i = 1;
      
      while (i < 20){
         while (i < 6){
            if ((i == 1) || (i == 2) || (i == 3) || (i == 5)){
               System.out.print(i + " ");
               i = i + 1;
            }
            else if (i == 4){
               System.out.print("... ");
               i = i + 1;
            }
         }
      }
         i = i + 1;
   }   
}
