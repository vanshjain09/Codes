#include <stdio.h>
#include <math.h>
void tentimes(int *a)
{
    int b;
    *a = &b;
    *a = b * 10;
}
int main()
{  int a=5;
   
    void tentimes(&a);
    printf("now the value of a is %d\n", a);

    return 0;
}
