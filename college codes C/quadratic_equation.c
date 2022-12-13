#include<stdio.h>
#include<math.h>

int main(){
    float a, b ,c;  //a,b,c are cofficient of quadratic equation
    float r1 , r2, d;

    printf("Enter a,b ,c of quadratic eq.\n");
    scanf("%f %f %f",&a,&b,&c);
    d=b*b-4*a*c;

if(d>0)   //condition for real and differnt roots
{
   r1 = (-b+sqrt(d)) / (2*a);
   r2 = (-b-sqrt(d))/(2*a);
   printf("the value of roots is %f and %f\n",r1,r2);
}
else if (d==0)   //condition for real and equal roots 
{
   r1 = r2 = -b/(2*a);
   printf("r1 = r2 = %f\n",r1);
}
else         //if roots are not reaal
{
printf("Roots are imaginery\n");
}

   return 0 ;
}