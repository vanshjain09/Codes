#include<stdio.h>
void main(){
    int a[10],i,secondmax,max,j;
    printf("Enter 10 numbers:\n");
    for(i=0;i<10;i++)
    scanf("%d",&a[i]);

  max=a[0];
  for(j=0;j<10;j++)
  {
      if(a[j]>max){
      secondmax=max;
      max=a[j];
      }

      else if(a[j]<max && a[j]>secondmax)
      {
          secondmax=a[j];
      }
  }
  printf("second largest element is %d\n",secondmax);
}