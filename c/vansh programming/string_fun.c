#include <stdio.h>
#include <string.h>
#include <conio.h>
void main()
{
    int op, len = 0, len2 = 0, i, j;
    printf("enter the operator to perform 1)string length 2)string copy 3)string catenation\n");
    scanf("%d", &op);
    char a[10], b[10], c[20];
    printf("enter the string A\n");
    scanf("%s", a);

    switch (op)
    {
    case 1:
        for (int i = 0; a[i] != '\0'; i++)
            len++;
        printf("the length of string is %d\n", len);

        break;
    case 2:
        for (int i = 0; a[i] != 0; i++)
        {
            b[i] = a[i];
        }
        printf("copied string is %s\n", b);
        break;

    case 3:
        for (int i = 0; a[i] != 0; i++)
            len++;
        printf("enter string B\n");
        scanf("%s", b);
        for (int i = 0; b[i] != 0; i++)
            len2++;
        for (int i = 0; i < len; i++)
            c[i] = a[i];
        for (i = len + 1; j = 0; i < len + len2)
        {

            c[i] = b[j];
            i++;
            j++;
        }
        c[len + len2] = '\0';
        printf("%s\n",c);

    default:
        break;
    }
}