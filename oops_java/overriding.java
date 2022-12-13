
class Shape{
   public void area(){
        System.out.println("Area Function in parent class");
    }
}
class Triange extends Shape{
    @Override
    public void area(){
        System.out.println("Area Function in Triangle class");
    }
}
class Circle extends Shape{
    @Override  /*to check a method is overridden or not put @override over it if it doesn't 
    give any error it is overriding   */
    public void area(){
        System.out.println("Area Function in Circle class");
    }
}
public class overriding {
    public static void main(String[] args) {
        
        Shape circle = new Circle(); 
    //reference type is of parent class and object is of sub class
    // in this case it is compulsory that parent class having func area  
        circle.area(); // this will call area of circle class which is overriding Shape(parent class)
    }
}
