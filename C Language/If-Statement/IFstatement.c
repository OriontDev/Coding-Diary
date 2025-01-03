#include <stdio.h>
#include <stdlib.h>

int main(){
    int x = 1;
    int y = 2;
    int z = 3;
    
    if(x == 1){
        printf("X is 1\n");
    }else{
        printf("X is NOT 1\n");
    }

    if(x == 1 && y == 2){
        printf("X is 1 AND Y is 2\n");
    }else{
        printf("X AND Y is not 1 and 2\n");
    }

    if(x == 1 || x == 2){
        printf("X is either 1 OR 2\n");
    }else if(x == 2 || x == 3){
        printf("X is either 2 OR 3\n");
    }

    if(z != x){
        printf("Z doesnt have the same value as X!\n");
    }


    // && means AND and || means OR
    // we have to use == inside of IF
    // != means not equal to
    return 0;
}