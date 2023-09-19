// CS 271 - PA 5
// Program name: pa5.c
// Robert Stolworthy
// 03/11/2021

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>
#include "sortingfunctions.h"
#define ARRAYSIZE 10
#define ARRAYSIZE2 20

int main( void ){
    
    // initialize variables
    int max = 20, min = -20;
    
    // set time to NULL
    int t = time( NULL );
    srand( t );
    
    // allocate space for the array
    int * arrayPtr = ( int * ) malloc ( ARRAYSIZE * sizeof( int ) );

    // fill first array
    fillArray ( arrayPtr, ARRAYSIZE, min, max );
    
    // print the first array formatted
    printf("\nThe first array:\n");
    neatPrint ( arrayPtr, ARRAYSIZE, 10, 5 );
    
    // selection sort the array and print the amount of iterations
    printf("\nThe amount of times Selection Sort iterates: \n%d\n", selectionSort( arrayPtr, ARRAYSIZE ) );
    
    // print the selected sorted array
    printf("\nThe array Selection Sorted:\n");
    neatPrint ( arrayPtr, ARRAYSIZE, 10, 5 );
    
    // fill second array
    fillArray ( arrayPtr, ARRAYSIZE, min, max );
    
    // print second array formatted
    printf("\nThe second array:\n");
    neatPrint ( arrayPtr, ARRAYSIZE, 10, 5 );
    
    // insertion sort the array and print the amount of iterations
    printf("\nThe amount of times Insertion Sort iterates: \n%d\n", insertionSort ( arrayPtr, ARRAYSIZE ) );
    
    // print the insertion sorted array
    printf("\nThe second array Insertion Sorted:\n");
    neatPrint ( arrayPtr, ARRAYSIZE, 10, 5 );
    
    // allocate space for array2
    int * array2Ptr = ( int * ) malloc ( ARRAYSIZE2 * sizeof( int ) );

    // fill third array
    fillArray ( array2Ptr, ARRAYSIZE2, min, max );
    
    // print the third array formatted
    printf("\nThe third array:\n");
    neatPrint ( array2Ptr, ARRAYSIZE2, 10, 5 );
    
    // selection sort the array and print the amount of iterations
    printf("\nThe amount of times Selection Sort iterates: \n%d\n", selectionSort( array2Ptr, ARRAYSIZE2 ) );
    
    // print the selected sorted array
    printf("\nThe array Selection Sorted:\n");
    neatPrint ( array2Ptr, ARRAYSIZE2, 10, 5 );
    
    // fill fourth array
    fillArray ( array2Ptr, ARRAYSIZE2, min, max );
    
    // print fourth array formatted
    printf("\nThe fourth array:\n");
    neatPrint ( array2Ptr, ARRAYSIZE2, 10, 5 );
    
    // insertion sort the array and print the amount of iterations
    printf("\nThe amount of times Insertion Sort iterates: \n%d\n", insertionSort ( array2Ptr, ARRAYSIZE2 ) );
    
    // print the insertion sorted array
    printf("\nThe fourth array Insertion Sorted:\n");
    neatPrint ( array2Ptr, ARRAYSIZE2, 10, 5 );
}
