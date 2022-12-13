public class SUM1toN {

static int func1(int start,int n){ //sum 1 to N
    if(start==n) return  n;
   return start+func1(start+1, n);
}
static int func2(int n){//sum N to 1
    if(n==0) return 0;
    return n+func2(n-1);
}
public static void main(String[] args) {
System.out.println(func1(1,5));
System.out.println(func2(5));
}
}
