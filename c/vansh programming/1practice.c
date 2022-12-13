#include <stdio.h>
int main()
{

    //Q1-write program to find area of rectangle
    int a, b;
    printf("lenght of rectangle is ");
    scanf("%d", &a);

    printf("breath of rectangle is ");
    scanf("%d", &b);

    printf("area of rectangle is %d", a * b);

    //One more method
    int length = 3, breath = 4;
    int area = length * breath;
    printf("area of rectangle is %d\n", area);

    // Q2- write program to find the area of circle
    int radius = 3;
    float pi = 3.14;
    float area2 = pi * radius * radius;
    printf("the area of circle is %f\n", pi * radius * radius);
    printf("area of circle is %f", area2);

    //Q3-write a program to convert celsius to farenheit
    float celsius = 37;
    float far = (celsius * 9 / 5) + 32;
    printf("The value of celsius temprature in farneheit is %f", far);

    //Q4-write a program to covert m to km?
    double m = 3000;
    int km = m / 1000;
    printf("value of 3000 m in km is %d", km);

    //Q5-Find simple interest if principal= 100 rate = 4 time = 1
    int principal = 100, rate = 4, time = 1;
    int simpleintereast = (principal * rate * time) / 100;
    printf("The value of simple interest is % d\n ", simpleintereast);

    return 0;
}
