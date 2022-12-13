public class string_01 {
public static void main(String[] args) {
    
String name = "Vansh Jain";
// to chech is two ref. var. pointing to same object(== is used)
// == is a comparitor
String a = "star";
String b ="star";
System.out.println(a==b);

// creation of diff. variable having different object location
String c = "cat";
String my_pet= new String("cat");
System.out.println(c==my_pet);
// to check by value we use equals method
System.out.println(c.equals(my_pet));

// to access the characters of string
System.out.println(c.charAt(0));



}
}
