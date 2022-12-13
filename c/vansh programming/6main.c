//pointer is a variable which stores another variables
#include <stdio.h>
main(){
    int i=8;
   int *j=&i;      //declaration oF pointer
   printf("The value of i=%d\n",i);
   printf("The value of i=%d\n",*j);
   printf("The address of i is %d\n",&i);
   printf("the address of i is %d\n",j);
   printf("The address of i is %u\n",j);
   printf("the value of j /address of i is %d\n",*(&j));
   printf("add of j=%d\n",&j);

int a=55;
int *ptr;
int **ptr2;
ptr=&a;
ptr2=&ptr;
printf("the value of a is %d\n",**ptr2);
}
//pointer to a pointer
//if i address is stored in j then j is pointer of i and adress of j is stored in k so k is pointer to j
//syntax of pointer to pointer is    datatype**k;   k=&j;
 
