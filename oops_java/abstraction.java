/* method which doesn't have any body and defined in
parent class to be followed in child class is abstract method*/

//A CLASS HAVING 1 OR MORE ABSTRACT METHOD DECLARED ABSTRACT CLASS

//IF WE KNOW THE METHOD IS OVERRIDDEN IN BY EVERY CLASS IT IS GOOD TO MAKE IT ABSTRACT
abstract class Parent{
abstract void  carrer(String s);
abstract void partner(String s);

static void intro(){ // we can make static mathods in abstract class (call then by subclass or subclass objects or class name)
System.out.println("I am static method in abstract class");
}
// also we can make non static methods 
}
class baby extends Parent{
    @Override
    void carrer(String s){
        System.out.println("I want to become :"+s);
    }
    @Override
    void partner(String s){
        System.out.println("I want to marry with :"+s);
    }
}

public class abstraction {
public static void main(String[] args) {
baby boy = new baby();
boy.carrer("ER.");
boy.partner("LIA");
/*Parent.intro();
baby.intro();
boy.intro();*/

//Parent p1 = new Parent(); not allow to make objects of abstract class
    

}
    
}