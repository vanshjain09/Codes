public class binarySearch {
static int bSearch(int a[],int target,int s , int e){
    if(s>e) 
    return -1;
    int middle = (s+e)/2;
    if (a[middle]==target) 
    return middle;
    else if(a[middle]>target) 
    return bSearch(a, target, s, middle-1);
    
    return bSearch(a, target, middle+1, e);
    

}
public static void main(String[] args) {
    int a[]={1,2,3,4,5};
System.out.println(bSearch(a, 4, 0, 4));
}
}
