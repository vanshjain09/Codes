
public class static_variables {
    static int a=0;
    static int b=0;
    static{ // static block runs once when class is loaded
        System.out.println("i am  in block");
    a=5;
    b=a*5;
} // this static variable are reinintialized in a block

public static void main(String[] args) {
   static_variables sv1 = new static_variables();
   System.out.println(sv1.a + "  " +sv1.b);
   sv1.b+=3;
   static_variables sv2 = new static_variables();

   System.out.println(sv2.a + "  " +sv2.b);


}
    
}