#include<stdio.h>
main(){
   int a[5]={1,2,55,66,34};
    printf("value of 2 and 3 variable is %d and %d\n",a[1],a[2]);
  
  //TAKING INPUT FROM USER OF VARIABLES  AND PRINTING OUTPUT
  /*char b[10];
  printf("enter 10 characters\n");
  for (char i = 0; i <= 9; i++)
  {
      scanf("%c",&b[i]);
  }
    
  for (char i = 0; i <=9; i++)
  {
      printf("Entered characters are %c\t",b[i]);
  }*/
  
  //WRITE A PROGRAM TO COPY ELEMENTS OF ONE ARRAY INTO OTHER ARRAY
  int b[10] ,c[10];
  printf("Enter 10 numbers\t");
  for(int i=0;i<=9;i++)
          scanf("%d",&b[i]);
  for(int i=0;i<=9;i++)
  {
    c[i]=b[i];
    printf(" %d Elements of c is %d\n",i,c[i]);
  }
}