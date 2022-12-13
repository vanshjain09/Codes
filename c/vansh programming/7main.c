#include<stdio.h>
void function(int x)                        //Passing arrays to function
    {
        printf("%d\t",x);
    }
void function2(int *x)
{
    printf("%d\t",*x);//passing arrays to pointers  
}
main()           
{
    int a[10],i;
    printf("enter 10 numbers\n");
    for(i=0;i<10;i++)
    scanf("%d",&a[i]);
printf("your first array is:\n");
for(i=0;i<10;i++)
{
 function(a[i]);
}
 printf("your second array is:\n");

for(i=0;i<10;i++)
{
 
 function2(&a[i]);
}

 }
