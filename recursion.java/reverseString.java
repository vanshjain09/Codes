public class reverseString {
    public static void main(String[] args) {
        reverse("vansh",4);
        reversenumto1(5);
    }
    static void reverse(String s,int length){
        if (length<0) return;
        System.out.print(s.charAt(length));
        reverse(s, length-1);
    }
    static void reversenumto1(int n){
        if(n==0) return;
        reversenumto1(n-1);
        System.out.println(n);
    }
}
//to print 1,2,3,4,5 we have give n=5
//so first of all functins are caller then print

