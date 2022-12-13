package inheritance;
class parent{
    int height;
    String colour;
    parent(int height,String colour){ //constructor of parent class with arguements
        this.height= height;
        this.colour=colour;
    }
    parent(){   //constructor of parent class without arguements
        height=-1;
        colour="default";
    }
}
// extends keyword is used for inheriting a class
class child extends parent{
    int weight;
    child(){ // simply child constructor without arguements
        this.weight = -1;
    }
    child(int height,String colour, int weight){
        super(height,colour); // calling parent class constructor for arguements or variables in parent class
        this.weight = weight;
    }
}
// when child class use properties of parent class (inheritance)
public class inheritance {
    public static void main(String[] args) {
        
        child c1 = new child();
        System.out.println(c1.weight+" "+c1.height);

        child c2 = new child(5,"black",55);
        System.out.println(c2.weight+" "+c2.height+" "+c2.colour);

        parent father = new parent();
       // System.out.println(parent.weight); //  we does not access child properties with parent class :(
        parent mother = new child();
        // System.out.println(mother.weight); //even now parent class is referring to child contructot
        //but still not able to use child properties

    }
   
}
