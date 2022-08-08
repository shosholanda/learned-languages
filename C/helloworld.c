#include <stdio.h>

int main(){
    printf("Hola, mundo\t");
    int a;
    scanf("%d",&a  );
    int j = 0;
    for (int i = 1; i <= a; i++){
        j = j + i;
    }
    printf("%d",j);
}
