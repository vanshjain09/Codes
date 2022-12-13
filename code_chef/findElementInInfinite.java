
public class findElementInInfinite {
public static void main(String[] args) {
    int []a={1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99,111,222,333,444};
    int target=22;
    int x=findElementInInfinite(a, target);
    System.out.println(x);
}
static int findElementInInfinite(int a[],int target){
    int start=0;
    int end=1;
    while(a[start]<= target && a[end]<=target){
        start=end+1;
        end=2*end;
    }   
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target > a[middle])
                start = middle + 1;
            else if (target < a[middle])
                end = middle - 1;
            else
                return middle;

        } return -1;
    }
}
    
