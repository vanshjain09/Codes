
import java.util.Scanner;

public class makeAllEqual {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int t = sc.nextInt();
for(int x=0;x<t;x++){
    int n_operation=0;
    int n=sc.nextInt();
    int a[]=new int[n];
    for (int i = 0; i <n; i++) {
        a[i]=sc.nextInt();
    }
    for (int j= 0; j < n; j++) {
        if (a[0]!=a[j])
        n_operation+=1;
        else
        continue;
    }System.out.println(n_operation);
}
}
}
