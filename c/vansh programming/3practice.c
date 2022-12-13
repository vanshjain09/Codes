#include <stdio.h>
int main()
{

    // write a program to find grade of a student acc to marks?
    int marks;
    printf("enter the marks(0-100)\n");
    scanf("%d", &marks);

    switch (marks / 10)

    {
    case 10:
    case 9:
        printf("GRADE A\n");
        break;
    case 8:
        printf("GRADE B\n");
        break;
    case 7:
        printf("GRADE C\n");
        break;
    case 6:
        printf("GRADE D\n");
        break;
    case 5:
        printf("GRADE E\n");
        break;
    default:
        printf("YOU ARE FAIL\n");
        break;
    }
    //calculate income tax as per slabs no tax below 2.5 lakh
    float tax = 0;
    float income;
    printf("enter your income \n");
    scanf("%f", &income);
    if (income >= 250000 && income <= 500000)
        ;                                                                    
    {
        tax = tax + 0.05 * (income - 250000);                 
    }                                                                              
    if (income >= 500000 && income <= 1000000)
        ;                                                                     
    {                                                         
        tax = tax + 0.20 * (income - 500000);
    }                                  
    if (income >= 1000000)           
        
    {
        tax = tax + 0.30 * (income - 1000000);
    }
    printf("your net income tax to be paid is %f\n", &tax);

    //program to check wheather a  year is leap or not ?
    int year;
    printf("Enter the year\n");
    scanf("%d", &year);
    if (((year % 4 == 0) && (year % 100 == 0)) || year % 400 == 0)
        {
            printf("the year is leap\n");
        }
    else
    {
        printf("the year is not leap");
    }
    return 0;
}