#include<stdio.h>
main(){
    int n,i;
    int a[]={5,4,3,2,1};
    printf("Enter the number you want to search\n");
    scanf("%d",&n);
    for( i=0;i<=4;i++)
    {
        if (a[i]==n)
        {
            printf("Element found!\n");
            printf("Element is at %d position\n",i+1);
            break;
        }
    }
        if (i>4)
        {
            printf("Element not found!");
        }
        
        
    
}
