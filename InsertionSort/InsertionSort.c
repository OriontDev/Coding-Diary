#include <stdio.h>
#include <stdlib.h>

int main()
{
    int Ar[] = {5, 6, 9, 3, 3, 100, 90, 20};

    int Temp;

    int ArraySize = sizeof(Ar)/sizeof(Ar[0]);

    printf("%d\n", ArraySize);

    for (int i = 1; i < ArraySize; i++)
    {
        printf("%d\n", i);
        while(i > 0 && Ar[i - 1] > Ar[i])
        {
        //3, 5, 6, 9, 3, 100, 90, 20 --this is what it looks like on the first run (3 changes)
            Temp = Ar[i - 1];
            Ar[i - 1] = Ar[i];
            Ar[i] = Temp;
            i = i - 1;
            printf("Minus one!! :D\n");
        }

    }
    for(int i = 0; i < ArraySize; i++){
        printf("%d, ", Ar[i]);
    }


    return 0;
}

//THIS IS INSERTION SORTTTT