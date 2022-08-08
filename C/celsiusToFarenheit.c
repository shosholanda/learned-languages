//importar bibliotecas
#include <stdio.h>

/* print Farenheit - Celsius table */
int main(){
    float fahr, cel;
    float min, max, increm;
    
    min = 0;  //Limite más bajo
    max = 300; //limite más alto
    increm = 20; //incremento de a 20
    
    fahr = min;
    
    printf("La siguiente tabla es una conversión de °F a °C\n");
    while (fahr <= max){
        cel = (5.0/9.0)*(fahr-32);
        printf("%3.0f\t%6.1f\n", fahr, cel);
        fahr = fahr + increm;
    }
    
    printf("La siguiente tabla es una conversión de °C a °F\n");
    cel = 0;
    while(cel <= max){
        fahr = cel*(9.0/5.0) + 32;
        printf("%3.0f \t %6.0f \n", cel, fahr);
        cel = cel + increm;
    }
    return 0;
}

