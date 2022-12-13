/*convert 2d array in form  a b c
                              d
                            e f g ----->>>>>and tell the max sum
 */
import java.util.Scanner;

public class veertwoDArray {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int r = sc.nextInt();
int c = sc.nextInt();
int a[][]=new int[r][c];
int max =0;
int sum;

for(int i =0;i<r;i++){
    for(int j =0;j<c;j++){
        a[i][j]=sc.nextInt();
    }
}
for (int i = 0; i < r-2; i++) {
    sum=0;
    for(int j =i;j<c-2;j++){
        sum =a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
        if(sum>max) max=sum;
        sum=0;
    }
}System.out.println(max);
    
}
}
