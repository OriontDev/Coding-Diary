#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main(){

    char string1[] = "Oriont";
    char string2[] = "Fedora";

    strlwr(string1);

    
    printf("%s", string1);

    //strupr(string1);
    //strcat(string1, string2);
    //strncat(string1, string2, 4);
    //strcpy(string1, string2);
    //strncpy(string1, string2, 4);

    return 0;
}