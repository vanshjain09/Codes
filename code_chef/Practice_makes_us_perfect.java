import java.util.Scanner;

public class Practice_makes_us_perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p[] = new int[4];
        int count = 4;
        for (int i = 0; i < 4; i++) {
            p[i] = sc.nextInt();
            if (p[i] < 10)
                count -= 1;
        }
        System.out.println(count);

    }

}