// CS 271 - PA 4
// Program name: arrayfunctions.c
// Robert Stolworthy
// 03/02/2021

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>
#include <ctype.h>
#include "arrayfunctions.h"

void fillInteger( int a[], int length, int min, int max ){
    
    // for loop that fills the array with random integers between min to max inclusive
    for( int index1 = 0; index1 < length; index1++ ){
        
        a[index1] = min + rand() % ( ( max - min ) + 1 );
        
    } // close for
    
} // close fillInteger

void fillCharacter( char c[], int length, char start, char end){
    
    // for loop that fills the array with random char integers between start to end inclusive
    for ( int index2 = 0; index2 < length; index2++ ){
        
        c[index2] = start + rand() % ( ( end - start ) + 1 );
        
    } // close for
    
} // close fillInteger

void findConsecutive( int array[], int length ){
    
    // for loop that test every element in the array to see if it equals the last one
    for ( int index3 = 1; index3 < length; index3++){
        
        // test if consecutives and if true print subscript
        if ( array[index3] == array[index3 - 1] + 1 )
            printf("Elements [%d] and [%d] are consecutive.\n", index3, (index3 - 1) );
        
    } // close for
    
} // close findConsecutive

void findTriples( char c[], int length ){
    
    // for loop that tests 3 elements in a row to see if they are alphabetically sequenced
    for ( int index4 = 3; index4 < length; index4++ ){
        
        // tests chars to see if they are alphabetically sequenced and prints them if true
        if ( ( c[index4 - 1] == c[index4] - 1 ) && ( c[index4 - 2] == c[index4] - 2 ) )
            printf("%c%c%c\n", c[index4 - 2], c[index4 - 1], c[index4]);
        
    } // close for
    
} // close findTriples

int countCharacter( char c[], int length, char searchChar ){
    
    // intialize count 
    int countO = 0;
    
    // for loop that tests each element in the array to see if it is equal to the searchChar
    for ( int index5 = 0; index5 < length; index5++){
        
        // tests current index in the array is equal to the searchChar
        if ( c[index5] == searchChar )
            
            countO += 1;
            
    } // close for
    
    // return statement
    return countO;
    
} // closes countCharacter

void fillFloat( float a[], int length, float min, float max){
    
    int random;
    int iMax =  max * 10;
    int iMin = min * 10;
    
    // for loop that fills an array with random floats between min and max inclusive
    for ( int index6 = 0; index6 < length; index6++ ){
        
        random = iMin + rand() % ( ( iMax - iMin ) + 1 );
        a[index6] = random / 10.0;
    
    } // close for
    
} // close fillFloat

float floatMean( float array[], int length ){
    
    // initialize variables
    float sum = 0.0, mean = 0.0;
    
    // for loop that sums the array
    for ( int index7 = 0; index7 < length; index7++){
        
        // adds next element to the sum 
        sum += array[index7];
        
    } // closes for
    
    // calculates the mean
    mean = sum / length;
    
    // return statement
    return mean;
        
} // close floatMean

float floatMin( float array[], int length ){
    
    // initialize the min to the first element in the array
    float min = array[0];
    
    // for loop that finds the min of the array
    for ( int index8 = 1; index8 < length; index8++ ){
        
        // tests if current element is less than the current min 
        if ( array[index8] < min )
            
            min = array[index8];
    
    } // close for
    
    // return statement
    return min;
    
} // close floatMin

float floatMax( float array[], int length ){
    
    float max = array[0];
    
    for ( int index9 = 1; index9 < length; index9++ ){
        
        if ( array[index9] > max )
            
            max = array[index9];
        
    } // close for
    
    // return statement
    return max;
    
} // close floatMax
