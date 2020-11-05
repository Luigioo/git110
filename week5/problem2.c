#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

int main(){
    srand(time(NULL));
    char fruits[4][256] = {
        "bell",
        "orange",
        "cherry",
        "horseshoe"
    };

    char arr[10] = "bell";
    char arr2[10] = "orange";
    int address[3] = {
        rand()%4,
        rand()%4,
        rand()%4
    };

    for(int i=0;i<3;i++){
        printf("%s\n", fruits[address[i]]);
    }

}