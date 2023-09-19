#include <stdio.h>

int mystery1 ( char *s );


int mystery1(char *s){
    
    int i, j = 0;for (i=0 ;s[i] != '\0'; i++)if (s[i] == ' ') j++;return j;
    
}

int main(){
    
    printf("%d\n", mystery1("asdx ddf gf"));
    
    int x = 3, y = 0;
    
    if (x && y)
        printf("Both true\n");
    else 
        printf("At least one false\n");
    printf("%3d\n", sizeof("Hello World")); 
    
    float r = 7.8, s = 6.0;
    printf("%4.1f\n", r / s);
    
}
