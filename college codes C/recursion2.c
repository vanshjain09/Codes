#include<stdio.h>
int sum_dig(int  n){
    int sum=0 ,rem ;
    while(n!=0)
    {
        rem=n%10;
        sum=sum+rem;
        n=n/10;
    }
    return sum;
}
void main()
{
int n=123;
printf("the sum of digit of a number %d is %d",n,sum_dig(n));
}