
import java.util.*;

public class tut4_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println("enter 1 for continue and 0 for break");
            int x = sc.nextInt();
            if (x == 1) {
                System.out.println("enter marks:");
                int marks = sc.nextInt();
                if (marks >= 90)
                    System.out.println("This is good");
                else if ( marks<=89 && marks >= 60)
                    System.out.println("This is also good");
                else if (marks<=59 && marks >= 0)
                    System.out.println("This is good as well");
            } else if (x == 0)
                break;

        }

    }
}
