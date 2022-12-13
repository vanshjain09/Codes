// program to find sum of ten natural numbers?
#include <stdio.h>
int main()
{
    int sum = 0;
    for (int i = 1; i <= 10; i++)
    {
        sum = sum + i;
    }

    printf("Sum of first natural no. is %d\n", sum);

    int n, table, i;
    printf("Enter the number whose table to be printed\n");
    scanf("%d", &n);
    for (int i = 1; i <= 10; i++)
        
    {
       table= n*i ;

        printf("%d*%d=%d\n", n, i, table);
    }
    return 0;
}