#include<stdio.h>
void main(){
    int pass;
    printf("enter 2 if you passed both\n");
    printf("enter 1 if you passed 1\n");
    scanf("%d",&pass);
    if(pass==2)
    printf("YOU GET 45rs as gift\n");
    else if (pass==1)
    printf("You get 15rs as gift\n");
    else
    printf("you get nothing\n");
}