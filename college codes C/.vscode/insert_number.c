#include<stdio.h>
main(){
    int position,x,i,j,k;
    int a[10];
    printf("Enter ten numbers\n");
for(i=0;i<=9;i++){
    scanf("%d",&a[i]);
}
printf("enter new number\n");
scanf("%d",&x);

printf("enter position of new number\n");
scanf("%d",&position);

for(j=9;j>=position;j--)
{
    a[j+1]=a[j];
}
a[position-1]=x;

for(k=0;k<=10;k++)
printf("%d\t",a[k]);

}