import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;
public class createBTree{
    static Scanner sc = new Scanner(System.in);
public static class node {
    int data;
    node left;
    node right;
    node(int data){
        this.data = data;
        this.left=null;
        this.right =null;
    }
}
    public static node buildtree(){
        node root =null;
        System.out.println("Enter data:");
        int data = sc.nextInt();
        if(data==-1) return null;
        root = new node(data);
        System.out.println("Enter data for inserting in left of"+data+":");
        root.left = buildtree();
        System.out.println("Enter data for inserting in right of"+data+":");
        root.right = buildtree();
        return root;
    }
    //level order traversal 
    public static void levelorder(node root){
    Queue<node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int count = q.size();
            for(int i=0;i<count;i++){
                root = q.remove();
                System.out.print(root.data +" ");
                
                if(root.left!=null) q.add(root.left);
                if(root.right!=null) q.add(root.right);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
       node result = buildtree();
       //input 1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1
       levelorder(result);

    }
}

