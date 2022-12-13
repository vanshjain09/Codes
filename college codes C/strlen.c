#include<stdio.h>
void main()
{
    char a[10],len=0,i;
    printf("enter a string\n");
    gets(a);
    for(i=0;a[i]!='\0';i++)
    {
    len++;
    }
    printf(" Length of string is %d\n",len);
}
