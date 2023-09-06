import java.util.*;

public class lab4{

   public static void main(String [] args){
   
      //prompt
      System.out.println("The program will generate all functions from X={a,b,c} to Y={1,...,n}.");
      System.out.print("Please enter the value of n:");
      
      // Scanner for user input to obtain n
      Scanner input = new Scanner(System.in);
      
      // obtain n
      int n = input.nextInt();
      
      // set variables for function total, 1to1 total, onto total, bijection total
      int total = 1, n_oto = 0, n_onto = 0, n_bijec = 0;
      
      // set variables for later print using boolean variables
      String f_oto="not ", f_onto="not ", f_bijec="not ";
      
      // set up array with size n
      int [] a = new int[n];
      
      // fill array with 1,...,n
      for(int i = 0; i < n; i++){
      
         a[i] = i + 1;
      
      } // close for
      
      //nested for loop to iterate for every combination
      for(int i = 1; i <= n; i++){
         for(int j = 1; j <= n; j++){
            for(int k = 1; k <= n; k++){
            
               // reset variables every loop
               f_oto = "not ";
               f_onto = "not ";
               f_bijec = "not ";
               
               // if func is 1to1
               if(oto(i, j, k)){
               
                  // set variable to print nothing
                  f_oto = "";
                  
                  //increment amount of 1to1 functions
                  n_oto++;
               
               }
               
               // if func is onto
               if(onto(a, i, j, k)){
               
                  // set variable to print nothing
                  f_onto = "";
                  
                  // increment amount of onto functions
                  n_onto++;
               
               }
               
               // if func is bijec
               if(oto(i, j, k)&&onto(a, i, j, k)){
               
                  // set variable to print nothing
                  f_bijec = "";
                  
                  // increment amount of bijections
                  n_bijec++;
               
               }
               
               //output
               System.out.printf("f%d(a)=%d    f%d(b)=%d     f%d(c)=%d\n", total, i, total, j, total, k);
               
               System.out.printf("    f%d is %sone-to-one, %sonto, and %sa bijection.\n", total, f_oto, f_onto, f_bijec);
               
               // increment total
               total++;
            
            }
         }
      }
      
      //output
      System.out.printf("There are %d functions total\n", (total-1));
      System.out.printf("%d of them are one-to-one.\n", n_oto);
      System.out.printf("%d of them are onto.\n", n_onto);
      System.out.printf("%d of them are bijections.\n", n_bijec);   

      
   } //close main()
   
   
   
   
   
   // function to determine if function X to Y is 1to1
   public static boolean oto(int x, int y, int z){
   
      // if none of the variables equal each other the function is 1to1
      if((x != y)&&(x != z)&&(y != z)) return true;
      else return false;
   
   } // close oto()
   
   
   
   
   
   // function to determine if function X to Y is onto
   public static boolean onto( int [] a, int x, int y, int z){
   
      // return variable
      boolean tf = true;
      
      // array to hold t or false values to later determine if the function is onto
      boolean [] out = new boolean[a.length];
      
      // go through each variable and see if it is located anywhere in the function if so set out[i] to true
      for ( int i = 0; i < a.length; i++){
      
         if((x == a[i])||(y == a[i])||(z == a[i]))
            out[i] = true;
         else
            out[i] = false;
      
      }
      
      // if all out[i]'s are true return true else return false
      for( int j = 0; j < out.length; j++){
      
         if(out[j] == false)
            tf = false;
      
      }
      
      return tf;
   
   } // close onto()

}