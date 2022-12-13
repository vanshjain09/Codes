import java.util.Arrays;

public class bubblesort {
    static void swap(int a[],int index1,int index2){
        int temp = a[index1];
        a[index1]=a[index2];
        a[index2]=temp;
        }
    static int[] bubble(int a[],int start,int end){
        if(end==0) return a;
        if(start==end) return bubble(a, 0, end-1);
        if(a[start]>a[start+1])
            swap(a, start,start+1);
        return bubble(a, start+1, end);
}
public static void main(String[] args) {
    int a[]={4,3,2,1,0};
    bubble(a, 0, a.length-1);
    System.out.println(Arrays.toString(a));
}
}
