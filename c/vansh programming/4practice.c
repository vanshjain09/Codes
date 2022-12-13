#include<stdio.h>
int main()
{
/*int  sum=0, n=10;
int i = 0;
while(i<=n)
{
    sum=sum+i;
    i++;
}
    printf("first ten natural numbers sum is %d",sum); */

//finding factorial of a number
int n,fact=1;

printf("Enter the number:");
scanf("%d",&n);
for(int i=1;i<=n;i++)
{
    fact=fact*i;
}
printf("factorial of %d is %d",n,fact);




return 0 ;

}