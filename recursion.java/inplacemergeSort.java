import java.util.Arrays;

//if we do not want to do copy of array as subarray
//this approach reduce space complexity to constant O(1)
public class inplacemergeSort {
    public static void main(String[] args) {
        int a[] = { 5, 4, 3, 2, 1 };
        mergeSort2(a, 0, 4);
        System.out.println(Arrays.toString(a));
    }

    public static void mergeSort2(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort2(arr, start, mid);
            mergeSort2(arr, mid+1 , end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int arr[], int start, int mid, int end) {
        int b[] = new int[end - start +1];
        int i = start;
        int j = mid + 1;
        int k = start;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i != mid) {
            b[k] = arr[i];
            i++;
            k++;
        }
        while (j != end) {
            b[k] = arr[j];
            j++;
            k++;
        }
        for (int k2 = 0; k2 < b.length; k2++) {
            arr[k2] = b[k2];
        }
    }
}
