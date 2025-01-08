#include <stdio.h>
#include <stdbool.h>
#include <windows.h>

int main(){
    float num1, num2, result;
    char op, choice;
    
    do{
        system("cls");
        bool flag = false;
        printf("=========Simple Calculator=========\n");
        printf("Insert the first number : ");
        scanf("%f", &num1);
        printf("Insert the second number : ");
        scanf("%f", &num2);
        printf("Insert Operation(+-*/) : ");
        scanf(" %c", &op);

        switch(op){
            case '+': 
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'x':
                result = num1 * num2;
                break;
            case '/':
                if(num2 == 0){
                    flag = true;
                    printf("Cannot divide by 0!\n");
                }else{
                    result = num1 / num2;
                }
                break;
            default:
                printf("Invalid Operation!\n");
                flag = true;
        }
        if (!flag){
            printf("Result = %.2f\n", result);
        }
        printf("=========Simple Calculator=========\n");
        printf("Repeat the program (y/n)? ");
        scanf(" %c", &choice);
    }while(choice == 'Y' || choice == 'y');

    printf("===================================\n");

}