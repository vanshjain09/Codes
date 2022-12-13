#include <stdio.h>
#include<conio.h>
void main()
{
    char a[10], b[10],c[20],len = 0,len2=0,j;
    printf("enter string 1\n");
    gets(a);
    for (int i = 0; a[i] != '\0'; i++)
        len++;
    int function;
    printf("enter the function:1)strlen\t2)strcpy\t3)strcat\n");
    scanf("%d", &function);
    switch (function)
    {
    case 1:
        printf("Length of string is %d\n", len);
        break;
    case 2:
        for (int i = 0; a[i] != '\0'; i++)
            b[i] = a[i];
        printf("copied string b is %s\n", b);
        break;
    case 3:
        printf("Enter string B\n");
       gets(b);
        for(int i=0;a[i]!='\0';i++)
        len++;
         for(int i=0;b[i]!='\0';i++)
        len2++;
        for(int i=0;i<len;i++)
        c[i]=a[i];
        for( int i=len+1,j=0;i<len+len2;i++,j++)
        c[i]=b[j];
        c[len + len2]='\0';
       puts(c);
        break;

 default:
        break;
    }
}