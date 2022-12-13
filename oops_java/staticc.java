class Car{
    String brand;
     static int wheels; // here is the static variable
    Car(String s){
        this.brand=s;
        wheels=4;
    }
}

public class staticc {
    public  static void main(String[] args) {
        
        // there are static variable and methods as well
        /*the variables which are object independent(or such kind
        of fact that are same for every object)*/
        Car c1 = new Car("MARUTI");
        System.out.println(c1.brand +"  "+c1.wheels);
        // it is good convention that to access static variables by class name

        //static methods
        // e.g.--> we use main method without creating object of that class

      //greeting();// when we call it show error b/c function is not static and main function is static

      two();
    }
    void greeting(){
        System.out.println("hello!");
        two();  // also we call static functions in non static func :|
    }
    static void two(){
        System.out.println("2");
    }
}

