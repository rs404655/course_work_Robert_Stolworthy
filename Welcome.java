import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Welcome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Java");
		
		System.out.println( System.currentTimeMillis() );
		
		sum();
	}
	
	public static void sum( ) throws IOException{
		
      System.out.println("Enter line of #'s:");
		
		BufferedReader inputFile = new BufferedReader(new InputStreamReader(System.in));
		
      int sum = 0, num;
      
		String line;
		
		while((line = inputFile.readLine()) != null) {
			
			String numbers[] = line.split(" ");
			   
			  
			for( int i = 0; i < numbers.length; i++) {
				 
            num = Integer.parseInt(numbers[i]);
               
				sum = sum + num;
				   
			}
			
	  }
			
		System.out.println("The sum is: " + sum);
		    

	}
}
