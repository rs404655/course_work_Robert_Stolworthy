all: pa6

pa6: pa6.o binaryTree.o
	gcc pa6.o binaryTree.o -o pa6 -lm
	
pa6.o: pa6.c binaryTree.h
	gcc -c pa6.c
	
binaryTree.o: binaryTree.c binaryTree.h
	gcc -c binaryTree.c
	
clean:
	rm -rf *.o
