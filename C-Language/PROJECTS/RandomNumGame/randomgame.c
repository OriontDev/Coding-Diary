#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <windows.h>

int main(){

    char choice;
    do{
        system("cls");
        int conanswer, answer;
        int MIN = 1;
        int MAX = 100;
        int guess = 0;


        srand(time(0));
        conanswer = (rand() % MAX) + MIN;
        printf("Guess a number!(1-100)\n");
        do{
            printf("Insert guess : ");
            scanf("%d", &answer);
            guess += 1;
            if (answer < conanswer){
                printf("Too Low!\n");
            } else if (answer > conanswer){
                printf("Too High!\n");
            }
        }while(answer != conanswer);

        printf("Correct! it took you %d guesses\n", guess);
        printf("Play again (y/n)? ");
        scanf(" %c", &choice);

    }while(choice == 'Y' || choice == 'y');

    printf("Thank you for playing!");
}