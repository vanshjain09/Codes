import java.util.Scanner;

public class tut7_2d_arrays {
    public static void input_2d_array(int[][] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void output_2d_array(int[][] a) {
        System.out.println("Printing values........");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print( " "+a[i][j] );
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int marks[][]=new int[4][4];
        input_2d_array(marks);
        output_2d_array(marks);


    }
}
