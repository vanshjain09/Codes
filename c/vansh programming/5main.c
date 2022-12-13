#include <stdio.h>
void display(); // Function prototype
void goodmorning();
void goodafternoon();
void goodevening();

int sum(int a, int b); // prototype of int function
main()
{
    display(); // function call
    goodmorning();
    goodafternoon();
    goodevening();
    int c;
    c = sum(55, 3); // function call

    printf("Value of c is %d", c);
    int x;
    x = sum(66, 66);
    printf("\nx ki value %d h", x);
}
// function declaration
void display()
{
    printf("this is display\n");
}
void goodmorning()
{
    printf("Good morning ER. VANSH\n");
}
void goodafternoon()
{
    printf("Good afternoon ER. VANSH\n");
}
void goodevening()
{
    printf("Good evening ER. VANSH\n");
}

int sum(int a, int b)
{
    int result;
    result = a + b;
    return result;
}