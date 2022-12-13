#include <stdio.h>
void func(int *x, int y)
{
    for (int i = 0; i < y; i++)
       { printf("%d\t", *x);
    x++;}
}

void printArray(int x[], int y)
{
    int j;
    for (int j = 0; j < y; j++)
        printf("\nthe value of element at %d position is %d", j + 1, x[j]);
}

void main()
{
    int a[10], i;
    printf("Enter elements for array:");
    for (i = 0; i < 10; i++)
        scanf("%d", &a[i]);

    func(&a[0], 10);

    printArray(a, 10);
}