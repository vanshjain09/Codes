#include<stdio.h>

void change(int a);
float square (float);
int main(){
    int b =66;
    printf("The value of b before change is %d\n",b);
    change(b);
    printf("The value of b aftere change is %d\n",b);
    float a=7,b;
  b=square(a);
  printf("square of %f is %f\n",a,b);

    return 0;
}
void change(int b){
    b=77;
}  
float square (float x){
    float y;
    y=x*x;
    return (y);
}