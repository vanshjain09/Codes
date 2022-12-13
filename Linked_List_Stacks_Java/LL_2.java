//to insert the element on the given index
public class LL_2 {
    node head;

    class node {
        int data;
        node next;

        node(int data,node n) {
            this.data = data;
            this.next = next;
        }
        node(int data){
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

    public void insert(int index, int value) {
        if (index==0) {
            addFirst(value);
            return;
        }
        node currentnode = head;
        for (int i = 1; i < index; i++) {
            currentnode = currentnode.next;
        }
        node newnode = new node(value,currentnode.next);
        currentnode.next = newnode;
    }

    public void print() {
        node currentnode = head;
        if (head == null) {
            System.out.print("List is empty");
        }
        while (currentnode != null) {
            System.out.print(currentnode.data + "-->");
            currentnode = currentnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL_2 list = new LL_2();
        list.addFirst(5);
        list.addFirst(10);
        list.print();
        list.insert(0, 50);
        list.print();
    }
}
