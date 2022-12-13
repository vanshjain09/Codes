import java.util.*;
public class sortStack {
    //insert element in sorted order
    public static void insertsort(Stack<Integer> stk, int element){
        if(stk.isEmpty() || stk.peek()<element) {
            stk.push(element);
            return;
        }
        int temp = stk.pop();
        insertsort(stk, element);
        stk.push(temp);
    }
    //sort a stack and return it
    public static Stack<Integer> sort(Stack<Integer> stk){
        if(stk.isEmpty()) return stk;
        int temp = stk.pop();
        sort(stk);
        insertsort(stk, temp);
        return stk;
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(3);
        stk.push(1);
        stk.push(2);
        stk = sort(stk);
        while(!stk.isEmpty()) System.out.println(stk.pop());
    }
}
