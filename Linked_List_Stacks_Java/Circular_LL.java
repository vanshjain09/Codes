public class Circular_LL {
    node head=null;
    node tail=null;
    class node{
        int data;
        node next;
        public node(int value) {
            this.data=value;
            this.next=null;
        }
    }
    //add in first or in last is same in circular linked list
    public void insert(int value){
        node newnode = new node(value);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        tail.next=newnode;
        newnode.next=head;
        newnode=tail;
    }
    //printing ll while current node again becomes head
    public void print() {
    if(head!=null){
        node current = head;
        do {
            System.out.print(current.data+"->");
            current=current.next;
        } while(current!=head);
     System.out.println();
    }
}
    //deletion of element in lineked list
     

    public static void main(String[] args) {
        Circular_LL list = new Circular_LL();
        list.insert(56);
        list.print();
        list.insert(65);
        list.print();

    }
    
}
