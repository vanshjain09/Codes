//Q)input a linked list and delete elements have value greater than 25
import java.util.Scanner;
public class LL_4 {
Scanner sc = new Scanner(System.in);
    node head;
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void adlast(){
        int value = sc.nextInt();
        node newnode = new node(value);
        if(head==null){
            head=newnode;
            return;
        }
        node currentnode = head;
        while(currentnode.next!=null){
            currentnode=currentnode.next;
        }
        currentnode.next=newnode;
    }
    void deletemoreThan25(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        node currentnode=head;
        while(currentnode.next!=null){
        if(head.data>25){
            head=head.next;
        }
        if(currentnode.next.data>25){
            currentnode.next=currentnode.next.next;
            currentnode=head;
            continue;
            }
        currentnode=currentnode.next;
        }
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
    public static void main(String[] args) {
        LL_4 list = new LL_4();
        for(int i =0;i<5;i++){
            list.adlast();
        }
        list.deletemoreThan25();
        list.print();
        
    }
    
}
