import java.util.Arrays;
public class insertion {
    static void swap(int a , int b){
        int temp=a;
        a=b;
        b=temp;
    }
public static void main(String[] args) {
        int a[]={5,4,10,1,6,2};
        int j;
        for (int i = 1; i < a.length; i++) {
            int temp=a[i];
            for (j = i-1; j >=0; j--) {
                if(a[j]>temp) {
                  a[j+1]=a[j];
                }
                else{
                    break;
               }
            }
            a[j+1]=temp;
    }
System.out.println(Arrays.toString(a));
}
}
 