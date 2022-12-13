//Q1)make a LL and add 1,5,7,3,8,2,3 search for 7 and display its index
import java.util.*;

public class LL_1 {
    Scanner sc = new Scanner(System.in);
    node head;
    private int index=0;
    LL_1(){
        this.index=0;
    }
    
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void add(){
        int value = sc.nextInt();
        node newnode = new node(value);
        if(head==null){
            head=newnode;
            return;
        }
        node currentnode=head;
        while(currentnode.next!=null){
            currentnode=currentnode.next;
        }
        currentnode.next=newnode;
    }
    
    void search(int n){
        node currentnode=head;
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        while(currentnode.data!=n && currentnode!=null){
            currentnode=currentnode.next;
            index++;
        }
        System.out.println(index);
    }
    public static void main(String[] args) {
        LL_1 list = new LL_1();
        for (int i = 0; i <7; i++) {
            list.add();
        }
        list.search(7);
        
    }
}
