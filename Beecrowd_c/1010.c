#include <stdio.h>

int main() {
    int qtd_peca1, cod_prod1, qtd_peca2, cod_prod2;
    float price1, price2, soma;

    scanf("%d%d%f", &cod_prod1, &qtd_peca1, &price1);
    scanf("%d%d%f", &cod_prod2, &qtd_peca2, &price2);
    soma = (qtd_peca1*price1)+(qtd_peca2*price2); 

    printf("VALOR A PAGAR: R$ %.2f\n", soma);

    return 0; 
}