import java.util.*;
public class insertinStack {
//insert element at last in stack
    public static Stack<Integer> insert(Stack<Integer> stk,int element){
        if(stk.isEmpty()){
            stk.push(element);
            return stk;
        }
        int temp=stk.pop();
        insert(stk, element);
        stk.push(temp);
        return stk;
    }
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
   
   
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(2);
        stk.push(3);
        stk=insert(stk, 1);
        while(!stk.isEmpty()) System.out.println(stk.pop());
    }
}
