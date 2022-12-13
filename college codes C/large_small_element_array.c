#include<stdio.h>
main()
{
    int k,large,i,small;
    int a[10];
    printf("Enter 10 numbers:\t");
    for(k=0;k<=9;k++)
     {
        scanf("%d",&a[k]);
    }
    large = a[0];
    for( i=1;i<=9;i++)
    {
          if(a[i]>large)
          {
              large=a[i];
          }
            
    }
    printf("Largest element is %d \n",large);
    small=a[0];
    for( i=1;i<=9;i++)
    {
        if (a[i]<small)
        {
            small=a[i];
        }
        
    }
    printf("smallest element is %d \n",small);
}  