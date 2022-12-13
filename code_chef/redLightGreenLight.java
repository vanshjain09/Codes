import java.util.Scanner;

public class redLightGreenLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int min_shots = 0;
            int n = sc.nextInt();
            int k = sc.nextInt();
            int height[] = new int[n];
            for (int j = 0; j < n; j++) {
                height[j] = sc.nextInt();
            }
            for (int m = 0; m < n; m++) {
                if (height[m] > k)
                    min_shots += 1;
            }
            System.out.println(min_shots);
        }
    }

}