import java.util.Stack;

public class balanced_bracket {

    public static boolean isbalanced(String s) {
        Stack<Character> stk = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stk.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stk.peek() != '(')
                    return false;
                if (stk.isEmpty())
                    return false;
                else
                    stk.pop();
            } else if (s.charAt(i) == '}') {
                if (stk.peek() != '{')
                    return false;
                if (stk.isEmpty())
                    return false;
                else
                    stk.pop();
            } else if (s.charAt(i) == ']') {
                if (stk.peek() != '[')
                    return false;
                if (stk.isEmpty())
                    return false;
                else
                    stk.pop();
            } else
                continue;
        }
        if (stk.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isbalanced("{[()]}"));
    }
}
