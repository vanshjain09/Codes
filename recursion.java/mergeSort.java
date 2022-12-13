import java.util.Arrays;

public class mergeSort {

public static void main(String[] args) {
    int a[]={5,4,3,2,1};
    System.out.println(Arrays.toString(mergesort(a)));
}
public static int[] mergesort(int arr[]){
    if(arr.length==1) return arr;
    int mid=arr.length/2;
    int left[]=mergesort(Arrays.copyOfRange(arr, 0,mid));
    int right[]=mergesort(Arrays.copyOfRange(arr,mid, arr.length));

    return merge(left,right);
}

public static int[] merge(int[] left, int[] right) {
    int mix[]=new int[left.length+right.length];
    int i=0,j=0,k=0;
    //merging equals elements in left and right
   while(i<left.length && j<right.length){
        if(left[i]<right[j]){
            mix[k]=left[i];
            i++;
        }
        else{
            mix[k]=right[j];
            j++;
        }
        k++;
   }
   //copy remaining elements
   while(i<left.length){
    mix[k]=left[i];
    i++;
    k++;
   }
   while(j<right.length){
    mix[k]=right[j];
    j++;
    k++;
   }
   return mix;
}
    
}