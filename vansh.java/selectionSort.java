import java.util.Arrays;


public class selectionSort {
    public static void main(String[] args) {
        int a[]={-9,-4,-11};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
        int b[]={3,7,9,10,12};
        selectionSortDescending(b);
        System.out.println(Arrays.toString(b));
     
    }
static void selectionSort(int []a){
    int start=0;
    for(int i=0;i<=a.length-1;i++){
        int last=a.length-i-1;
        int maxIndex = getmaxIndex(a,start,last);
        int temp= a[maxIndex];
        a[maxIndex]=a[last];
        a[last]=temp;
    }
}
static void selectionSortDescending(int []a){
    for(int i=0;i<a.length;i++){
        int last = a.length-i-1;
        int minIndex=getminIndex(a, last);
        int temp=a[minIndex];
        a[minIndex]=a[last];
        a[last]=temp;
    }
}
static int getmaxIndex(int[]a ,int start,int last){
    int max=start;
    for(int i=0;i<a.length;i++){
        if (a[i]>a[max]) max=i;
    }
return max;
}
static int getminIndex(int[]a,int last){
int min_index=0;
int min = 1000;
for (int i=0;i<=last;i++){
if (a[i]<min){
    min=a[i];
    min_index = i;
}
}return min_index;
}
}


