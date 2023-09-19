import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import

public class WordCount {
	
	public static void main(String[] args) throws IOException{
		
		String fname = "pg100_smaller.txt";
		read(fname);
		
	}
	
	public static void read(String file)throws IOException{
		
		String line = "";
		String[] words = null;
		
		
			
		FileReader fileReader =  new FileReader(file);
			
		BufferedReader bufferedReader = new BufferedReader(fileReader);
			
		while ((line = bufferedReader.readLine()) != null) {
				
			words = line.split(" ");
						
		}
			
		for (int i = 0; i < words.length; i++) {
				
		   System.out.println(words[i]);
				
		}
			
		
	}

}
