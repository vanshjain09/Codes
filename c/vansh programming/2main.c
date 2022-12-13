//chapter 2 = Instruction and operators//
#include <stdio.h>
#include <math.h>
int main()
{
    int a = 4; //type declaration instruction

    //     float b = a + 8.9;
    //     float a = 1.1;
    // printf("Valaue of b is %f/n", b); "if we give c value later it give error and execute float b firstly"
    int b = 5;
    //arthimetic instructions
    printf("The value of a+b is %d\n", a + b);
    printf("The value of a-b is %d\n", a - b);
    printf("The value of a*b is %d\n", a * b);
    printf("The value of a/b is %d\n", a / b);

    printf("5 when divided with 2 leaves a remainder of %d\n", 5 % 2); //modular division operator

    printf("5 when divided with 2 leaves a remainder of %d\n", -5 % 2); //sign according to numerator sign
     // IN C LANGUAGE 5*2 IS NOT EQUAL TO 5.2 OR (5)(2)//no operators is assumed
   // IN C LANGUAGE 5^4 IS NOT VALID NO OPERATORS TO PERFORM EXPONENTION

   // printf("The value of 2 to the power 4 is %f\n" pow(2, 4));//if want exponention include math.h 

    //type conversion 
    printf("the value of 6 + 5 is %d\n",6+5);//int and int = int
    printf("the value of 5 + 6.3 is %f\n",5 + 6.3);//int and float is float
    printf("the value of 6.5 + 6.6 is %f\n",6.5 +6.6);//float and float is float
    printf("the value of 5/2 is %d\n",5/2);//int and int = int

    //operator precedence
    int x = 2 , y=3;
    printf("the value of 3*x-4*yis %d\n",3*x-4*y);
    printf("The value of 8*y/3*x is %d\n",8*y/3*x);
   // 40/12=52 in output WHY?//ASSOSIATIVITY- operators of equal priority
   //8*3/3*x=24/6 will give wrong answer
   //24\3*2=8*2=16

   //Control instruction
  // determine the flow of control in a program

    return 0;
}
