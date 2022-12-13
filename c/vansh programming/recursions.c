#include <stdio.h>
int factorial(int a); // function prototype
int main()
{
    int a;
    printf("enter the number\n");
    scanf("%d", &a);

    printf("The value of factorial %d is %d\n", a, factorial(a)); // function call
    return 0;
}
int factorial(int a)  //function defination
    
{
    int fact = 1;            
    if (a == 1 || a == 0)
    {
        return 1;
    }
    else
    {
        for (int i = a; i >= 1; i--)
            fact = fact * i;
        return fact;
    }
}