#include <stdio.h>
#include <math.h>

int main( void ){
    
    int userNum = 0, mid = 0, index = 0, oSpaces = 0;
    
    printf( "Enter an integer: \n" );
    scanf( "%d", &userNum );
    
    
    if ( (userNum % 2) == 0 ){
        
       mid = ( userNum / 2 ) - 1;
        
       for( index = 0; index < userNum; index++ ){
    
        
          if ( ( index < mid ) ){
            
             oSpaces = mid - index;
            
             for ( int i = 0; i < oSpaces; ++i){
                
                printf( " " );
                
             }
             
             printf( "*" );
             
             if ( index % 2 != 0 ){
                 
                for ( int j = 0; j < index; ++j){
                    printf( " " );
                }
                
             }
             
             else{
                 
                 for ( int j = 0; j < index; ++j){
                    printf( " " );
                 }
                 
                 printf( " " );
                 
             }
                 
             
             if ( index > 0 ){
                 
                 printf( "*" );
                 
             }
             
             printf("\n");
          } 
          
         
         
         
          if ( ( index == mid ) || (index == mid + 1) ){
              
             printf( "*" );
             
             int l = 2 * mid - 1;
             
             for ( int m = 0; m < l; ++m){
                 printf( " " );
             }
             
             printf( "*" );
             printf("\n");
          }
          
          
          
          
          if ( ( index > mid + 1 ) ){
            
               oSpaces = index - ( mid + 1 ) ;
            
               for ( int i = 0; i < oSpaces; ++i){
                
                   printf( " " );
                
               }
             
               printf( "*" );
               
               if ( index % 2 != 0 ){
                 
                  for ( int j = 0; j < ( userNum - index ); ++j){
                     printf( " " );
                  }
                
               }
             
               else{
                 
                  for ( int j = 1; j < ( userNum - index ); ++j){
                     printf( " " );
                  }
                 
                  
                 
               }
               
               if ( index != userNum - 1 ){
                   
                   printf( "*" );
                   
               }
               
               printf("\n");
          }
       }
               
          
            
           
    }
    
    if ( (userNum % 2) != 0 ){
        
       mid = ( userNum / 2 );
        
       for( index = 0; index < userNum; index++ ){
    
        
          if ( ( index < mid ) ){
            
             oSpaces = mid - index;
            
             for ( int i = 0; i < oSpaces; ++i){
                
                printf( " " );
                
             }
             
             printf( "*" );
             
             if ( index % 2 != 0 ){
                 
                for ( int j = 0; j < index; ++j){
                    printf( " " );
                }
                
             }
             
             else{
                 
                 for ( int j = 0; j < index; ++j){
                    printf( " " );
                 }
                 
                 printf( " " );
                 
             }
                 
             
             if ( index > 0 ){
                 
                 printf( "*" );
                 
             }
             
             printf("\n");
          } 
          
         
         
         
          if ( ( index == mid )  ){
              
             printf( "*" );
             
             int l = 2 * mid - 1;
             
             for ( int m = 0; m < l; ++m){
                 printf( " " );
             }
             
             printf( "*" );
             printf("\n");
          }
          
          
          
          
          if ( ( index > mid  ) ){
            
               oSpaces = index - ( mid ) ;
            
               for ( int i = 0; i < oSpaces; ++i){
                
                   printf( " " );
                
               }
             
               printf( "*" );
               
               if ( index % 2 != 0 ){
                 
                  for ( int j = 1; j < ( userNum - index ); ++j){
                     printf( " " );
                  }
                
               }
             
               else{
                 
                  for ( int j = 1; j < ( userNum - index ); ++j){
                     printf( " " );
                  }
                 
                  printf(" ");
                 
               }
               
               if ( index != userNum - 1 ){
                   
                   printf( "*" );
                   
               }
               
               printf("\n");
          }
       }
               
          
            
           
    }
    
}
