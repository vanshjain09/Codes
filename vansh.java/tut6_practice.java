public class tut6_practice {
    public static void max_min(int a[]) {
        int max = 0, min = 555;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
            else if (a[i] < min)
                min = a[i];
        }
        System.out.println("Max. in array is:" + max + " Min of the array is:" + min);
    }

    public static void is_sorted(int a[]) {
        boolean is_assending = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[i + 1]) {
                is_assending = false;
                break;
            }
        }
        if (is_assending == true)
            System.out.println("Array is sorted in ascendinng order  :)");
        else if (is_assending == false)
            System.out.println("Array is not Sorted in assending order :(");
    }
    
public static void main(String[] args) {
        int a[] = { 44, 55, 22, 43, 11 };
        max_min(a);
        is_sorted(a);
        
    }
}
