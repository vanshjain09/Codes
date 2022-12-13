#include <stdio.h>
void main()
{
    int m, n;
    printf("Enter rows and col:");
        scanf("%d %d", &m ,&n);
    int a[n][m], i, j, b[n][m];
    // taking martrix
    printf("Enter values for matrix:");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
            scanf("%d", &a[i][j]);
    }
    // transposing the matrix
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
            b[i][j] = a[j][i];
    } // reversing
    for (i = 0; i < n; i++)
    {
        printf("\n");
        for (j = m - 1; j >= 0; j--)
            printf("  %d  ", b[i][j]);
    }
}