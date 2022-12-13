import java.util.*;
public class traversals {
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
    static int i =-1;
//we are given array of data and we have to arrange in tree
//preorder to tree
public static node build(int [] arr){
i++;
if(arr[i]==-1) return null;
node newnode = new node(arr[i]);
newnode.left = build(arr);
newnode.right = build(arr);
return newnode;
}
//tree to preorder
public static void preorder(node root){
    if(root==null) {
        System.out.print("-1 ");
        return;
    }
    System.out.print(root.data+" ");   
    preorder(root.left);
    preorder(root.right);

}
//tree to inorder
public static void inorder(node root){
    if(root==null) return;
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
}
//tree to postorder
public static void postorder(node root){
    if(root==null) return;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+" ");
}

public static void main(String[] args) {
    int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    node root = build(nodes);
    preorder(root);
    System.out.println();
    inorder(root);
    System.out.println();
    postorder(root);

}
}
