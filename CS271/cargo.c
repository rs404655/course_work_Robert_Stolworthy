// CS 271 - PA 2
// Program name: cargo.c
// Robert Stolworthy
// 02/10/2021

#include <stdio.h>
#include <math.h>

int main( void ){
    
    // initialization of variables
    float cap = 0.0, container = 0.0, sum = 0.0, totWeightLoaded = 0;
    int index = 0;
    
    // prompt
    printf( "Enter the boat's capacity: \n" );
    
    // scan for the boat's capacity
    scanf( "%f", &cap );
    
    // while Statement to determine whether the ship's capacity has been met
    while ( sum <= cap ){
        
        // prompt
        printf( "Enter the new containers weight: \n" );
        //scans for next container size
        scanf( "%f", &container );
        
        // if to determine whether the container is positive
        // if the condition is true add the container to the sum
        if ( container > 0 ){
        
            // if to determine whether the addition of the container
            // to the sum causes the sum to exceed the capacity
            if ( ( sum + container ) <= cap ){
            
                // if true than the container is added to the ship's weight
                totWeightLoaded = totWeightLoaded + container;
                
                // tracks how many containers have been put on the ship
                ++index;
            
            } // close if
            
            // add container to the sum
            sum += container;
        
        } // close if
    
    } // close while
    
    printf( "The ship is full.\n" );
    
    printf( "Ship's Weight Capacity: %.1f tons\n", cap);
    
    printf( "%d containers were loaded\n", index );
    
    printf( "Total weight loaded: %.1f tons\n", totWeightLoaded );
    
}
