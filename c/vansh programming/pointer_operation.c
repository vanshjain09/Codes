#include<stdio.h>
void main(){
    int a=3,b=5;
    int *x,*y;
    x=&a;
    y=&b;
    //addition of a number to a pointer
    printf("%d\n",x);
    x+=2;
    printf("%d\n",x);
    //subtraction of a number to a pointer
    printf("%d\n",y);
    y--;
    printf("%d\n",y);
    //subtraction of one pointer from another
    printf("%u",x-y);
}