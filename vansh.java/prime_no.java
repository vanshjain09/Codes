import java.util.*;
public class prime_no {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);  
System.out.println("enter no. for checking:");
int x = sc.nextInt();
int factor=0;
for(int i=1;i<x;i++){
    if(x%i==0)
    factor+=1;
    else
    continue;
}
if (factor>1)
System.out.println("no. is composite");
else if(factor==1)
System.out.println("no. is prime");

}
}