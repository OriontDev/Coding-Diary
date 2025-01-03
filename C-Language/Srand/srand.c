#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){

    srand(time(0));

    int dice1 = (rand() % 6) + 1; //dis becoz if we dont use +1, it will use 0-5
    int dice2 = (rand() % 6) + 1;
    int dice3 = (rand() % 6) + 1;


    printf("%d\n", dice1);
    printf("%d\n", dice2);
    printf("%d\n", dice3);

    return 0;
}