#include <stdio.h>                              //sum and basics of 2D array
main()
{
    int a[3][3], i, j, b[3][3], c[3][3];
    printf("Enter value for martrix A:\n");

    for (i = 0; i <= 2; i++)
    {
        for (j = 0; j <= 2; j++)
            scanf("%d", &a[i][j]);
    }
    printf("\n view of matrix A");
    for (i = 0; i <= 2; i++)
    {
        printf("\n");
        for (j = 0; j <= 2; j++)
            printf("%d\t", a[i][j]);
    } // till now viewing of simple 2D array[matrix] A
     printf(" enter values for matrix B\n");
    for (i = 0; i <= 2; i++)
    {
        for (j = 0; j <= 2; j++)
            scanf("%d", &b[i][j]);
    }
    printf("\n view of matrix B");
    printf("\n");
    for (i = 0; i <= 2; i++)
    {
        printf("\n");
        for (j = 0; j <= 2; j++)
            printf("%d\t", b[i][j]);
    } // view of mtrix B

    for (i = 0; i <= 2; i++)
    {
        for (j = 0; j <= 2; j++)
        {
            c[i][j] = a[i][j] + b[i][j];
        }
    }
        printf("view of matrix C");
    for (i = 0; i <= 2; i++)
    {
        printf("\n");
        for (j = 0; j <= 2; j++)
            printf("%d\t", c[i][j]);
    } // view of mtrix C
}
