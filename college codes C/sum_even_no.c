# include<stdio.h>
int main(){
int sum , i ;
for (int i = 1; i <=100 && i%2==0; i++)
{
    sum = sum +i;

}
printf("sum of even numbers from 1 to 100 is %d ",sum);



    return 0 ;
}