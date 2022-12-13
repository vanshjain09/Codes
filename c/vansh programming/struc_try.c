#include <stdio.h>
#include <string.h>

struct student
{
    int rollno;
    char name[10];
    float marks;
};
void main()
{
    int i, j;

    for (i = 1; i < 5; i++)
    {
        struct student s(i);
        printf("enter %d student roll no.\n", i);
        scanf("%d", & s(i).rollno);
        printf("enter name of %d student", i);
        scanf("%s", &s(i).name);
        printf("enter the marks %d student\n", i)
            scanf("%f", &s(i).marks);
    }

        for (j = 1; j < 5; j++)
        {
            printf("%d\n", s(j).rollno);
            printf("%s\n", s(j).name);
            printf("%f\n", s(j).marks);
        }
    
}
