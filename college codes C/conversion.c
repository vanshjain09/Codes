#include <stdio.h>
int main()
{
    int n=17;
    int i, a[10];
    for (i = 0; n > 10; i++)
    {
        a[i] = n % 2;
        n = n / 2;
    }
    for (i = i - 1; i >= 0; i--)
    {
        printf("%d", a[i]);

    }
    return 0;
}
