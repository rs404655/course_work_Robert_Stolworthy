#ifndef SORTINGFUNCTIONS_H
#define SORTINGFUNCTIONS_H

int selectionSort ( int * const array, int size );

int insertionSort ( int * const array, int size );

void swap ( int * num1, int * num2 );

void fillArray ( int * const data, int size, int min, int max );

void neatPrint ( int * const data, int size, int numPerLine, int fieldSize );

#endif
