
import java.util.*;
import java.lang.*;
import java.io.*;
class averageFlex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int u = 0; u < t; u++) {
            int max, min = 0;
            int boast = 0;
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int m = 0; m < n; m++) {
                a[m] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                max = 0;
                min = 0;
                int target = a[i];
                for (int j = 0; j < n; j++) {
                    if (a[j] > target && j!=i)
                        max += 1;
                    else if (a[j]<=target && j!=i)
                    min++;
                }
                if (min>max)
                    boast += 1;
            }
            System.out.println(boast);
        }
    }
}
