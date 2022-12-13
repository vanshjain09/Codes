import java.util.Scanner;
public class counting_pretty_no {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int t = sc . nextInt();
for (int i = 0; i < t; i++) {
    int preety_no=0;
    int l=sc.nextInt();
    int r=sc.nextInt();
    int num[]=new int[r-l+1];
    for(int j=l,k=0;j<=r && k<num.length;j++,k++){
        num[k]=j;
    }
    for (int j = 0; j < num.length; j++) {
        if (num[j]%10==2 || num[j]%10==3 ||num[j]%10==9)
        preety_no+=1;
    }
    System.out.println(preety_no);
}
}
}
