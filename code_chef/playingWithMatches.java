import java.util.Scanner;

public class playingWithMatches {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int  t= sc.nextInt();
for(int m =0;m<t;m++){
int a=sc.nextInt();
int b= sc.nextInt();
int sum=a+b;
int match_stick[]= {6,2,5,5,4,5,6,3,7,6};

int n_match_stick=0;
int digit=0;
while(sum!=0){
    digit=sum%10;
    n_match_stick=n_match_stick+match_stick[digit];
    sum=sum/10;
}System.out.println(n_match_stick);
}
}
}
