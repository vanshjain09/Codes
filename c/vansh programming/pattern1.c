#include<stdio.h>
int main()
{
int n ;
printf("The number of lines in which pattern to be printed\n");
scanf("%d",&n);
for(int i=1;i<=n;i++)
{
    for(int j=1 ;j<=i;j++)                                        //triangle 
    {
        printf("*");
    }
    printf("\n");
}

 int rows;
    
    printf("Enter no. of rows :");
    scanf("%d" ,&rows);

    for (int i = rows; i>=1; i--)
    {
        for (int j = 1; j <= i; j++)
        {                                                          /////reverse triangle
            printf("*");
        }
        printf("\n");
    }        



    return 0 ;
}