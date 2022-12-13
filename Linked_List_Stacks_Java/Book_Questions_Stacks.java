import java.util.Stack;
public class Book_Questions_Stacks {

//find minimum element in Array using stack
public static int findMin(int [] arr){
    Stack<Integer> main = new Stack<>();
    Stack<Integer> min = new Stack<>();
    main.push(arr[0]);
    min.push(arr[0]);
    for (int i = 1; i < arr.length; i++) {
        if(arr[i]>min.peek()){
            main.push(arr[i]);
            min.push(min.peek());
        }
        if(arr[i]<min.peek()){
            min.push(arr[i]);
            main.push(arr[i]);
        }
    }
return min.peek();
}
//string is palindrome or not
public static boolean isPalindrome(String str){
    Stack<Character> stk = new Stack<>();
    int i=0;
    while( i<str.length()){
        stk.push(str.charAt(i));
        i++;
    }
    int j=0;
    while(j<str.length()){
        if(str.charAt(j)!=stk.peek()) return false;
        stk.pop();
        j++;
    }
    return true;
}


public static void main(String[] args) {
    int a[]={4,1,2,5,3,0};
    System.out.println(findMin(a));
    System.out.println(isPalindrome("cacac"));
}
    
}