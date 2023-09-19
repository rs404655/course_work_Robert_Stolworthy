// CS 271 - PA 3
// Program name: pa3.c
// Robert Stolworthy
// 02/18/2021

#include "pa3functions.h"
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main( void ){
    
    int j = 0;
    
    printf("Perfect numbers before 1000:\n");
    
    for ( int i = 1; i < 1000; ++i ){
        
        if ( perfect( i ) == 1 )
            
            printf( "%d ", i );
        
    }
            
    
    printf("\n");
    
    printf("First 20 prime numbers:\n");
    
    for ( int k = 2; j < 20; ++k ){
        
        if ( prime( k ) == 0 ){
            
            printf("%d ", k);
            j++;
            
        }
    }
    
    printf("\n");
    
    printf("Random numbers and their reverse:\n");
    
    int randOne = rand() % 10000;
    int randTwo = rand() % 10000;
    int randThree = rand() % 10000;
    int randFour = rand() % 10000;
    int randFive = rand() % 10000;
   
    printf("%d ", randOne );
    printf("%d ", randTwo );
    printf("%d ", randThree );
    printf("%d ", randFour );
    printf("%d ", randFive );
    
    printf("\n");
    
    
    printf("%d ", revDigits( randOne ));
    printf("%d ", revDigits( randTwo ));
    printf("%d ", revDigits( randThree ));
    printf("%d ", revDigits( randFour ));
    printf("%d ", revDigits( randFive ));
    
    printf("\n");
    
}
