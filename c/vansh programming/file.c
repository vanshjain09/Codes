#include <stdio.h>
void main()
{
  int ch;
  FILE *ptr;
  ptr = fopen("D:/file handling/first.txt", "r");
  if (ptr == NULL)
    printf("file not prersent\n");
  else
    printf("file opened\n");
  // reading from a file
  while ((ch = fgetc(ptr)) != EOF)
    printf("%c", ch);
  // reading 2nd method
  do
  {
    ch = fgetc(ptr);
    printf("%c", ch);
  } while
    (ch != EOF);
}
  
  