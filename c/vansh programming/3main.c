#include <stdio.h>
int main()
{
    int a, b;
    printf("Enter the value of number\n");
    scanf("%d", &a);
    if (a % 2 == 0)
    {
        printf("%d is even\n", a); //if function use
    }                              //else block use to degtermine wheather a function odd or even
    else                            //don't use semicolan after if condition
    {
        printf("%d is odd\n", a);
    }
    //program for eligibility for licence
    int age;
    printf("Entere your age\n");
    scanf("%d\n", &age);
    if (age > 18)
    {
        printf("You are eligible\n");
    }
    else
    {
        printf("You are not eligible\n");
    }
    int run;
    printf("Enter the run\n");
    scanf("%d\n", &run);
    if (run == 50)
        
    {
        printf("Half century");
    }
    else
    {
        printf("not a half century");
    }

    int price;
    printf("Enter the  price\n");
    scanf("%d\n", &price);
    if (80 <=price && price >= 82)
        
    {
        printf("Don.t buy it\n");
    }
   else
    {
      printf("buy it\n");
    }
    return 0;
}