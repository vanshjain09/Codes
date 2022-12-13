//delete element at particular index
public class LL_3 {
    node head;
    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
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
    void delete(int index){
        if(index==0){
            head=head.next;
            return;
        }
        node currentnode = head;
        for (int i =0; i < index-1; i++) {
            currentnode = currentnode.next;
        }
        currentnode.next=currentnode.next.next;
    }
    public static void main(String[] args) {
        LL_3 list = new LL_3();
        list.addFirst(5);
        list.addFirst(50);
        list.addFirst(55);
        list.delete(2);
        list.print();

    }
}
