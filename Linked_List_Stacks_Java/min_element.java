//function to find min element in stack using suppoting
//stack(i.e extra memory)
//three function needed
// push pop getmin accordingly
import java.util.Stack;

public class min_element {
    public static Stack<Integer> stk = new Stack<>();
    public static Stack<Integer> ss = new Stack<>();

    public static int getMin() {
        if(ss.isEmpty()) return -1;
        return ss.peek();
    }
    public static void push(int a){
        stk.push(a);
        if(ss.size()==0 || ss.peek()>=a) {
            ss.push(a);
            return;
        }
    }
    public static void pop(){
        stk.pop();
        if(stk.peek()==ss.peek()){
            ss.pop();
            return;
        }
        
    }
    public static void main(String[] args) {
        int arr[] = { 18, 19, 29, 15, 16 };
        for(int i=0;i<arr.length;i++) {
            push(arr[i]); 
            System.out.println(ss.peek());
        }
        System.out.println(getMin());

        
    }

}