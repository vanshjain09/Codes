import java.util.*;

public class problemInYourDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int count=0;
            int n = sc.nextInt();
            int d[] = new int[n];
            for (int j = 0; j < n; j++) {
                d[j] = sc.nextInt();
                if (d[j] >= 1000)
                    count+= 1;}
            System.out.println(count);
        }

    }
}
