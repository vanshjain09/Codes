import java.util.Arrays;
import java.util.Scanner;

public class average_flexApproach2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int m = 0; m < t; m++) {
            int target;
            int boast=0;
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int x = 0; x < n; x++) {
                a[x] = sc.nextInt();
            }
            Arrays.sort(a);
            for (int i = 0; i < n; i++) {
                target = a[i];
                int start = 0;
                int end = n-1;
                int front = 0;
                int back = 0;
                for (int j = 0; j < n; j++) {
                    if (a[j] == target)
                        start = j;
                    else if (a[j] > target){
                        end = j - 1;
                        break;}

                    }
                back = n - 1 - end;
                front = start;
                if (front > back)
                    boast+=1;
            }
            System.out.println(boast);

        }
    }
}
