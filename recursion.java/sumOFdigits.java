public class sumOFdigits {//sum of digits
    static int sumOFdigit(int n) {
        int rem = n % 10;
        if (n == 0)
            return 0;
        return rem + sumOFdigit(n / 10);
    }
    static int productOFdigits(int n) { //product of digits
        int rem = n % 10;
        if (n == 0)
            return 1;
        return rem*productOFdigits(n / 10);
    }


    public static void main(String[] args) {
        System.out.println(sumOFdigit(132));
        System.out.println(productOFdigits(132));
    }
}
