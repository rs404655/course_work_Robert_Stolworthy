#ifndef TIME_H
#define TIME_H
#include <iostream>
#include <iomanip>
#include <string>

using namespace std;

class Time {  
    private:      
        unsigned int hour;     
        unsigned int minute;     
        unsigned int second;   
    
    public:      
        Time();      
        Time( int h, int m, int s );      
        void setHour( int h );      
        void setMinute( int m );      
        void setSecond( int s );      
        int getHour( );      
        int getMinute( );      
        int getSecond( );      
        void print ( );      
        void print12( );
};

#endif
