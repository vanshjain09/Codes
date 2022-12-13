//https://www.geeksforgeeks.org/chocolate-distribution-problem/
import java.util.Arrays;
public class chocolateDistribution {
public static void main(String[] args) {
      int a[]={3, 4, 1, 9, 56, 7, 9, 12};
      int m=5 ;
      int sum=11000;
      Arrays.sort(a);
      System.out.println(Arrays.toString(a));
    for(int i =0;i<=a.length-m;i++){
        if(a[i+m-1]-a[i]<sum) sum = a[i+m-1]-a[i];
    }
    System.out.println(sum);
}
}
