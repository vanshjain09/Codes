# include <stdio.h>
int main(){
//loops are used to repeat similar part of a code snippet effectively
//like print first 100 numbers //types of loop while loop , do while loop , for loop.
int a;
printf("enter the vaue of a \n");                                      
scanf("%d",&a);
while(a<10){

    printf("%d\n",a);
    a++;
} //write program to print natural no. from 10 to 20 
//int i =0;
//while (i<=20);
//{if (i>=10){
  //  printf("the value of i is %d\n",i);
  //  }
  //  i++;
//}
int x =10;

while (x<=100)
{
    printf("The table of 10 is %d\n",x);
    x+=10;           // += is compound interest 
} 
//do while loop syntax = do{
                     //code
                     //code
                  // } while(condition);
    int i = 0;
    do
    {
        printf("the value of i is %d\n",i);
        i++;
    } while (i<=10);
    // do while loop executes at once without checking condition
    //like we start playing a game using do function and then while function ask for u want play again or not//
 // write a program to print first n natural numbers using do while loop ?
    int a=0;
    int n , i = 0;
    printf("enter the value of n \n");
    scanf("%d",&n);

    do
    {
        printf("the number is %d\n",a+1);
        a++;
    } while (a<n);







    return 0 ;
}