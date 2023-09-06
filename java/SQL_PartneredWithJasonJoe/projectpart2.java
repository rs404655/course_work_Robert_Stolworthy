import java.util.*;
import java.sql.*;

public class projectpart2{

   public static void project(int projectnumber, String givenAddress, String givenSchedular, String givenName, String givenPhoneNo){
   
      try{
      
         // Establish Connection
         Class.forName( "org.postgresql.Driver" );
         
         Connection conn = DriverManager.getConnection( "jdbc:postgresql://localhost//cs482502", "dbuser", "lwilldowell");
         
         // print all warnings
         for( SQLWarning warn = conn.getWarnings(); warn != null; warn = warn .getNextWarning() ){
            
            System.out.println( "SQL Warnin:" );
            System.out.println( "State : " + warn.getSQLState() );
            System.out.println( "Message: " + warn.getMessage() );
            System.out.println( "Error : " + warn.getErrorCode() );
         
         }
         
         // get a statement for the connection
         Statement stmt = conn.createStatement();
         
         // number 1
         if(projectnumber == 1){
         
            String s1 = "select * from Site where address = " + givenAddress + ";";
            ResultSet rset = stmt.executeQuery(s1);
            
            while(rset.next()){
               System.out.println(rset.getString("address") + " " + rset.getFloat(2));
            }
            
         }
         
         // number 2
         if(projectnumber == 2){
            
            String s2 = "select d.serialNo, d.modelNo, t.name from DigitalDisplay as d, Specializes as s, TechnicalSupport as t where d.schedularSystem = " + givenSchedular + " AND d.modelNo = s.modelNo AND s.modelNo = t.modelNo;";
            Resultrset = stmt.executeQuery(s2);
            
            while(rset.next()){
               System.out.println(rset.getString("serialNo") + " " + rset.getFloat(2));
            }
            
         }
         
         // number 3
         if(projectnumber == 3){
            
            String s3 = "select distinct name, COUNT(*) as cnt from Salesman where name = " + givenName + " group by name order by name;";
            Resultrset = stmt.executeQuery(s3);
            
            while(rset.next()){
               System.out.println(rset.getString("name") + " " + rset.getFloat(2));
            }
            
         }
         
         // number 4
         if(projectnumber == 4){
            
            String s4 = "select phone from Client where phone = " + givenPhoneNo;
            Resultrset = stmt.executeQuery(s3);
            
            while(rset.next()){
               System.out.println(rset.getString("phone") + " " + rset.getFloat(2));
            }
            
         }
         
         // close the result set, statement, and the connection
         stmt.close();
         conn.close();
      }
      
      catch(SQLException sqle)[
      
         System.out.println("SQLException : " + sqle);
         
      }
   
   }
   
   public static void main(String [] args){
   
   
      Scanner scnr = new Scanner();
      
      int projectno = scnr.nextInt();
      
      project(number);
   
   }

}