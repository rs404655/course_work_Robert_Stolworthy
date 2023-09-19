all: Calendar

Calendar: Calendar.o Time.o Date.o
	g++ -std=c++11 Calendar.o Time.o Date.o -o Calendar -lm
	
Calendar.o: Calendar.cpp Time.h Date.h
	g++ -std=c++11 -c Calendar.cpp
	
Time.o: Time.cpp Time.h
	g++ -std=c++11 -c Time.cpp
	
Date.o: Date.cpp Date.h
	g++ -std=c++11 -c Date.cpp
	

