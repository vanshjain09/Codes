public class functions_2Shaddowing {
int x=90; // This global x is shadowed by creating same name variable
public static void main(String[] args) {
System.out.println(90);
int x=80;
System.out.println(x);
System.out.println(print(x));


myName("vansh",5);
}


static int print(int x){
    return x;
}
static void myName(String s){ 
    System.out.println(s);
}// function overloading two function --> same name but differ with arguements
static void myName(String w,int a){
    System.out.println(w+a);
}
}
