import java.util.Scanner;

public class friendshipTest {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int t=sc.nextInt();
for(int m=0;m<t;m++){
int n = sc.nextInt();
int[] day= new int[n];
for(int i=0;i<n;i++){
    day[i]=sc.nextInt();
}int similarity=0;
for(int x=0;x<n;x++){
    for(int y=0;y<n;y++){
        if (x==y)
        continue;
        if (day[x]==day[y])
        similarity+=1;
        else
        continue;
    }
  
}
if (similarity>0)
System.out.println(n-similarity+1);
else
System.out.println(similarity+n);
}
}
}
