class LL{
    node head;
    private int size;
    LL(){
        this.size=0;
    }
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
            size++; //increment size when creating node
        }
    }
    //to add element on front of list
    public void addFirst(int data){
      node newnode = new node(data);
      if(head==null){
        head=newnode;
        return;
      }
      newnode.next=head;
      head=newnode;
}

    // to add element in last
    public void addlast(int data){
        node newnode = new node(data);
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
    //printing the list
    public void print(){
        node currentnode = head;
        if(head==null){
            System.out.print("List is empty");
        }
        while(currentnode!=null){
            System.out.print(currentnode.data+"-->");
            currentnode=currentnode.next;
        }
        System.out.println("NULL");
    }
    //deleting from front side
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is already empty\n");
            return;
        }
         size--;//decremeent in size
         head=head.next;
    }
    //deleting from back side
    public void deletelast(){
        node secondLast = head;
        node last =head.next;
        if(head==null){
            System.out.println("List is already empty\n");
            return;
        }size--;
        if(head.next==null){
            head=null;
            return;
        }
        while(last.next!=null){
          last=last.next;
          secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public void getsize(){
        System.out.println(size);
    }
    public static void main(String[] args) {
     LL list = new LL();
     list.addFirst(5); //5
     list.addFirst(10); // 10 , 5
     list.addlast(20);
     //list.deleteFirst();
     //list.deletelast();
     list.print();
     list.getsize();
     
    }

    
}