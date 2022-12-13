//fseek() function to moving control at a specific position
//fseek(FILE * stream,long int offset,int whence)   example-fseek(f,0,SEEK_END)

//ftell() tell the byte location of a current position in file pointer
//rewind() function moves the control to beginning of a file
#include <stdio.h>
void main()
{
  int ch;
  FILE *ptr;
  ptr = fopen("D:/file handling/first.txt", "r");
  if (ptr == NULL){
    printf("file not prersent\n");

 }
fseek(ptr,0,SEEK_END);
printf("the size of file is %ld bytes\n",ftell(ptr));
}



  
