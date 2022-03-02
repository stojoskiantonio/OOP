#include <stdio.h>

struct Products
{
    char name[100];
    float price;
    float amount;
};

typedef struct Products Products;

void readProducts (Products *s)
{
    scanf("%s %f %f", s->name, &s->price, &s->amount);
}

int main ()
{
    int n;
    float total = 0;
    scanf("%d", &n);
    Products product[100];
    for (int i = 0; i < n; i++)
    {
        readProducts(product + i);
    }

    for (int i = 0; i < n; i++)
    {
        printf("%d. %s\t%.2f x %.1f = %.2f\n", i+1, product[i].name, product[i].price, product[i].amount, product[i].price * product[i].amount);
        total += product[i].price * product[i].amount;
    }

    printf("Total: %.2f", total);
    return 0;
}
