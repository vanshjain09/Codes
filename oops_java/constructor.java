class Student{
    String name;
    int rollNo;
    Student(String name , int rollNo){ // making constructor
        this.name=name;
        this.rollNo=rollNo;
    }
    Student(Student other){  // constructor overloading                         ||Constructors flow chain
       this.name = other.name;
       this.rollNo = other.rollNo;
    }

    Student(){ // constructur calling constructor
        this("Default", 000);
        //internally-->  Student object = new Student("Default",000);

    }
    void greet(){ // greet function
        System.out.println("Hello ! my name is : "+this.name);
    }
    void changeName(String s){ // changing name in the object
        this.name = s;
    }
}

public class constructor {
    public static void main(String[] args) {
        
        Student s1 = new Student("Vansh",113); // student() is the constructor
        s1.greet();
        s1.changeName("Vansh Jain");
        s1.greet();
        Student s2 = new Student(s1); // s2 is a copy of s1 as per as constructor
        //make a object using default constructor (3rd one cons. calling cons.)
        Student s3 = new Student();
        s3.greet(); // it will get name as default
       
       Student one= new Student();
       Student two = one;              
     //   when two objects have same refeence change in one does change in other
       two.changeName("two - 2");
       one.greet();
        
    }
}
