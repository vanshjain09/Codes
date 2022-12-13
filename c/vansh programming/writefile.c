#include <stdio.h>
void main()
{
  int ch;
  FILE *ptr;
  ptr = fopen("D:/file handling/first.txt", "w");
  fputc('O',ptr);
  fputs("P vansh is a pro player",ptr);
}

//some more modes are also
// r+ inititial(vanshjain) put(hello) result =(hellojain)
// w+ initial(vanshjain) puts(hello) result(hello)
//a+ initial(vanshjain) puts(hello) result(vanshjainhello)
