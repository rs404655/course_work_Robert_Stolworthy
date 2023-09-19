// CS 271 - PA 1
// Program name: ball.c
// Robert Stolworthy
// 02/03/2021

#include <stdio.h>
#include <math.h>

int main( void ){
    
    // initialize values
    float outDia, intDia, outVol, intVol, totVol, outRad, intRad;
    
    // prompt and recieve outer diameter
    printf( "Input the outer diameter in inches with a decimal:\n" );
    scanf( "%f", &outDia );
    
    // prompt and recieve the interior diameter
    printf( "Input the inter diameter in inches with a decimal:\n" );
    scanf( "%f", &intDia );
    
    // determine whether the diameter values are reasonable
    if ( outDia <= intDia )
        printf( "Exterior diameter must be larger than interior diameter.\n");
    
    // calculate the volue of the rubber ball
    else{    
       
       // determine the outer ball's radius
       outRad = outDia / 2;
       
       // determine the interior ball's radius
       intRad = intRad / 2;
        
       // determine outer ball's volume
       outVol = ( 4 / 3 ) * ( 3.1415 * pow( outRad, 3 ) );
    
       // determine interior ball's volume
       intVol = ( 4 / 3 ) * ( 3.1415  * pow( intRad, 3 ) );
    
       // determine total volume of the hollow ball
       totVol = outVol - intVol;
    
       printf( "The volume of the rubber needed to produce the rubber ball is around %.2f cubic inches\n", totVol);

    } // close else statement

} // end main
