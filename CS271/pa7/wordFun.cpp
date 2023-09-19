// CS 271 - PA 7
// Program name: wordFun.cpp
// Robert Stolworthy
// 03/29/2021

#include <iostream>
#include <string>

using namespace std;

int main(){
    
    // initialize variables
    int index1 = 0, index2 = 0, index3 = 0;
    
    // create string array with 25 elements
    string userInput[25];
    
    // string to be later used as a place holder
    string currentString;
    
    // prompt
    cout << "Input string (Ctrl-D to quit):  ";
    
    // while loop that puts user strings into array elements
    while ( cin && index1 < 25 ){
        
        // user inputs string
        cin >> userInput[index1];
        
        // iterates array index
        index1++;
        
        //prompt
        cout << "Input string: (Ctrl-D to quit): ";
        
    } // close while
    
    // print new line
    cout << endl;
    
    // if the user inputs too many strings error message
    if ( index1 == 25 ){
        
        cout << "Too many strings inputted" << endl;
        
    } // close if
    
    // print new line
    cout << endl;
    
    // for loop that prints current string and individual letters on new lines
    for ( index2 = 0; index2 <= index1; index2++ ){
        
        // sets index
        currentString = userInput[index2];
        
        // prints current array string
        cout << currentString << endl;
        
        // for loop to print individual letters
        for( index3 = 0; index3 < currentString.length(); index3++){
            
            cout << currentString[index3] << endl;
            
        } // close for
        
        // print new line
        cout << endl;
        
    } // close for
    
} // close main
        
