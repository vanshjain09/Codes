import java.util.Arrays;

public class Queue {
    int end=0;
    private int data[];
    static final int default_size=10;
    Queue(int size){
        this.data=new int[size];
    }
    public boolean isEmpty(){
        return end==0;
    }
    public boolean isFull(){
        return end==data.length-1;
    }
    public void insert(int element){
        if(isFull()) return;
        data[end]=element;
        end++;
    }
    public int delete(){
        if(isEmpty())
        {
            System.out.println("Queue is already empty");
        }
        int removed = data[0];
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    public void peek(){
        System.out.println(data[0]);
    }
    public void printQueue(){
        System.out.println(Arrays.toString(data));
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
       /*  <<<<<TESTING>>>> q.insert(1);
        q.peek();
        q.delete();
        q.insert(2);
        q.peek();
        q.insert(3);
        q.printQueue();*/
    }
    


    
}
