import java.util.Arrays;
public class circularQueue {
    int front , end=0;
    int size=0;
    int data[];
    static final int default_size=10;
    circularQueue(int size){
        this.data=new int[size];
    }
     public boolean isEmpty(){
        return size==0;
     }
     public boolean isFull(){
        return size==data.length;
     }
     public void insert(int element){
        if(isFull()) {
            System.out.println("Queue is already full");
            return;
        }
        data[end++]=element;
        end=end%data.length;
        size++;
    }
    public int delete(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        int removed = data[front];
        front++;
        front=front%data.length;
        size--;
        return removed;
}
public void printQueue(){
    if(isEmpty()) return;
    int i=front;
    do{
        System.out.print(data[i]+"<-");
        i++;
        i=i%data.length;
    }while(i!=end);
    System.out.println("End");
}
public static void main(String[] args) {
    circularQueue cq = new circularQueue(5);
    cq.insert(1);
    cq.insert(2);
    cq.insert(3);
    cq.insert(4);
    cq.insert(5);
    cq.printQueue();
    cq.delete();
    cq.printQueue();
    cq.insert(1);
    cq.printQueue();
   
    
}
}