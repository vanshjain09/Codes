public class binarySearch {
    public static void main(String[] args) {
        int a[] = {99,99,98,77,44,22};
        int target = 999;
        //System.out.println(binarySearch(a, target));
        System.out.println(orderAgnosticBinarySearch(a, target));
    }

    // return index
    // return -1 if it does not exist
    // function for increasing sorted array
    static int binarySearch(int a[], int target) {
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

        }
        return -1;
    }
    // function for sorted array wheather it is increasing or desending
    static int orderAgnosticBinarySearch(int a[], int target) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            if (a[0] < a[a.length - 1]) {
                int middle = start + (end - start) / 2;
                if (target > a[middle])
                    start = middle + 1;
                else if (target < a[middle])
                    end = middle - 1;
                else
                    return middle;
            } else if (a[0] > a[a.length - 1]) {
                int middle = start + (end - start) / 2;
                if (target > a[middle])
                    end = middle - 1;
                else if (target < a[middle])
                    start = middle + 1;
                else
                    return middle;
            }
        }return -1;

    }
}
