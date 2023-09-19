#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>

void factorList( int n );

int main( void ){
 
    int num = 6;
    factorList( num );
    
}


void factorList( int n ){
    
    int index = 0;
    
    for( index = 0; index <= n; index++){
        
        if ( n % index == 0 ){
            printf("%d ", index);
        }
        
    }
    
    printf("\n");
}

