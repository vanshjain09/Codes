import java.util.Scanner;
public class theLeadGame {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[]=new int[n];
int sum_a=0;
int b[]=new int[n];
int sum_b=0;
int lead[]=new int[n];
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    b[i]=sc.nextInt();
    sum_a+=a[i];
    sum_b+=b[i];
}
for (int i = 0; i < n; i++) {

    if (a[i]-b[i]>=0)
    lead[i]=a[i]-b[i];
    else if(b[i]-a[i]>=0)
    lead[i]=b[i]-a[i];
}
int max=0;
for (int i = 0; i < n; i++) {
    if (lead[i]>max)
    max=lead[i];
}
if (sum_a>sum_b)
System.out.println("1 "+max);
else if (sum_b>sum_a)
System.out.println("2 "+max);
}
}
