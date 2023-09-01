#include <stdio.h>
//#define PI 3.14159

int main() {
    float R=0;
    float resul=0;

    scanf("%f", &R);

    resul = (4.0*3.14159*(R*R*R))/3;

    printf("VOLUME = %.3f", resul);


    return 0;
}