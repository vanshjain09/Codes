#include<stdio.h>
float average(int a,int b,int c);

float farneheit( float celcius);        // function prototype
main(){
    int a=3,b=1,c=4;
    printf("The value of average is %f\n",average(a,b,c));
    
    
}
float average(int a,int b,int c){
      float result;
    result=(float)(a+b+c)/3;
    return result;
}
float farneheit( float celcius){

}