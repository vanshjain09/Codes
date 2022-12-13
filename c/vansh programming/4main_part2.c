# include<stdio.h>
int main(){
   

    for (int i = 0; i < 10; i++)
    {
        printf("the value of i is %d\n",i);
    } // syntax for(initialize;test;incrementor decrement){codes}
    
    //write a program to print first n natural numbers using for loops ?
   int n ;
    printf("enter n \n");
    scanf("%d",&n);
    for (int a = 0; a <n; a++)
    {
        printf("the number is %d\n",a+1);
    }
    //case of decramating
    for ( int i = 5; i>0 ; i--)
    {
        printf("%d\n",i);
    }
    //write a program to print n natural numbers in reverse order?
    int num;
    printf("enter num\n");
    scanf("%d",&num);
    for (int i = num; i>0 ; i--)
    {
        printf("the number is %d\n",i);
    }

    //break statement is used to exit the loop irrespective of condition is true or false    
   int i =0;
    do{
        printf("the value of i is %d\n",i);
        if(i==5){
        break;
        }
        i++;
    }
    while(i<10);
    
    

                                   



    return 0 ;
}