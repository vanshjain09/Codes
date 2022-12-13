#include <stdio.h>
# include <conio.h>

int main()  //LOGICAL OPERATORS TO SATISFY MULTIPLE SOLUTION
{
    int age;
    int vipPass = 0;
    vipPass = 1 ;
    printf("Enter your age\n");
    scanf("%d", &age);                                   // && and logical operator  , || OR operator  ,! not operator

    if ((age <= 70 && age >= 18) || vipPass==1)
            {
        printf("You can drive\n");
    }
    else
    {

        printf("You can't drive\n");
    }
    // IF ELSE CLAUSE
    int num ; 
    printf("Enter the number\n");
    scanf("%d",&num);

  if(num==1){
      printf("Value of number is 1\n");
  }
  else if(num==2){
      printf("Value of number is 2\n");
  }
  else if(num==3){
      printf("Value of number is 3\n");
  }
  else{
      printf("number is not 1,2 or 3\n");
  }

  //there is also operator presedence in this cases
  //conditional operators syntax : condition ? expression if true: expression if not true;
         int x ;
         printf("Enter the x");
         scanf("%d",&x);

         (x<5)?printf("x is less than 5"):printf("x is more than than 5");
    // switch case (when we have to check a no. against some values)

    int rating ;
    printf("Enter your rating(1-5)\n");
    scanf("%d",&rating);
    switch(rating){
        case 1 : printf("Your rating is 1\n");
          break;
        case 2 : printf("your rating is 2\n");
        break;
        case 3 : printf("your rating is 3\n");
        break ;
        case 4 : printf("your rarting is 4\n");
        break ;
        case 5 : printf("your rating is 5\n");
        break;
        default : printf("invalid rating\n");

            }

    return 0;
}