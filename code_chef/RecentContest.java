import java.util.Scanner;

public class RecentContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int start_38 = 0;
            int lime_108 = 0;
            int n = sc.nextInt();
            String code[] = new String[n];
            for (int i = 0; i < n; i++) {
                code[i] = sc.next();
            }
            for (int k = 0; k < n; k++) {
                if (code[k] == "START38")
                    start_38 += 1;
                else if (code[k] == "LTIME108")
                    lime_108 += 1;
                else
                    continue;
            }
            System.out.println(start_38 + " " + lime_108);
        }
    }
}
