//program of table using functions
public class tut5_finctions {
    public static void table(int n) {
        for (int i = 1; i <= 10; i++)
            System.out.println(n * i);
    }

    /*public static int table2(int n) {
        for (int i = 1; i <= 10; i++) {
            int table = i * n;
            return table;
        }
    }*/

    public static void main(String[] args) {
        table(5);
    }
}
