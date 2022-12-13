import java.util.Scanner;

public class tut7_practice {
    public static void transpose(int a[][], int b[][]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
                b[j][i] = a[i][j];
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(" " + b[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        transpose(a, b);
    }
}