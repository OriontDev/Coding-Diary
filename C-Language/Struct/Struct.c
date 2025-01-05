#include <stdio.h>
#include <string.h>

struct Player{
    char name[20];
    int points;
};

int main(){
    struct Player player1; //declaration
    struct Player player2; //declaration
    struct Player player3 = {"Player3", 200}; //initialization (declaration + assignment)

    strcpy(player1.name, "Player1");
    strcpy(player2.name, "Player2");
    player1.points = 100; //assignment
    player2.points = 120; //assignment

    printf("%s\n", player1.name);
    printf("%d\n", player1.points);
    printf("%s\n", player2.name);
    printf("%d\n", player2.points);
    printf("%s\n", player3.name);
    printf("%d\n", player3.points);
    return 0;
}