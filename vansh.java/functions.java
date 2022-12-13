import java.util.Arrays;

public class functions {
    public static void main(String[] args) {
        int a = 80;
        swap(a);
        System.out.println(a);

        int x[] = { 11, 22, 33, 44, 55 };
        change_array(x);
        System.out.println(x[0]);

        printArray(1,2,3,4,5,6);
        varArgs("vansh:", 22,33,44,55);
    }
    // value is passed and no change occured 
    static void swap(int b) {
        b = 40;
    }

    static void change_array(int[] a) {
        a[0] = 90;
    }
    //  variables and arguements
    //>>multiple variable can be passed as arguements
    static void printArray(int ...v){
        System.out.println(Arrays.toString(v));
    }
    //one more function related to this
    static void varArgs(String a, int...v){
        System.out.print(a+Arrays.toString(v));
    }
}
