#include <stdio.h>
int main()
{
    //continue statement =control is taken to the next iteration thus skipped everything below continue of that iteration

    int skip = 5, i = 0;
    while (i < 10)
    {
        i++;
        if (i != 5)
        {
            continue;      
        }
        else
        {
            printf("the value of i is %d\n", i);
        }
    }

    //multiplication table of given n?
    int n ,a
    ;
    int table;
    printf("enter n\n");
    scanf("%d",&n);
    for(int i =1;i<=10;i++)
    {
        table=n*i;
     printf("%d*%d=%d\n",n,i,table);   
    }

    return 0;
}