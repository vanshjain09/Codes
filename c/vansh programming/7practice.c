#include <stdio.h>
void reverse(arr[],int n){
  for(int i=n;i>=0;i--)
  printf("%d",a[i]);


}
void main()
{
    //pointer increment operation
    int a[] = {1, 2, 3, 4, 5};
    int *x;
    x = &a[0];
    printf("%d\n", *x);
    x += 2;
    printf("%d\n", *x);
    // program to store table of 5
    int b[10], i, n = 5, j;
    for (i = 0; i<10; i++)
    {
        b[i] = n * (i + 1);
        printf("%d*%d=%d\n", n, i + 1, b[i]);
    }
    //program with function to reverse a array
  int arr[]={1,2,3,4,5,6,7,8,9,10};
  
  reverse(arr,10);
  
}