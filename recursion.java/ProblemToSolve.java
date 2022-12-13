/*try to understand what we have to do in recursion
we want to create a function which print hello 4 times but
called only 1 time and print statement is of 1 line
 */
public class ProblemToSolve {
public static void main(String[] args) {
    message1();
    num(1);
}

static void message1(){
    System.out.println("Heloo");
    message2();
}
static void message2(){
    System.out.println("Heloo");
    message3();
}
static void message3(){
    System.out.println("Heloo");
    message4();
}
static void message4(){
    System.out.println("Heloo");
}
//write a recursive func to print 5 first +ve consecutive no. 
static void num(int n){
    if(n>5) return;
    System.out.println(n);
    num(n+1); //if a func is calling again and again it will get into stack treated as separate call
}


    
}