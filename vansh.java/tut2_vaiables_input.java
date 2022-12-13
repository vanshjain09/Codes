import java.util.*;
public class tut2_vaiables_input {
    public static void main(String[] args) {
    //to print simple star pattern
    //1
    System.out.print("*\n**\n***\n****\n");
    //2
    System.out.println("*");
    System.out.println("**");
    System.out.println("***");
    // variables 
    int a = 50;
    String x=" vansh jain";
    System.out.println(a+x);
    //input from user
    Scanner cs =new Scanner(System.in);
    //String name=sc.next();
    //System.out.println(name);
    // to enter a whole string with space also
    String full_name=cs.nextLine();
    System.out.println(full_name);
}

}
