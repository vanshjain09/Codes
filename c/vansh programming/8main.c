#include<stdio.h>
#include<string.h>
void main()          // \0 is null character use to end the string
{
/*char str[]={'V','a','n','s','h','\0'}*/
char str[]="Hello"  ;         //another method in c language
//character use 1 byte and string has contiguous memory
char *ptr = str;
while(*ptr!='\0')
{
    printf("%c",*ptr);
    ptr++;
}

}