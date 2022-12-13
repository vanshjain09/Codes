class A{

}

public class instanceof_getClass {
public static void main(String[] args) {
A a = new A();
System.out.println(a instanceof A);  //return boolean value 
System.out.println(a instanceof Object);// every object is instance of object class
System.out.println(a.getClass());
}
}
