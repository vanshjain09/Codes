
public class checkNoofZeoros {
    static int count =0;
static void check(int n){ //approach 1
    if(n==0) return;
    if(n%10==0) count+=1;
    check(n/10);
}


public static void main(String[] args) {
check(3003);
System.out.println(count);
}
}