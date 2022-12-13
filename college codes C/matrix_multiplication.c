#include <stdio.h>
main()
{
    int a[2][3], b[3][3], c[2][3];
    int i, j, k;
    printf("Enter values for matrix A\n");
    for (i = 0; i <= 1; i++)
    {
        for (j = 0; j <= 2; j++)
        {
            scanf("%d", &a[i][j]);
        }
    }
    printf("Enter values for matrix B\n");
    for (i = 0; i <= 2; i++)
    {
        for (j = 0; j <= 2; j++)
        {
            scanf("%d", &b[i][j]);
        }
    }

    for (i = 0; i <= 1; i++)
    {
        for (j = 0; j <= 2; j++)
        {
            c[i][j] = 0;
            for (k = 0; k <= 2; k++)
            {
                c[i][j] = c[i][j] + a[i][k] * b[k][j];
            }
        }
    }

    for(i=0;i<=1;i++)
    {
        printf("\n");
        for(j=0;j<=2;j++)
        {
            printf("%d\t",c[i][j]);
        }
    }
}