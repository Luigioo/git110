#include <stdio.h>

int multByTwo(int n){
    return n*2;
}
int isFirstBigger(int a, int b){
    return a>b;
}
float addVat(float n){
    float y = n*n+2*n+1;
    return y;

}

int f(int x){
    return x*x+2*x+1;
}

void hello(){

}

int main(){
    int x = 2;
    int y= f(10);

    printf("%d\n", multByTwo(23));
    printf("%d\n", isFirstBigger(23, 24));
    printf("%d\n", isFirstBigger(55, 24));
    printf("%f\n", addVat(3.0));

    return 0;
}