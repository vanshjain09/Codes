import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElementArray {
    // nearest greater to right
    public static int[] nextGreater(int arr[]) {
        int nge[] = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (stk.isEmpty() == true) {
                nge[i] = -1;
            } else if (stk.size() > 0 && arr[i] < stk.peek()) {
                nge[i] = stk.peek();
            } else if (stk.size() > 0 && arr[i] > stk.peek()) {

                while (stk.size() > 0 && arr[i] > stk.peek())
                    stk.pop();

                if (stk.isEmpty())
                    nge[i] = -1;
                else
                    nge[i] = stk.peek();
            }
            stk.push(arr[i]);
        }
        return nge;
    }

    // nearest greater to left
    public static int[] leftgreater(int arr[]) {
        int nge[] = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty())
                nge[i] = -1;
            else if (stk.size() > 0 && arr[i] > stk.peek()) {
                while (stk.size() > 0 && arr[i] > stk.peek())
                    stk.pop();

                if (stk.isEmpty())
                    nge[i] = -1;
                else
                    nge[i] = stk.peek();
            } else if (stk.size() > 0 && arr[i] < stk.peek()) {
                nge[i] = stk.peek();
            }
            stk.push(arr[i]);
        }
        return nge;
    }

    // nearest smaller to left
    public static int[] leftsmaller(int arr[]) {
        int nse[] = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty())
                nse[i] = -1;
            else if (stk.size() > 0 && arr[i] > stk.peek()) {
                nse[i] = stk.peek();
            } else if (stk.size() > 0 && arr[i] < stk.peek()) {
                while (stk.size() > 0 && arr[i] < stk.peek())
                    stk.pop();

                if (stk.isEmpty())
                    nse[i] = -1;
                else
                    nse[i] = stk.peek();
            }
            stk.push(arr[i]);
        }
        return nse;
    }

    // next smaller to right
    public static int[] rightsmaller(int arr[]) {
        int nse[] = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (stk.isEmpty())
                nse[i] = -1;
            else if (stk.size() > 0 && arr[i] > stk.peek())
                nse[i] = stk.peek();
            else if (stk.size() > 0 && arr[i] < stk.peek()) {
                while (stk.size() > 0 && arr[i] < stk.peek())
                    stk.pop();

                if (stk.isEmpty())
                    nse[i] = -1;
                else
                    nse[i] = stk.peek();
            }
            stk.push(arr[i]);
        }
        return nse;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4 };
        System.out.println(Arrays.toString(nextGreater(arr)));
        System.out.println(Arrays.toString(leftgreater(arr)));
        System.out.println(Arrays.toString(leftsmaller(arr)));
        System.out.println(Arrays.toString(rightsmaller(arr)));
    }
}
