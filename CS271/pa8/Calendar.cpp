// CS 271 - PA 8
// Program name: Calendar.cpp
// Robert Stolworthy
// 04/07/2021

#include <iostream>
#include <iomanip>
#include <string>
#include <cstdlib>
#include "Time.h"
#include "Date.h"

int main(){
    
    // initialize variables and arrays
    Time timeArray[5];
    int hour, min, sec;
    Date dateArray[5];
    int mon, day, year;
    
    // seed rand function
    srand( time( NULL ) );
    
    // for loop that calls set functions for Time class and prints times
    // using print function
    for ( int index1 = 0; index1 < 5; index1++ ){
        
        // randomly generates hours, minutes, and seconds for each element
        hour = rand() % 24;
        min = rand() % 60;
        sec = rand() % 60;
        
        // sets elements values
        timeArray[index1].setHour( hour );
        timeArray[index1].setMinute( min );
        timeArray[index1].setSecond( sec );
        
        // prints element using print function
        cout << "The " << index1 + 1 << "(st/nd/rd/th) time: ";
        timeArray[index1].print();
        cout << endl;
        
        
    } // close for
    
    cout << endl << endl;
    
    // for loop to print timeArrays elements using secondary print function print12
    for ( int index2 = 0; index2 < 5; index2++ ){
        
        cout << "The " << index2 + 1 << "(st/nd/rd/th) time: ";
        timeArray[index2].print12();
        cout << endl;
        
    } // close for
    
    cout << endl << endl;
    
    // for loop that calls set functions for Date class and prints dates
    // using print function
    for( int index3 = 0; index3 < 5; index3++ ){
        
        // randomly generates months, days, and years (2100 to 1980) for each element
        mon = 1 + rand() % 12;
        day = 1 + rand() % 31;
        year = 1980 + rand() % ( 2100 - 1980 );
        
        // sets elements values
        dateArray[index3].setMonth( mon );
        dateArray[index3].setDay( day );
        dateArray[index3].setYear( year );
        
        // prints element using orint function
        cout << "The " << index3 + 1 << " (st/nd/rd/th) date: ";
        dateArray[index3].print();
        cout << endl;
        
    } // close for
    
    cout << endl << endl;
    
    // test and prints setHour function
    cout << "The second time's hour: " << timeArray[1].getHour() << endl;
    timeArray[1].setHour( 11 );
    cout << "The time's new hour: " << timeArray[1].getHour() << endl;
    
    // test and prints setMinute function
    cout << "The second time's seconds: " << timeArray[1].getSecond() << endl;
    timeArray[1].setSecond( 24 );
    cout << "The time's new seconds: " << timeArray[1].getSecond() << endl;
    
    // test and prints setSecond function and prints new time
    cout << "The second time's minutes: " << timeArray[1].getMinute() << endl;
    timeArray[1].setMinute( 16 );
    cout << "The time's new minutes: " << timeArray[1].getMinute() << endl;
    cout << "The time's new time: ";
    timeArray[1].print();
    
    // print new line
    cout << endl << endl;
    
    // test and prints setDay function
    cout << "The first date's day: " << dateArray[0].getDay() << endl;
    dateArray[0].setDay( 15 );
    cout << "The date's new day: " << dateArray[0].getDay() << endl;
    
    // test and prints setMonth function
    cout << "The first date's month: " << dateArray[0].getMonth() << endl;
    dateArray[0].setMonth( 10 );
    cout << "The date's new month: " << dateArray[0].getMonth() << endl;
    
    // test and prints setYear function and prints new date
    cout << "The first date's year: " << dateArray[0].getYear() << endl;
    dateArray[0].setYear( 1999 );
    cout << "The date's new year: " << dateArray[0].getYear() << endl;
    cout << "The date's new date: ";
    dateArray[0].print();
    
    // print new line
    cout << endl << endl;;
    
    // creates new Time and Date to test base dates
    Time baseTime;
    Date baseDate;
    
    // print base time
    cout << "The base time is ";
    baseTime.print();
    cout << endl << endl;
    
    // print base date
    cout << "The base date is ";
    baseDate.print();
    cout << endl << endl;
    
} // closes main
    
