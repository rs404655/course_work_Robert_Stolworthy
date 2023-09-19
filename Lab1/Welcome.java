// Robert Stolworthy
// 9/1/2021
// CS272

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Welcome {

	public static void main(String[] args) throws IOException {
		
        // Print Welcome to Java
		System.out.println("Welcome to Java");
		
        // Print current system time
		System.out.println( System.currentTimeMillis() );
		
        // call sum func.
		sum();
		
	} //close main
	
	public static void sum( ) throws IOException{
		
	   // prompt
	   System.out.println("Terminate after entered");
       System.out.println("Enter line of #'s:");
		
       // create buffered reader
	   BufferedReader inputFile = new BufferedReader(new InputStreamReader(System.in));
	   
       // initialize variables
       int sum = 0, num = 0;
       String line;
		
       // while loop to store numbers from input into string array
	   while((line = inputFile.readLine()) != null) {
			
	      String numbers[] = line.split(" ");
		
          // change numbers from string to int to add to sum	   
	      for( int i = 0; i < numbers.length; i++) {
				
                 num = Integer.parseInt(numbers[i]);
               
                 // calculate sum
		         sum = sum + num;
				   
	      } // close for
			
	   } // close while
		
       // print sum statement	
	   System.out.println("The sum is: " + sum);
		    

	} // close sum
	
} // close Welcome
