#include <stdio.h>
#include <stdlib.h>

//testestestasasas
void fibonacciSerisi(int sayi)
{
    int ilkSayi=0;
    int ikinciSayi=1;
    int toplam=0;
    for(int i=0; i<sayi-2; i++)
    {
        toplam=ilkSayi+ikinciSayi;
        ilkSayi=ikinciSayi;
        ikinciSayi=toplam;
        printf("%d\t",toplam);

    }
    printf("\n");

}



int main()
{
    int sayi;
    printf("Kac Adet Fibonacci Sayisi Uretilecek : ");
    scanf("%d",&sayi);
    printf("\n");
    fibonacciSerisi(sayi);

    return 0;
}
