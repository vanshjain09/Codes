#include<stdio.h>
#include<string.h>
struct student
{
    int rollno;
    char name[10];
    float marks;
};
void main(){
    struct student s[20];
    for (int i = 1; i <= 10; i++)
    {
        printf("enter %d student roll no.\n",i);
        scanf("%d",&s[i].rollno);
         printf("enter %d student name\n",i);
        scanf("%s",s[i].name);
         printf("enter %d student marks\n",i);
        scanf("%f",&s[i].marks);
    }
    for(int j=1;j<=10;j++)
    {
        printf("details of s[%d] %d\t%s\t%f\n",j,s[j].rollno,s[j].name,s[j].marks);

    }
    
}