
//int [] a == int a[]
import java.util.*;

public class tut6_arrays {
    public static void scan_array(int[] x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for array:");
        for (int i = 0; i < (x.length); i++) {
            x[i] = sc.nextInt();
        }
    }

    public static void print_array(int[] x) {
        System.out.println("Printing values:");
        for (int i = 0; i < (x.length); i++) {
            System.out.println(x[i]);
        }
    }

    public static void add_arrays(int[] x, int[] y) {
        int[] c = new int[x.length];
        System.out.println("Sum of arrays is :");
        for (int i = 0; i < x.length; i++) {
            c[i] = x[i] + y[i];
            System.out.println(c[i]);
        }
    }

    public static void search_number(int x[], int y) {
        for (int i = 0; i < (x.length); i++) {
            if (x[i] == y)
                System.out.println("No. found at index "+i);}
                
    }

    public static void main(String[] args) {
        int[] marks = new int[5];
        int[] marks_2 = new int[5];
        scan_array(marks);
        search_number(marks,5);
    }
}
