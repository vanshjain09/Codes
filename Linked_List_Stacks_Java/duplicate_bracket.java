import java.util.Scanner;
import java.util.Stack;
/**
 * balance_bracket
 */
public class duplicate_bracket {
    public static void main(String[] args) {
        System.out.println(balanced());
    }
    public static boolean balanced(){
    Scanner sc = new Scanner(System.in);
    Stack <Character> stk= new Stack <Character> ();
    System.out.println("Enter a string:");
    String s = sc.nextLine();
    
    for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch==')'){
            if(stk.peek()=='(') return true;
            else{
                while(stk.peek()!='('){
                    stk.pop();
                }
                stk.pop();
            }
        }
        else stk.push(ch);
    }
    return false;
}  
    
}