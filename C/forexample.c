#include <stdio.h>

int main(){
    
    int num1, num2;
    num1 = 10;
    num2 = 200;
    
    for (int i = 0; i < num2; i++){
        printf("%d + %d = %d\n", num1, num1+1, 2*num1+1);
        num1 = num1+1;
    }
    
    return 0;
}
