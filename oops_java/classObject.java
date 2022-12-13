// class is the named group of properties and function
// class is a template of object
// object is the instance of the class
// class is a logical construct
// object is pysical reality (occupies space in memory)
class Student{
    float marks;
     int rollNo ;
    String name; 
    
}

public class classObject {
    public static void main(String[] args) {
    
    Student student1 = new Student(); // creating object and new allocates dynamic memory at run time
    System.out.println(student1.name); // not initializeed so returning null

    // giving value to a object
    Student student2  = new Student();
    student2.rollNo = 21;
    student2.name="vansh";
    student2.marks= 75;
    System.out.printf("Roll no : %d  ||   Marks : %.2f   ||  Name : %s", student2.rollNo ,student2.marks,student2.name);
    
}}