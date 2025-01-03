#include <stdio.h>
#include <stdlib.h>

int main(){
    int number;

    printf("Enter a number : ");
    scanf("%d", &number);

    switch(number){
        case 1:
            printf("The number is 1");
            break;
        case 2:
            printf("The number is 2");
            break;
        default:
            printf("The number is neither 1 or 2");
            break; //optional, but good practice
    }
}
