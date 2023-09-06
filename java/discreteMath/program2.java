import java.util.*;

public class program2{
    public static void main(String args[]){
    
        // count the amount of original numbers are entered
        // temp holds the value until it has been proven its original
        int count = 0, temp;
        
        //set strings for each truth statement
        String t1 = "True", t2 = "False", t3 = "False", t4 = "True", t5 = "False";
        
        // array to hold 10 different integers
        int [] array = new int[10];
        
        // scanner for user input
        Scanner input = new Scanner(System.in);
        
        // prompt
        System.out.println("Please enter 10 different integers: ");
        
        // while loop to collect 10 original integers and store into array
        while(count < 9){
        
            // set temp to user input
            temp = input.nextInt();
            
            // use check() to see if user input is original
            if(check(temp, array) == 0){
                
                //if true insert into array and increment count
                array[count] = temp;
                count++;
            }
        }
        
        // for loop to test "for all if x < 0 then x is odd"
        for(int i = 0; i < array.length; i++){
        
            // if x < 0 but even set to false
            if(array[i] < 0 && (array[i] % 2 == 0)) t1 = "False";
        
        }
        
        // output results for a
        System.out.printf("a)  is %s\n", t1);
        
        // for loop to test "for some x, x < 0 then x is odd"
        for(int j = 0; j < array.length; j++){
        
            // if x < 0 and x is odd set to true
            if(array[j] < 0 && (array[j] % 2 == 1)) t2 = "True";
            
            // if x >= 0 and x is even set to true
            if(array[j] >= 0 && (array[j] % 2 == 0)) t2 = "True";
            
            // if x >= 0 and x is odd set to true
            if(array[j] >= 0 && (array[j] % 2 == 1)) t2 = "True";
        
        }
        
        // output results for b
        System.out.printf("b)  is %s\n", t2);
        
        // for loop to test " for some x, x < 0 and x is odd"
        for(int k = 0; k < array.length; k++){
        
            // if x < 0 and odd set to true
            if(array[k] < 0 && (array[k] % 2 == 1)) t3 = "True";
            
        }
        
        // output results for c
        System.out.printf("c)  is %s\n", t3);
        
        // for loop to test "for all x, x is divisble by 3 then it is divisible by 5"
        for(int l = 0; l < array.length; l++){
        
            // if x is divisble by 3 but divisble by 5 set to false
            if((array[l] % 3 == 0) && (array[l] % 5 != 0)) t4 = "False";
            
        }
        
        // output results for d
        System.out.printf("d)  is %s\n", t4);
        
        // for loop to test "for some x, x is divisble by 3 then it is divisible by 5"
        for(int m = 0; m < array.length; m++){
        
            // if x is divisble by 3 and 5 set to true
            if((array[m] % 3 == 0) && (array[m] % 5 == 0)) t5 = "True";
            
            // if x is not by 3 or 5 set to true
            if((array[m] % 3 != 0) && (array[m] % 5 != 0)) t5 = "True";
            
            // if x is not divisble by 3 but is by 5 set to true
            if((array[m] % 3 != 0) && (array[m] % 5 == 0)) t5 = "True";
            
        }
        
        // output results for e
        System.out.printf("e)  is %s\n", t5);

    } // close main
    
    //check() checks the user input for correctness
    public static int check(int x, int [] array){
    
       // variable to hold true or false variable, true until false
       int tf = 0;
       
       // test if variable is equal to every element
       for(int i = 0; i < array.length; i++){
       
            if(array[i] == x) tf = 1;
            
       }
       
       // return statement
       return tf;
    
    } // close check
}
