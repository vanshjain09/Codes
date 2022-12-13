#include <stdio.h>

struct info
{
    int roll;
    float marks;
} s[3];
int main()
{
    int i, j;

    printf("enter roll no. and marks of student of 1,2 and 3\n");
    for (i = 1; i <= 3; i++)
        scanf("%d %f", &s[i].roll, &s[i].marks);

    for (j = 1; j <= 3; j++)
    {
        printf("roll no. is %d\n", s[j].roll);
    printf("marks is %f\n",s[j].marks);
    }

    return 0;
}
