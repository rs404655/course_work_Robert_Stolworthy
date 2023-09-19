all: pa3

pa3: pa3.o pa3functions.o
	gcc pa3.o pa3functions.o -o pa3 -lm

pa3.o: pa3.c pa3functions.h
	gcc -c pa3.c

pa3functions.o: pa3functions.c pa3functions.h
	gcc -c pa3functions.c
