public class DL_1 {
    node head;
    class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
       /*node(int data,node next,node prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }*/
    }
    //insert elements on front side
    public void insertFirst(int value){
        node newnode=new node(value) ; 
        newnode.next=head;
        newnode.prev=null;
        if(head!=null)  head.prev=newnode;
        head=newnode;
    }
    //insert elenments inlast
    public void insertlast(int value){
        node newnode = new node(value);
        if(head==null){
            head=newnode;
            return;
        }
        node last = null;
        node current = head;
        while(current!=null){
            last=current;
            current=current.next;
        }
        last.next=newnode;
        newnode.prev=last;
        newnode.next=null;
        }
    //insert after a particular value
    public void insert(int after,int value  ){
        node newnode = new node(value);
        node current = head;
        if(head==null){
            head=newnode;
            return;
        }
        while(current.data!=after){
            current=current.next;
        }
        newnode.next=current.next;
        current.next=newnode;
        newnode.prev=current;
        if(newnode.next!=null) newnode.next.prev=newnode;

    }
    //reversal print of list
    public void reverseprint(){
        node last=null;
        node current = head;
        while(current!=null){
            last=current;
            current=current.next;
        }
        while(last!=null){
            System.out.print(last.data + "->");
            last=last.prev;
        }
        System.out.print("null");
    }
    //function to print list in straight order
    public void print() {
        node currentnode = head;
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        while (currentnode != null) {
            System.out.print(currentnode.data + "-->");
            currentnode = currentnode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        DL_1 list = new DL_1();
        list.insertFirst(25);
        list.insertFirst(56);
        list.insertlast(999);
        list.insert(999, 1000);
        list.print();
        list.reverseprint();
    }
}
