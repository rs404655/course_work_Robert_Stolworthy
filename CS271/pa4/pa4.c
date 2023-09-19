// CS 271 - PA 4
// Program name: pa4.c
// Robert Stolworthy
// 02/28/2021

#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <time.h>
#include <ctype.h>
#include "arrayfunctions.h"

int main( void ){
    
    // initialize size variables
    int size1 = 20, size2 = 50;
    
    // set time to null
    int t = time( NULL );
    srand( t );
    
    // start problem 1
    printf("Problem 1\n");
    
    // create first array with size of 20
    int array1[size1];
    
    // call fillInteger function to fill array1 with integers
    fillInteger( array1, size1, -20, 20 );
    
    printf("The elements of array1 are: \n");
    
    // print array1 in format
    for ( int count1 = 0; count1 < size1; count1++ ){
        
        // if 10th integer print newline
        if ( count1 == 10 ){
            
            printf("\n");
            
        } // close if
        
        printf("%d ", array1[count1]);
        
    } // close for
    
    // print new line
    printf("\n");
    
    // search if there are any consecutives by calling findConsecutive
    findConsecutive( array1, size1 );
    
    // print new line and start of problem 2
    printf("\nProblem 2\n");
    
    // create second array and make it char with a size of 50
    char array2[size2];
    
    // call fillCharacter and fill array2
    fillCharacter( array2, size2, 'a', 'z' );
    
    printf("The elements of array2 are: \n");
    
    // print array2 on one line
    for ( int count2 = 0; count2 < size2; count2++ ){
    
        printf("%c ", array2[count2]);
        
    } // close for
    
    // print new line
    printf("\n");
    
    // call findTriples and search for triples 
    findTriples( array2, size2 );
    
    // print new line and start problem 3
    printf("\nProblem 3\n");
    
    // prompt
    printf("Enter a char search key: \n");
    
    // get char from user input
    char key = getchar();
    getchar();
    
    // while the char is not alphabetical prompt for char
    while ( isalpha( key ) == 0 ){
        
        // prompt
        printf("Enter a char: \n");
        
        // get char from user input
        key = getchar();
        getchar();
        
        
    } // close while
    
    // makes search key to lowercase
    key = tolower( key );
    
    // print the amount of times search key appears
    printf("The amount of times %c appears in array2 is %d\n", key, countCharacter( array2, size2, key ) );
    
    // print new line and start problem 4
    printf("\nProblem 4\n");
    
    // create new float array with a size of 10
    float array3[10];
    
    // call fillFloat and fill array3
    fillFloat( array3, 10, 1.0, 50.0);
    
    printf("The elements of array3 are: \n");
    
    // print array3
    for ( int count3 = 0; count3 < 10; count3++){
        
        printf("%f  ", array3[count3]);
        
    } // close for 
    
    // print new line
    printf("\n");
    
    // call floatMean and print the result
    printf("The mean of array3: %f\n", floatMean( array3, 10 ) );
    
    // call floatMin and print the result
    printf("The minimum of array3: %f\n", floatMin( array3, 10 ) );
    
    // call floatMax and print the result
    printf("The maximum of array3: %f\n", floatMax( array3, 10 ) );
    
} // close main
    
