// CS 271 - PA 8
// Program name: Date.cpp
// Robert Stolworthy
// 04/06/2021

#include <iostream>
#include <iomanip>
#include <string>
#include "Date.h"

using namespace std;

// default constructor
Date::Date( ){
    
    // sets values to default
    setMonth( 1 );
    setDay( 1 );
    setYear( 1980 );
    
} // closes default constructor
    
// constructor
Date::Date( int mo, int da, int ye ){
    
    // sets values using parameters
    setMonth( mo );
    setDay( da );
    setYear( ye );
    
} // closes constructor

// mutator for month
void Date::setMonth( int mo ){
    
    // checks if parameter is within bounds
    if( mo >= 1 && mo <= 12 ){
     
       month = mo;
       
    } // close if
    
} // close setMonth
  
// mutator for day
void Date::setDay( int da ){

    // checks if parameter is within bounds for February
    if( ( getMonth() ) == 2 && da >= 0 && da <= 28 ){
       
       day = da;
       
    } // close if
    
    // checks if parameter is within bounds for April, June, September, and Novemeber
    if( ( getMonth() ) == 4 || ( getMonth() ) == 6 || ( getMonth() ) == 9 || ( getMonth() ) == 11 && da >= 0 && da <= 30 ){
        
        day = da;
        
    } // close if
    
    else{
        
        // checks if parameter is within bounds
        if ( da >= 0 && da <= 31 ){
            
            day = da;
            
        } // close if
        
    } // close if
   
} //close setDay

// mutator for year
void Date::setYear( int ye ){
    
    // checks if parameter is within bounds
    if( ye >= 1980 && ye <= 2100 ){
        
       year = ye;
    
    } // close if
    
} // close setYear

// accessor for month
int Date::getMonth( ){
    
    return month;
    
} // close getMonth

// accessor for day
int Date::getDay( ){
    
    return day;
    
} // close getDay

// accessor for year
int Date::getYear( ){
    
    return year;
    
} // close getYear

// print function for format 00/00/0000
void Date::print( ){
    
    cout << setw( 2 ) << setfill( '0' ) << getMonth() << "/" << setw( 2 ) << getDay() << "/" << setw( 4 ) << getYear();
    
} // close print
