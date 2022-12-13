#include<stdio.h>
struct pointers_structure
{
 int x;
 float y;
}p={2,23};

void main(){
   struct  pointers_structure*ptr;
ptr=&p;
printf("first element id %d\n",ptr->x);
printf("second element is %f\n",ptr->y);
}