// CS 271 - PA 5
// Program name: sortingfunctions.c
// Robert Stolworthy
// 03/11/2021

#include <stdio.h>
#include <stdlib.h>
#include "sortingfunctions.h"

int selectionSort( int * const array, int size ){
    
    // initialize count
    int count1 = 0;
    int * smallestPtr;
    
    // loop over length - 1 elements
    for( int i = 0; i < size - 1; i++ ){
        
        // first index of remaining array
        int smallest = i;
        
        // loop to find index of smallest element 
        for( int j = i + 1; j < size; j++ ){
            
            if( *( array + j ) < *( array + smallest ) ){
                smallest = j;
                
                
            } // close if
            
            // count iteration
            count1++;
                
        } // close for
        
        
        
        swap( ( array + i ), ( array + smallest ) ); // swap smallest element
        
    } // close for
    
    // return statement
    return count1;

} // close selectionSort

int insertionSort( int * const array, int size ){
    
    // initialize count2
    int count2 = 0;
    
    // loop over length - 1 elements
    for( size_t i = 1; i < size; i++ ){
        
        // initialize location to place element
        size_t moveItem = i;
        
        // holds element to insert
        int insert = *( array + i );
        
        // search for place to put current element
        while ( moveItem > 0 && *( array + ( moveItem - 1 ) ) > insert ){
            
            // shift element right one slot
            *( array + moveItem ) = *( array + ( moveItem - 1 ) );
            --moveItem;
            
            // count iteration 
            count2++;
            
        } // close while
        
        *( array + moveItem ) = insert; // place inserted elements
        
    } // close for
    
    // return statement
    return count2;
    
} // close insertionSort

void swap ( int * num1, int * num2 ){
    
    // temp integer holds current *num1 value
    int hold = *num1;
    
    // switches *num1 value to *num2 and vice versa
    *num1 = *num2;
    *num2 = hold;
    
}

void fillArray ( int * const data, int size, int min, int max ){
    
    // for loop that fills the array with random integers between min to max inclusive
    for( int i = 0; i < size; i++ ){
        
        *( data + i ) = min + rand() % ( ( max - min ) + 1 );
        
    } // close for
    
} // close fillArray

void neatPrint ( int * const data, int size, int numPerLine, int fieldSize ){
    

    
    for ( int i = 0; i < size; i++ ){
        
        if ( i == numPerLine ){
            printf("\n");
        }
        
        printf("%*d", fieldSize, *( data + i ));
        
    }
    
    printf("\n");

}
