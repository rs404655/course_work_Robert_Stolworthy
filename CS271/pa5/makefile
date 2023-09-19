all: pa5

pa5: pa5.o sortingfunctions.o
	gcc pa5.o sortingfunctions.o -o pa5 -lm
	
pa5.o: pa5.c sortingfunctions.h
	gcc -c pa5.c
	
sortingfunctions.o: sortingfunctions.c sortingfunctions.h
	gcc -c sortingfunctions.c
	
clean:
	rm -rf *.o
