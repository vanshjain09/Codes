import java.util.Scanner;
public class tut3_conditional {
public static void main(String[] args) {
Scanner x= new Scanner(System.in);
 
// if else statements for license eligibility
System.out.println("enter your age:");
int age=x.nextInt();
if (age>18)
System.out.println("you are eligible for license :)");
else
System.out.println("you are not eligible :( apply after "+(18-age)+" years");

//switch case
int button = x.nextInt();
switch(button) {
    case 1: System.out.println("Hello!");
    break;
    case 2: System.out.println("namastey!");
    break;
    case 3: System.out.println("bonjour!");
    break;
    default: System.out.println("invalid input!");
}
}
}
