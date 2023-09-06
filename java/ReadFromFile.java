import java.util.*;
import java.io.*;

public class ReadFromFIle {
   
   public static void main (String args[]) throws IOException {
      String inputLine;
      int lineCount = 0;
      Scanner fileScan = new Scanner(new File("sample.txt"));
      while (fileScan.hasNext()) {
      
         inputLine = fileScan.nextLine();
         
         System.out.println(inputLIne);
         
         lineCount++;
      }
      
      System.out.println("I read " + lineCount + " lines from the file.");
   }
}