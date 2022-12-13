/* sum of digits of a number
#include<stdio.h>
void main()
{
int n,sum=0,rem;
printf("Enter the number:");
scanf("%d",&n);
while (n!=0)
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
}*/


/*To print the fibbocni series upto n
#include<stdio.h>
void main()
{
    int n,a=0,b=1,c=0;
printf("Enter the length:");
scanf("%d",&n);
printf("%d \n",a);
printf("%d \n",b);
for (int i = 0; i < n-2; i++)
{
    c=a+b;
    b=b+c;
    a=c;
    printf("%d \n ",a);
    printf("%d \n ",b);
}
}*/

