
public class fibbonacci {
public static void main(String[] args) {
System.out.println(fibbonaci(7));
}
static int fibbonaci(int n){
if(n<2) return n ;
return fibbonaci(n-2)+fibbonaci(n-1);
}
    
}