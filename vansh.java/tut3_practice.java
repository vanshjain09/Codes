import java.util.*;
public class tut3_practice {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter two numbers:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Enter \n1>addition\n2>subtraction\n3>multiplication\n4>division\n5>remainder");
    int operator=sc.nextInt();
    switch(operator){
        case 1 : System.out.println(a+b);
        break;
        case 2 : System.out.println(a-b);
        break;
        case 3 : System.out.println(a*b);
        break;
        case 4 : System.out.println(a/b);
        break;
        case 5 : System.out.println(a%b);
        break;
        default : System.out.println("invalid input");
    }
}
}
