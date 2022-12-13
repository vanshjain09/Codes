// create a array of size 3*10 containing table of 2,3,4
#include <stdio.h>
void main()
{
    int a[3][10];
    int j = 0, k = 0, n = 0;

    while (j < 10)
    {
        a[0][j] = 2 * (j + 1);
        j++;
    }

    while (n < 10)
    {
        a[1][n] = 3 * (n + 1);
        n++;
    }

    while (k < 10)
    {
        a[2][k] = 4 * (k + 1);
        k++;
    }

    for (int x = 0; x < 3; x++)
    {
        printf("\n");
        for (int y = 0; y < 10; y++)
            printf("%d\t", a[x][y]);
    }
}