#include <stdio.h>
int main()
{
    char operator;
    float num1, num2;
    float result = 0;
    printf("Enter the operator(+,-,*,/)\n");
    scanf("%c", &operator);
    printf("enter the num1 and num2\n");
    scanf("%f %f", &num1, &num2);

    switch (operator)
    {
    case '+':
        result = num1 + num2;
        printf("sum of num1 and num2 is %f\n", result);
        break;
    case '-':
        result = num1 - num2;
        printf("subtraction of num1 and num2 is %f\n", result);
        break;

    case '*':
        result = num1 * num2;
        printf("multiplication result of num1 and num2 is %f\n", result);
        break;
    case '/':
        result = num1 / num2;
        printf("division result  of num1 and num2 is %f\n", result);
        break;
    default:
        printf("invalid operator\n");
        break;
    }

    return 0;
}