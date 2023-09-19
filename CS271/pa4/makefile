all: pa4

pa4: pa4.o arrayfunctions.o
	gcc pa4.o arrayfunctions.o -o pa4 -lm

pa4.o: pa4.c arrayfunctions.h
	gcc -c pa4.c

arrayfunctions.o: arrayfunctions.c arrayfunctions.h
	gcc -c arrayfunctions.c

clean:
	rm -rf *.o
