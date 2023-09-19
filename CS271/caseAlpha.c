#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <time.h>

int main( void ){
    
    char c;
    c = getchar();
    
    switch( c ){
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            printf("The character is a vowel.\n");
            break;
        default:
            printf("The character is not a vowel.\n");
    }
}
