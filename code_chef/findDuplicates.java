
public class findDuplicates {
public static void main(String[] args) {
    int a[] = {1,2,3,1};
    int flag =0;
     bubbleSortAscending(a);
     for(int i =0;i<a.length-2;i++){
        if (a[i]==a[i+1]){
            flag=1;
            break;
        }
    }
    if (flag==1) System.out.println("yes");
    else System.out.println("NO");
    
}
static int[] bubbleSortAscending(int[] arr) {
    int temp = 0;
    int check = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 1; j <= arr.length - i - 1; j++) {
            if (arr[j] < arr[j - 1]) {
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            } else {
                check++;
                continue;
            }
        }
        if (check == arr.length - 1)
            break; // if array is sorted to save the further iterations

    }
    return arr;
}
    
}