import java.util.*;
public class tut2_practice {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
    //finding sum of two numbers
        System.out.println("Enter a and b:");
        int a = x.nextInt();
        int b =x.nextInt();
        System.out.println(a+b);

    // finding area of a circle
    double pi=3.14;
    int r =x.nextInt();
    double area= pi*r*r;
    System.out.println("area of the circle is :"+area);
}
}
