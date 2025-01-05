#include <stdio.h>


void printAge(int *pAge)
{
    *pAge = *pAge + 1; //youre dealing with the value of the variable age
    printf("You are %d years old\n", *pAge);
}

int main(){
    int age = 21;
    int *pAge;
    pAge = &age; //dealing with the address :D (thank me later, future me)

    printf("Address of age : %p\n", &age);
    printf("Address of pAge : %p\n", pAge);
    printf("Value stored at address: %d\n", *pAge);

    printAge(pAge); //the pointer can change the value of a variable even though its not in the same function!
    printf("Age = %d", age); //the age turn from 21 to 22!



    return 0;
}