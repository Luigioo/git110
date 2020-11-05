#include<stdio.h>

int main(){

    int numbers[10] = { 4, 23, 65, 71, 92, 34, 63, 62, 1, 18 };
    int sortFlag = 1;
    while (sortFlag != 0){
        sortFlag=0;
        for (int k=1; k<10; k++){
            if (numbers[k] < numbers[k-1]){
                int temp = numbers[k];
                numbers[k] = numbers[k-1];
                numbers[k-1] = temp;
                sortFlag=1;
            }
        }
    }
    for(int i=0;i<10;i++){
        printf("%d, ", numbers[i]);
    }


    if(!1<0 && !2<9){

    }
    if(1<0 || 2<9){
        
    }
    
}