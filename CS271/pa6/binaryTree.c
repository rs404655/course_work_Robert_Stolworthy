// CS 271 - PA 6
// Program name: binaryTree.c
// Robert Stolworthy
// 03/16/2021

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>
#include "binaryTree.h"

int min( TreeNodePtr treePtr ){
    
    // if the pointer is not NULL find the left pointer of the left pointer
    if ( treePtr -> leftPtr != NULL ){
        
        min( ( treePtr -> leftPtr ) );
        
    } // close if
    
    // return once the min is found at the most left pointer
    else{
        
        // return the most left pointer data value
        return ( treePtr -> data );
    
        
    } // close else
    
} // close min


int max( TreeNodePtr treePtr ){
    
    // if the pointer is not NULL find the right pointer of the pointer
    if ( treePtr -> rightPtr != NULL ){
        
        max( ( treePtr -> rightPtr ) );
        
    } // close if
    
    // return once the min is found at the most right pointer
    else{
        
        // return the most right pointer data value
        return ( treePtr -> data );
        
    } // close else
    
} // close max


int sum( TreeNodePtr treePtr ){
    
    // if the pointer is NULL add 0 to the sum
    if( treePtr == NULL ){
        
        return 0;
    } // close if    
    
    // return statement that adds and sums the values of the binary search tree through
    // recursion
    return ( treePtr -> data  + sum( treePtr -> leftPtr ) + sum( treePtr -> rightPtr ) );
    
} // close sum


void insertNode( TreeNodePtr *treePtr, int value ){
    
    // if tree is empty
    if ( *treePtr == NULL ){
        
        // allocate memory
        *treePtr = ( TreeNodePtr ) malloc( sizeof( TreeNode ) );
        
        // if memory was allocated, then assign data
        if ( *treePtr != NULL ){
            
            ( *treePtr ) -> data = value;
            ( *treePtr ) -> leftPtr = NULL;
            ( *treePtr ) -> leftPtr = NULL;
            
        } // close if
        
        // if memory was not allocated, print a statement stating so
        else {
            
            printf("%d not inserted. No memeory available.\n", value);
        
        } // close else
    
    } // close if
    
    // tree is not empty
    else{
        
        // data to insert is less than data in current node 
        if ( value < ( *treePtr ) -> data ){
            
            insertNode( &( ( *treePtr ) -> leftPtr ), value );
        
        } // close if
        
        // data to insert is greater than data in current node
        else if ( value > ( *treePtr ) -> data ){
            
            insertNode ( &( ( *treePtr ) -> rightPtr ), value );
            
        } // close else if
        
        // duplicate data value ignored
        else{
            
            printf("%s", "dup");
        
        }
    
    } // close else
    
} // close insertNode


              
