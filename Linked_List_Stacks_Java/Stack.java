
public class Stack {
    int data[];
    private static final int default_size = 10;
    int ptr=-1;
    Stack(int size){
        this.data = new int[size];
    }
    Stack(){
        this(default_size);
    }
    //push method
    public boolean push(int element){
    if(isFull()){
        System.out.println("Stack is Full");
        return false;
    }
        ptr++;
        data[ptr]=element;
        return true;
    }
    //POP
    public int pop(){
        if(isEmpty()) System.out.println("Stack is empty");
        int removed = data[ptr];
        ptr--;
        return removed;
    }//return element at top of stack
    public int peek(){
        return data[ptr];
    }
    //checks stack is full or not
    public boolean isFull() {
        return ptr==data.length-1;
    }
    //check stack is empty or not
    public boolean isEmpty(){
        return ptr==-1;
    }
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(5);
        s.push(55);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
