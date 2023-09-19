// CS 271 - PA 8
// Program name: Time.cpp
// Robert Stolworthy
// 04/05/2021

#include <iostream>
#include <iomanip>
#include <string>
#include "Time.h"

using namespace std;

// default constructor
Time::Time( ){
    
    setHour( 0 );
    setMinute( 0 );
    setSecond( 0 );
    
}
    
// constructor
Time::Time( int h, int m, int s ){
    
    // uses mutators
    setHour( h );
    setMinute( m );
    setSecond( s );
    
}

// mutator for hour
void Time::setHour( int h ){
    
    // checks if parameter is within bounds
    if( h >= 0 && h <= 23 ){
     
       hour = h;
       
    } // close if
    
} // close setHour
 
// mutator for minute
void Time::setMinute( int m ){

    // checks if parameter is within bounds
    if( m >= 0 && m <= 59 ){
        
       minute = m;
       
    } // close if
   
} // close setMinute

// mutator for second
void Time::setSecond( int s ){
    
    // checks if parameter is within bounds
    if( s >= 0 && s <=59 ){
        
       second = s;
    
    } // close if
    
} // close setSecond
    
// accessor for hour
int Time::getHour( ){
    
    return hour;
    
} // close getHour
  
// accessor for minute
int Time::getMinute( ){
    
    return minute;
    
} // close getMinute
  
// accessor for second
int Time::getSecond( ){
    
    return second;
    
} // close getSecond
   
// print function to print in 24 hour format
void Time::print( ){
    
    cout << setw( 2 ) << setfill( '0' ) << getHour() << ":" << setw(2) << getMinute();
    cout << ":" << setw( 2 ) <<  getSecond();
    
} // closes print
   
// print function to print in 12 hour format
void Time::print12( ){
    
    // for times after 12 PM
    if( ( getHour() ) > 12 ){
        
        cout << setw( 2 ) << setfill( '0' ) << getHour() - 12 << ":";
        cout << setw( 2 ) << getMinute() << ":" << setw( 2 ) << getSecond();
        cout << " PM";
    
    } // close if
    
    // for 12 PM
    if ( ( getHour() ) == 12 ){
        
        cout << "12:" << setw( 2 ) << setfill( '0' ) << getMinute() << ":";
        cout << setw( 2 ) << getSecond() << " PM";
    
    } // close if
    
    // for 12 AM
    if ( ( getHour() ) == 0 ){
        
        cout << "12:" << setw( 2 ) << setfill( '0' ) << getMinute() << ":";
        cout << setw( 2 ) << getSecond() << " AM";
        
    } // close if
    
    // for times before 12 PM excluding midnight
    if( ( getHour() ) < 12 ){
        
        cout << setw( 2 ) << setfill( '0' ) << getHour() << ":";
        cout << setw( 2 ) << getMinute() << ":" << setw( 2 ) << getSecond();
        cout << " AM";
      
    } // close if
    
} // close print12
        


