#include <stdio.h>

int main()
{
   int rows=5;int i ;

   for(int i=1;i<=rows;i++)
   {
       for(int j= 1; j<=i ;j++)
       {
           printf(" ");
       }
       for(int k=i;k<=rows; k++)
       {
           printf("* ");
       }
       printf("\n");
   }
    return 0;
}