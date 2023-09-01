#include <stdio.h>

int main() {
    double A, B, C;
    double soma, peso, media;

    scanf("%lf %lf %lf", &A, &B, &C);

    //media = ((A*2 + B*3 + C*5) / 3);
    soma = (A*0.2) + (B*0.3) + (C*0.5);
    //media = soma / 3;
    

    printf("MEDIA = %.1lf\n",soma);

    return 0;
}