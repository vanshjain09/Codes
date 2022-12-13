import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {-32,-1,1,32,0};
        System.out.println(Arrays.toString(bubbleSortAscending(arr)));
        System.out.println(Arrays.toString(decreasingBubblesort(arr)));
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

    static int[] decreasingBubblesort(int a[]) {
        int check = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j] > a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                } else {
                    check++;
                    continue;
                }
            }
            if (check == a.length - 1)
                break;
        }
        return a;
    }
}
