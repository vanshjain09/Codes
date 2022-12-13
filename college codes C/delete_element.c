#include<stdio.h>
main(){
    int a[10],b[9];
    int position,i,j;
    printf("Enter elements for array a \n");
    for(i=0;i<=9;i++){
             scanf("%d",&a[i]);
    }
    printf("enter which position element to be deleted\n");
     scanf("%d",&position);
     for( j=position;j<=9;j++){
         a[j]=a[j+1];
     }
     printf("The updated array is:\n");
     for(i=0;i<9;i++)
     {
         printf("%d\t",a[i]);
     }
}