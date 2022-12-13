#include <stdio.h>
// pass i variable to function and chech adress is same or not afer function call
void address(int i);

void sumandavg(int a, int b, int *sum, float *avg)
{ // defination along prototype
     *sum = a + b;
     *avg = *sum / 2;
}
int main()
{
    int i = 8;
    printf("the adress of i is %u\n", &i);
    address(i);

    int sum;
    float avg;
    int a = 3, b = 6;
    sumandavg(a, b, &sum, &avg);
    printf("value of sum and average is %d and %f\n",sum,avg);
    return 0;
}

void address(int i)
{
    int *j;
    j = &i;
    printf("adress of i is %u\n", j);
}
