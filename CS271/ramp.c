// CS 271 - PA 1
// Program name: ramp.c
// Robert Stolworthy
// 02/03/2021

#include <stdio.h>
#include <math.h>

int main( void ){
    
    // initialize variables
    float rise, length, ramp;
    
    // prompt for the rise
    printf( "Enter the rise of the ramp as a decimal:\n" );
    
    // recieve user input
    scanf( "%f", &rise );
    
    //calculate length
    length = rise * 12;
    
    // if loop to print requires ramp if length is greater than 30
    if ( length >= 30 )
        printf("The ramp requires a landing.\n");
    
    
    // calculate the ramp's length/hypotenuse
    ramp = (sqrt( length * length + rise * rise));
    
    //Convert length into feet
    length = length / 12;
    
    //Convert ramp into feet
    ramp = ramp / 12;
    
    printf( "The horizantal length in feet of the ramp is: %.1f ft\n", length );
    
    printf( "The ramp's diagnol length in feet is: %.1f ft\n", ramp );
    
    
}
