#include <stdio.h>
int row=3, col=3;
void display(int arr[row][col])
{
    int k,j;
    for (k = 0; k < row; k++)
        printf("\n");
    for (j = 0; j < col; j++)
        printf("%d", arr[k][j]);
}
void main()
{
    int a[3][3], i, j;
    printf("enter values for matrix a:\n");
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
            scanf("%d", &a[i][j]);
    }

    display(a[3][3]);
}