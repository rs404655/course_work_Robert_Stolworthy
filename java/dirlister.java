import java.util.*;
import java.io.*;
import java.nio.file.*;

public class dirlister{

   public static void main(String [] args) throws IOException{
   
      String userpath = args[0];
      
      
      dirlister(userpath);
   
   }
   
   public static void dirlister(String userpath) throws IOException{
   
      Path dir = Path.of(userpath);
      
      if(Files.notExists(dir)){
         
         System.out.println("Error: Directory Does Not Exist");
         return;
         
      }
      
      try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
      
         for(Path entry : stream){
         
            System.out.printf("Type: %s   Size: %ld   Name: %s",  getType(entry), getSize(entry), getName(entry));
         
         }
      
      }
   
   }
   
   public static String getType(Path cdir) throws IOException{
   
      if(Files.isDirectory(cdir)) return "D";
      
      if(Files.isRegularFile(cdir)) return "F";
      
      else return "O";
   
   }
   
   public static long getSize(Path cdir) throws IOException{
   
      return Files.size(cdir);
   
   }
   
   public static String getName(Path cdir) throws IOException{
   
      return cdir.toString();
   
   } 

}


