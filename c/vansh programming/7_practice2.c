//Write a program contain function which counts the number of positive integer in a array
#include<stdio.h>
void count(int arr[],int n)
{
    int count=0,i;
    for(i=0;i<n;i++)
    {
        if(arr[i]>0)
        count=count+1;
        
        else if(arr[i]<0)
        continue;
    }
    printf("No. of positive integer in your array is %d\n",count);
}

void main()
{
int arr[]={1,2,-3,4,5,6,-7,8,9,10};
count(arr,10);
}