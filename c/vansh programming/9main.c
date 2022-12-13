#include<stdio.h>
#include<conio.h>
#include<string.h>
struct student
{
    int rollno;
    char name[10];
    float marks;
};
void main()
{
 struct student s1,s2,s3;
 printf("enter the roll no of student s1\n");
 scanf("%d",&s1.rollno);
  printf("enter the name of student s1\n");
  scanf("%s",s1.name);
  printf("enter the marks of student s1\n");
 scanf("%f",&s1.marks);

 printf("enter the roll no of student s2\n");
 scanf("%d",&s2.rollno);
  printf("enter the name of student s2\n");
  scanf("%s",&s2.name);
  printf("enter the marks of student s2\n");
 scanf("%f",&s2.marks);

 printf("enter the roll no of student s3\n");
 scanf("%d",&s3.rollno);
  printf("enter the name of student s3\n");
  scanf("%s",&s3.name);
  printf("enter the marks  of student s3\n");
 scanf("%f",&s3.marks);

printf("details of s1 %d\t%s\t%f\n",s1.rollno,s1.name,s1.marks);
printf("details of s2 %d\t%s\t%f\n",s2.rollno,s2.name,s2.marks);
printf("details of s3 %d\t%s\t%f\n",s3.rollno,s3.name,s3.marks);

}