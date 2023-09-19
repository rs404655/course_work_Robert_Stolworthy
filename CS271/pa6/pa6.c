// CS 271 - PA 6
// Program name: pa6.c
// Robert Stolworthy
// 03/17/2021

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>
#include "binaryTree.h"

int main( void ){
    
    // initialize first TreeNodePtr to NULL
    TreeNodePtr rootPtr = NULL;
    
    // set srand to time( NULL )
    srand( time( NULL ) );
    
    // print and insert first set of nodes into first binary search tree
    printf("The first binary tree's values: \n");
    
    for ( unsigned int i = 1; i <= 10; ++i ){
        int item = rand() % 15;
        printf("%4d", item);
        insertNode( &rootPtr, item );
    } // close for
    
    // new line
    printf("\n");
    
    // find and print the min of first binary tree
    printf("\nThe minimum of the first binary tree is: \n%d\n", min( rootPtr ));
    
    // find and print the max of first binary tree
    printf("\nThe maximum of the first binary tree is: \n%d\n", max( rootPtr ));
    
    // find and print the sum of first binary tree
    printf("\nThe sum of the first binary tree, not including dups, is: \n%d\n", sum( rootPtr ));

    // new line
    printf("\n");
    
    // initialize second TreeNodePtr to NULL
    TreeNodePtr oneRootPtr = NULL;
    
    // print and insert second set of node(s) into second binary search tree
    printf("The second binary tree's value: \n");
    int item2 = -15 + rand() % 30;
    printf("%4d\n", item2);
    insertNode( &oneRootPtr, item2 );
    
    // find and print the min of second binary tree
    printf("\nThe minimum of the second binary tree is: \n%d\n", min( oneRootPtr ));
    
    // find and print the max of second binary tree
    printf("\nThe maximum of the second binary tree is: \n%d\n", max( oneRootPtr ));
    
    // find and print the sum of second binary tree
    printf("\nThe sum of the second binary tree, not including dups, is: \n%d\n", sum( oneRootPtr ));
    
    // new line
    printf("\n");
    
    // initialize third TreeNodePtr to NULL
    TreeNodePtr nodePtr = NULL;
    
    // print and insert third set of nodes into third binary search tree
    printf("The third binary tree's values: \n");
    
    for ( unsigned int j = 1; j <= 10; ++j ){
        int item3 = -10 + rand() % 21;
        printf("%4d", item3);
        insertNode( &nodePtr, item3 );
    } // close for
    
    // new line
    printf("\n");
    
    // print and find the min of third binary tree
    printf("\nThe minimum of the third binary tree is: \n%d\n", min( nodePtr ));
    
    // print and find the max of third binary tree
    printf("\nThe maximum of the third binary tree is: \n%d\n", max( nodePtr ));
    
    // print and find the sum of third binary tree
    printf("\nThe sum of the third binary tree, not including dups, is: \n%d\n", sum( nodePtr ));
    
    // new line
    printf("\n");
    
} // close main
    
    
