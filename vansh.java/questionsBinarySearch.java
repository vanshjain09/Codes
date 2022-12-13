public class questionsBinarySearch {
public static void main(String[] args) {
int a[]={2,33,44,55,66};
int target=32;
System.out.println(ceilingElement(a, target));
}
// return the smallest greater element than target element--> ceiling of a no.
// floor of a no.--->> greater no. <= target element (return end if loop is violated)
static int ceilingElement(int []a,int target){
    int start = 0;
    int end = a.length - 1;
    while (start <= end) {
        int middle = start + (end - start) / 2;
        if (target > a[middle])
            start = middle + 1;
        else if (target < a[middle])
            end = middle - 1;
        else
            return middle;

    }return start;
}
}
