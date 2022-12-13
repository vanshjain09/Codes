package inheritance;
// multiple inheritence is not suppoted in java this is done by intrerfaces


class box{  // class 1 
int l;
int b;
box(int l,int b){
this.l=l;
this.b=b;
System.out.println("i am constructor of box");
}
public void box(){
    System.out.println("I am box class");
}
}
class boxweight extends box{ // class 2 derived from 1
int weight;
boxweight(int l , int b, int weight){
    super(l,b);
    System.out.println("i am constructor of boxweight");
    this.weight=weight;
}
public void box(){
    System.out.println("I am derived from box class");
}
}
class boxprice extends boxweight{  // class 3 derived from 2
    int price; 
    boxprice(int l , int b , int weight , int price){
        super(l,b,weight);
        System.out.println("i am constructor of boxprice");
        this.price = price;
    }
    public void box(){
       System.out.println("I am derived from boxweight class");
    }
}
public class multilevel {
    public static void main(String[] args) {
        boxprice bp = new boxprice(5, 5, 88, 100);
        bp.box(); 
    }
}
