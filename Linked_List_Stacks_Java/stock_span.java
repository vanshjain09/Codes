import java.util.Arrays;
import java.util.Stack;

class Pair {

    int key;
    int value;

    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class stock_span {

    public static void span(int[] arr) {
        Stack<Pair> stk = new Stack<>();
        int nge[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty())
                nge[i] = -1;
            else if (stk.size() > 0 && stk.peek().key > arr[i])
                nge[i] = stk.peek().value;
            else if (stk.size() > 0 && stk.peek().key < arr[i]) {
                while (stk.size() > 0 && stk.peek().key < arr[i]) {
                    stk.pop();
                }
                if (stk.isEmpty())
                    nge[i] = -1;
                else
                    nge[i] = stk.peek().value;
            }
            Pair p = new Pair(arr[i], i);
            stk.push(p);
        }
        for (int i = 0; i < arr.length; i++) {
            nge[i] = i - nge[i];
        }
        System.out.println(Arrays.toString(nge));
    }

    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 70, 60, 75, 85 };
        span(arr);
    }
}
