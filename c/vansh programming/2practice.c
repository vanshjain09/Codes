#include <stdio.h>
int main(){

//Q1 which of them is invalid?
int a; //b=a; is invalid int b=a; is valid
int v = 3^3;
printf("%d\n",v);//this is valid
//char at = '21 dec';//this is invalid

//Q2 What data type will 3.0/8-2 return?

//this input  return float and its a real no. which is double

//Q3 write a program to determine wheather a no. is divisible by 97 or not ?
int num;
printf("enter the value of number\n");
scanf("%d", &num);
printf("divisibility test returns: %d\n",num%97);

//Q4 explain step by step evolution of 3*x/y-z+k x=2 y=3 z=3 k=1?
int x= 2, y = 3, z= 3, k=1;
int result = 3*x/y-z+k;
//6/y-z+k
//2-z+k
//-1+k
//0
printf("Value of given equatioin is %d",result);

//Q4 3.0 +1 will be integer,floating point or character?
// and = floating point no. beacause float and integer turns into float

    
    return 0;
}
