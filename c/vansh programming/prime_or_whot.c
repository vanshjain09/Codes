#include <stdio.h>
int main()
{
    // TO CHECK WHEATHER THE NUMBER IS PRIME OR NOT
    int n;
    int prime = 0;
    printf("Enter the number to be checked:");
    scanf("%d,&n");
    for (int i = 2; i <=n/2; i++)
    {
        if (n % i == 0)
        {
             printf("Number is not prime\n");
             prime=1;
            break;                                
        }
    }
    if (prime == 0) 
    {
        printf("number is prime");
    }
   

return 0;
}