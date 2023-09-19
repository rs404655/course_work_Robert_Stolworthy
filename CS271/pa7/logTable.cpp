// CS 271 - PA 7
// Program name: logTable.cpp
// Robert Stolworthy
// 03/29/2021

#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main(){
    
    float baseTwo, baseTen, baseE;
    
    cout << "Number   Log base 2   Log base 10   Log base e" << endl;
    
    for( int index = 1; index <= 100; index++ ){
        
        baseTwo = log2f( index / 1.0 ) * 1.000;
        baseTen = log10f( index / 1.0 ) * 1.000;
        baseE = logf( index / 1.0 ) * 1.000;
        
        
        cout << setw(4) << index << "        ";
        cout << setw(5) << fixed << setprecision(3) << baseTwo << "        ";
        cout << setw(5) << fixed << setprecision(3) << baseTen << "         ";
        cout << setw(5) << fixed << setprecision(3) << baseE << endl;
        
    }
    
}
        
