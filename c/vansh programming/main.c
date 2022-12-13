#include <stdio.h>

int main()
{

    printf("Hello World");
    //VARIABLES \ n is used for output in differnt lines %d for integar %f for real no. %c for character

    int a = 4;
    float b = 7.5;
    char c = 'B';
    printf("The value of integer a is %d \n", a);
    printf("%f", b);
    printf("character is %c", c);
    int d = 30;
    printf("Sum of a and d is %d \n", a + d);
    //INPUT from a user (SCANf use)

    int x,y;
    printf("Enter the value of x\n");
    scanf("%d",&x);

    printf("Enter the value of y\n");
    scanf("%d",&y);

    printf("%d",x+y);

        return 0;
}
