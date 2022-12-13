
public class assignment_functions {
    /*
     * Function 1
      static void maxMinInThree(int a, int b, int c) {
     * if (a > b && a > c) {
     * System.out.println("Max is :" + a);
     * if (b < c)
     * System.out.println("Smallest is:" + b);
     * else if (c < b)
     * System.out.println("Smallest is:" + c);
     * } else if (b > c && b > a) {
     * System.out.println("Max. is : " + b);
     * if (a < c)
     * System.out.println("Smallest is:" + a);
     * else if (c < a)
     * System.out.println("Smallest is:" + c);
     * } else if (c > b && c > a) {
     * System.out.println("Max. is : " + c);
     * if (b < a)
     * System.out.println("Smallest is:" + b);
     * else if (b > a)
     * System.out.println("Smallest is:" + a);
     * }
     * }
     */
    /*
     * Function 2
     * static boolean oddOReven(int n ){
     * if (n%2==0)
     * return true;
     * else
     * return false;
     * }
     */
    /*
     * Function 3
     * static boolean eligibility(int n){
     * if (n>=18)
     * return true;
     * else
     * return false;
     * }
     */

    /*
     * Function 4
     * static void addAndProduct(int x, int y){
     * System.out.println(x+y);
     * System.out.println(x*y);
     * }
     */

    /*
     * Function 5
     * static void area_circum(int r){
     * System.out.println("Parameter of Circle is: "+ 2*3.14*r + "cm");
     * System.out.println("Area od Circle is: "+ 3.14*r*r+ "cm");
     * }
     */
    /*
     * Function 6
     * static boolean primeCheck(int n){
     * int factor=0;
     * for (int i = 1; i < n; i++) {
     * if (n%i==0)
     * factor+=1;
     * }
     * if (factor>1)
     * return false;
     * else
     * return true;
     * }
     */
    /*
     * Function 7
     * static void Factorial(int n){
     * int factorial=1;
     * if (n==1 || n==0)
     * factorial=1;
     * else{
     * for (int i = 1; i <=n; i++) {
     * factorial=factorial*i;
     * }
     * }System.out.println(factorial);
     * 
     * }
     */
    /*
     * Function 8
     * static void palindromeCheck(int n) {
     * int x=n;
     * int rem = 0, num = 0;
     * while (n != 0) {
     * rem = n % 10;
     * num = num * 10 + rem;
     * n = n / 10;
     * }System.out.println(num);
     * System.out.println(x);
     * if (num==x)
     * System.out.println("PALINDROME");
     * else
     * System.out.println("NOT A PALINDROME");
     * }
     */
    /* FUNCTION 9
     * static boolean pythagoreanTriplet(int a , int b, int c){
     * if (a*a+b*b==c*c|| b*b+c*c==a*a||a*a+c*c==b*b)
     * return true;
     * else
     * return false;
     * }
     */
    /* FUNCTION 10
     * static void primeNum(int x , int y){
     * for(int i=x;i<=y;i++){
     * int factor=0;
     * for(int j=1;j<i;j++){
     * if (i%j==0)
     * factor+=1;
     * }
     * if (factor<=1)
     * System.out.println(i);
     * }
     * }
     */
    /*FUNCTION 11
    static void sumTillN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        System.out.println(sum);

    }*/

    public static void main(String[] args) {
        // maxMinInThree(5, 15, 89);
        // System.out.println(oddOReven(8));
        // System.out.println(eligibility(-8));
        // addAndProduct(8, 8);
        // area_circum(7);
        // System.out.println(primeCheck(25));
        // Factorial(1);
        // palindromeCheck(111);
        // System.out.println(pythagoreanTriplet(4, 3, 5));
        // primeNum(1, 10);
        // sumTillN(10);
    }
}
