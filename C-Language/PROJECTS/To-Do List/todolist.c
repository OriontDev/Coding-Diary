#include <stdio.h>
#include <stdlib.h>
#include <windows.h>

void sstatus();
void sname();
void removelist();

int main() {
    int choice = 0;
    char list[5][30] = {"None", "None", "None", "None", "None"};
    char status[5][30] = {"N/A", "N/A", "N/A", "N/A", "N/A"};
    int listsize = sizeof(list) / sizeof(list[0]);

    do {
        system("cls");

        printf("=======TO-DO LIST=======\n");
        for (int i = 0; i < listsize; i++) {
            printf("%d. %s - %s\n", i + 1, list[i], status[i]);
        }
        printf("Option:\n");
        printf("1. Set Name\n");
        printf("2. Set Status\n");
        printf("3. Remove\n");
        printf("4. Exit\n");
        printf("Input choice: ");
        scanf("%d", &choice);
        switch(choice){
            case 1:
                sname(list, status);
                break;
            case 2:
                sstatus(list, status);
                break;
            case 3:
                removelist(list, status);
                break;
            case 4:
                printf("Exiting..\n");
                break;
            default:
                printf("Invalid Input!\n");
                break;
        }
    } while (choice != 4);

    return 0;
}

void sname(char list[5][30], char status[5][30]){
    int choiceadd;
    char TaskName[30];
    printf("Which number would you like to change? ");
    scanf("%d", &choiceadd);

    if (choiceadd < 1 || choiceadd > 5) {
        printf("Invalid choice! Task number must be between 1 and 5.\n");
        system("pause");
        return;
    }

    while (getchar() != '\n');

    printf("Task Name : ");
    fgets(TaskName, 30, stdin);

    size_t len = strlen(TaskName);
    if (len > 0 && TaskName[len - 1] == '\n') {
        TaskName[len - 1] = '\0';  // Replace the newline with null terminator
    }

    strcpy(list[choiceadd - 1], TaskName);
    strcpy(status[choiceadd - 1], "UnFinished");
    printf("Task updated sucsessfully!\n");
    printf("Press Enter to go back..");
    getchar();
}

void sstatus(char list[5][30], char status[5][30]){
    int choiceset, choiceset2;
    printf("Which number status would you like to change? ");
    scanf("%d", &choiceset);

    if (choiceset < 1 || choiceset > 5) {
        printf("Invalid choice! Task number must be between 1 and 5.\n");
        printf("Press Enter..");
        getchar();
        return;
    }

    printf("=====================\n");
    printf("Task %d. %s\n", choiceset, list[choiceset - 1]);
    printf("Set task to : \n");
    printf("1. Finished\n");
    printf("2. UnFinish\n");

    printf("Input choice : ");
    scanf("%d", &choiceset2);
    
    switch(choiceset2){
        case 1:
            strcpy(status[choiceset - 1], "Finished");
            break;
        case 2:
            strcpy(status[choiceset - 1], "UnFinished");
            break;
        default:
            printf("Invalid input! press enter to return..");
            getchar();
    }
    printf("Sucsessfully changed! press enter to continue..");
    getchar();
    getchar();
}

void removelist(char list[5][30], char status[5][30]){
    int choicere;
    char choicedel;
    printf("=======REMOVING TASK=========\n");
    printf("Which number would you like to remove? ");
    scanf("%d", &choicere);
    printf("Task Name : %s\n", list[choicere - 1]);
    printf("Status : %s\n", status[choicere - 1]);
    printf("Confirm Deletion(y/n)? ");
    scanf(" %c", &choicedel);
    if(choicedel == 'y' || choicedel == 'Y'){
        strcpy(status[choicere - 1], "N/A");
        strcpy(list[choicere - 1], "None");
        printf("Deletion complete! Press enter to return..");
        getchar();
        getchar();
    }else{
        printf("Deletion cancelled! press enter to return..");
        getchar();
        getchar();
    }
}
