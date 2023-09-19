#ifndef DATE_H
#define DATE_H
#include <iostream>
#include <iomanip>
#include <string>

using namespace std;

class Date {  
    private:      
        unsigned int month;     
        unsigned int day;     
        unsigned int year;   
    
    public:      
        Date();      
        Date( int mo, int da, int ye );      
        void setMonth( int mo );      
        void setDay( int da );      
        void setYear( int ye );      
        int getMonth( );      
        int getDay( );      
        int getYear( );      
        void print( );      
};

#endif
