#include <stdio.h>
void display(int *x, int row, int col)
{
    for (int i = 0; i <= row; i++)
    {
        printf("\n");
        for (int j = 0; j <= col; j++)
            printf("%d\t", *((x + i * col)+j));
    }
}
    void main()
    {
        int a[3][3], i, j;
        printf("Enter value for martrix A:\n");

        for (i = 0; i <= 2; i++)
        {
            for (j = 0; j <= 2; j++)
                scanf("%d", &a[i][j]);
        }

         display(a, 3, 4);   
    }