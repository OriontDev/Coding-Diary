#include <stdio.h>

int main(){
    int x;

//for loop
    for(int i = 0; i < 10; i++){
        printf("i is currently : %d\n", i);
    }

    printf("Insert X value : ");
    scanf("%d", &x);
//while loop

    while(x == 1){
        printf("X = 1\n");
    }
//do loop
    do{
        printf("X = 2\n");

    }while(x == 2);

}