public class reversenum {
static String reverse(int n){  //reverse as a string
    if(n==0) return "";
    return n%10 + reverse(n/10);
}
static int rev =0;
static void reverse_num(int n){ //reverse as a Integer
    if(n==0) return ;
     rev = rev*10+n%10;
     reverse_num(n/10);
     
    }
public static void main(String[] args) {
System.out.println(reverse(356));
reverse_num(356);
System.out.println(rev);
}

}
