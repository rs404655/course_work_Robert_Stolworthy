// CS 271 - PA 3
// Program name: pa3functions.c
// Robert Stolworthy
// 02/18/2021

#include <stdio.h>
#include <math.h>
#include "pa3functions.h"

int perfect( int x ){
    
    int sum = 0;
    
    for( int i = 1; i < x; i++ ){
        
        if( x % i == 0 ){
            
            sum += i;
            
        }
    }
        
    
    if( sum == x )
        
        return 1;
        
    
    
    else

        return 0;
        
}

int prime( int n ){
    
    int i;
    
    for( i = 2; i <= ( sqrt( n ) ); i++ ){
        
        if ( n % i == 0 )
            
            return 1;
    }
    
    return 0;
    
}

int revDigits( int a ){
    
    int newNum = 0, b = a, index = 0; 
    
    while ( b > 0 ){
        
        index++;
        b = b / 10;
        
    }
    
    for( int j = 0; j < index; j++ ){
        
        newNum = newNum + ( (a % 10) * ( pow( 10, ( index - j - 1 ) ) ) );
        a = a / 10;
        
    }
    
    return newNum;
    
}
