// CS 271 - PA 2
// Program name: cargo.c
// Robert Stolworthy
// 02/10/2021

#include <stdio.h>
#include <math.h>

int main( void ){
    
    // initialize variables
    int userNum = 0, mid = 0, index = 0, oSpaces = 0;
    
    // prompt
    printf( "Enter an integer: \n" );
    scanf( "%d", &userNum );
    
    // while statement that loops until a integer greater than 2 is entered
    for ( int g = userNum; g <= 2; g++ ){
        
        // Error message
        printf( "Integer must be greater than 2\n" );
        
        // prompt
        printf( "Enter new integer: " );
        scanf( "%d", &userNum );
        
    } // close while
    
    // tests whether the number is even
    if ( (userNum % 2) == 0 ){
        
       // creates midpoint number 
       mid = ( userNum / 2 ) - 1;
        
       // for loop that creates the pattern for even numbers
       for( index = 0; index < userNum; index++ ){
    
          // if that tests whether the index is below the midpoint
          if ( ( index < mid ) ){
             
             // creates the outside spaces 
             oSpaces = mid - index;
            
             // for loop that prints needed outside spaces
             for ( int i = 0; i < oSpaces; ++i){
                
                printf( " " );
                
             } // close for
             
             printf( "*" );
             
             // if to test whether the index is even
             if ( index % 2 != 0 ){
                 
                // prints inside spaces 
                for ( int j = 0; j < index; ++j){
                    printf( " " );
                } // close for
                
             } // close if
             
             else{
                 
                 // prints inside spaces
                 for ( int j = 0; j < index; ++j){
                    printf( " " );
                 } // close for
                 
                 printf( " " );
                 
             } // close else
                 
             // prints second astric if it is not the first line
             if ( index > 0 ){
                 
                 printf( "*" );
                 
             }
             
             // creates next line
             printf("\n");
          } // close if
          
         
         
          // test whether it is the middle section of the pattern
          if ( ( index == mid ) || (index == mid + 1) ){
              
             printf( "*" );
             
             // creates a integer with the needed middle inside spaces
             int l = 2 * mid - 1;
             
             // prints need spaces
             for ( int m = 0; m < l; ++m){
                 printf( " " );
             } // close for
             
             printf( "*" );
             
             // creates next line
             printf("\n");
          }
          
          
          // tests whether the index is past the mid section
          if ( ( index > mid + 1 ) ){
               
              // decides on the amount of needed outside spaces
               oSpaces = index - ( mid + 1 ) ;
               
               // prints outside spaces
               for ( int i = 0; i < oSpaces; ++i){
                
                   printf( " " );
                
               } // close for
             
               printf( "*" );
               
               // tests if index is odd
               if ( index % 2 != 0 ){
                  
                   // prints needed spaces
                  for ( int j = 0; j < ( userNum - index ); ++j){
                     printf( " " );
                  } // close for
                
               } // close if
             
               // if index is even
               else{
                  
                  // prints needed spaces
                  for ( int j = 1; j < ( userNum - index ); ++j){
                     printf( " " );
                  } // close for
                 
               } // close else
               
               // tests whether the index is the last line
               if ( index != userNum - 1 ){
                   
                   printf( "*" );
                   
               } // close if
               
               // creates next line
               printf("\n");
          
          } // close if
          
       } // close for
               
    } // close if
    
    // tests whether userNum is odd
    if ( (userNum % 2) != 0 ){
        
       // creates middlepoint 
       mid = ( userNum / 2 );
        
       // for loop that creates the pattern
       for( index = 0; index < userNum; index++ ){
    
          // if statement that determines if the index is before the midpoint
          if ( ( index < mid ) ){
            
             // creates integer for the amount of outside spaces needed per line
             oSpaces = mid - index;
            
             // prints outside spaces
             for ( int i = 0; i < oSpaces; ++i){
                
                printf( " " );
                
             } // close for
             
             printf( "*" );
             
             // tests whether index is odd
             if ( index % 2 != 0 ){
                 
                // prints needed inside spaces 
                for ( int j = 0; j < index; ++j){
                    printf( " " );
                } // close for
                
             } // close if 
             
             else{
                 
                 // prints inside spaces if index was even
                 for ( int j = 0; j < index; ++j){
                    printf( " " );
                 } // close for
                 
                 printf( " " );
                 
             } // close else
                 
             // tests whether the index is the initial index
             if ( index > 0 ){
                 
                 printf( "*" );
                 
             } // close if
             
             // creates new line
             printf("\n");
          
              
          } // closes if
          
         
         
          // tests whether the index is at the midpoint
          if ( ( index == mid )  ){
              
             printf( "*" );
             
             // creates an integer for the number of needed inside spaces
             int z = 2 * mid - 1;
             
             // prints inside spaces
             for ( int m = 0; m < z; ++m){
                 printf( " " );
             } // closes for
             
             printf( "*" );
             
             // creates new line
             printf("\n");
          
              
          } // closes if
          
          // tests whether index is higher than the midpoint
          if ( ( index > mid  ) ){
               
               // creates necessary number for outside spaces
               oSpaces = index - ( mid ) ;
               
               // prints outside spaces
               for ( int i = 0; i < oSpaces; ++i){
                
                   printf( " " );
                
               } // close for
             
               printf( "*" );
               
               // tests whether or not index is odd
               if ( index % 2 != 0 ){
                 
                  // prints inside spaces
                  for ( int j = 1; j < ( userNum - index ); ++j){
                     printf( " " );
                  } // close for
                
               } // close if
             
               else{
                  
                  // prints inside spaces if the index is even
                  for ( int j = 1; j < ( userNum - index ); ++j){
                     printf( " " );
                  } // close for
                 
                  printf(" ");
                 
               } // close else
               
               // test whether the index is at the final line
               if ( index != userNum - 1 ){
                   
                   printf( "*" );
                   
               } // close if
               
               // creates new line
               printf("\n");
          
              
          } // close if
       
           
       } // close for
               
           
    } // close if
    
    
} // close main
            
        
        
        
