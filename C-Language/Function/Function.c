#include <stdio.h>
#include <stdlib.h>


int add(int x, int y);

int main(){
    int num1 = 10;
    int num2 = 30;

    int result = add(num1, num2);
    printf("The result is %d", result);
    return 0;
}

int add(int x, int y){
    return x + y;
}