// Robert Stolworthy
// 9/1/2021
// CS272

import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class WordCount {
	
	public static void main(String[] args) throws IOException{
		
		// Create a String from pg100_smaller.txt
		String fname = "pg100_smaller.txt";
		
		// Set a string array created by the read function and file
		String[] words = read(fname);
		
		// send string array and destination words.csv to write function
		write("words.csv", words);
		
	}
	
	public static String[] read(String fname)throws IOException{
		
		// declare variables
		String text = "";
		String line = "";
		String[] words = null;
		try {
			
			// Create file reader
			FileReader fileReader = new FileReader(fname);
			
			// Create buffered reader
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			
			
			//while loop that creates a string from txt file using buffered reader
			while ((line = bufferedReader.readLine()) != null) {
				text = text + " " + line;
			
			} // close while
			
			// Using Tokenizer
			StringTokenizer tokenizer = new StringTokenizer(text, " !\"#$%&'()*+,-./:;?@[\\]^_`{|}~<>'");
			int num_tokens = tokenizer.countTokens();
			words = new String[num_tokens];
			int c = 0;
			
			// while function that uses the String line to fill out a String array "words"
			while (tokenizer.hasMoreTokens())
			{
				String word = tokenizer.nextToken();
				words[c] = word.toLowerCase();
			    c++;
			} // close while
			
			//close bufferedReader
			bufferedReader.close(); 
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fname + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fname + "'");
		}
		
		// Creates hashset
		HashSet<String> set = new HashSet<String>();
					
		// for loop to fills hashset with unique strings only
		for (int index1 = 0; index1 < words.length; index1++) {
						
			set.add(words[index1]);
						
		} // close for
					
		// creates a String array for unique words only and set to the size of the hashset
		String[] wordsU = new String[set.size()];
		
		// fills wordsU array with unique words
		set.toArray(wordsU);
					

		// creates an integer array that matches the amount of unique words
		int[] count = new int[wordsU.length];
					
		// for loop that fills the count array with 0
	    for( int index4 = 0; index4 < wordsU.length; index4++) {
						
			count[index4] = 0;
						
		} // close for

	    // for loop that goes through every original word
	    for( int k = 0; k < words.length; k++) {
						
		   // for loop that compares every unique word to the original word
	       for( int index5 = 0; index5 < wordsU.length; index5++) {
			    			
	          // if words match add count to count that matches the word
	          if ( wordsU[index5].equals(words[k])) {
			    	 			
			     count[index5] = count[index5] + 1;
			    	 			
			  } // close if
			    	 		
		   } // close for
					 	
		} // close for
			
	    // for loop that combines unique words and count to one string each
	    for ( int index6 = 0; index6 < wordsU.length; index6++ ) {
	    	   
	    	   String num = Integer.toString(count[index6]);
	    	   wordsU[index6] = wordsU[index6] + " " + num;
	    	   
	    }
	    
		// return statement returning a string array from txt file
		return wordsU;
		
	} // close read

	
	public static void write(String fname, String[] words) {
		
		try {
			
			// creates new file
			File file = new File(fname);

			// creates new file writer
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			
			// creates new buffered writer
			BufferedWriter bw = new BufferedWriter(fw);
			

	        // write the total number of unique words on file
			bw.write("Total number of words: " + words.length + "\n");
			
			// writes every unique word and how many times they appeared onto the file
			for (int i = 0; i < words.length; i++) {
				bw.write(words[i] + "\n");
			} // close for
			
			// close buffered writer
			bw.close();
			
			// close file writer
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		// print statement to indicate the program is finished
		System.out.println("Finish writing words to file " + fname);
		
	} // close write
	
} // close class
